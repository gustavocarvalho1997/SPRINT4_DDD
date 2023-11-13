--CRIANDO TABELA BAIRRO
CREATE TABLE t_ieee_bairro (
    id_bairro   INTEGER NOT NULL,
    id_cidade   INTEGER NOT NULL,
    nm_bairro   VARCHAR2(50) NOT NULL,
    nm_zona     VARCHAR2(20) NOT NULL,
    dt_cadastro DATE NOT NULL
);

ALTER TABLE t_ieee_bairro ADD CONSTRAINT t_bairro_pk PRIMARY KEY ( id_bairro );


--CRIANDO TABELA CAMINHÃƒO
CREATE TABLE t_ieee_caminhao (
    id_caminhao INTEGER NOT NULL,
    id_veiculo  INTEGER NOT NULL,
    qt_eixos    INTEGER NOT NULL,
    qt_peso     NUMBER NOT NULL
);

--CRIANDO CHAVE PRIMÃ?RIA
ALTER TABLE t_ieee_caminhao ADD CONSTRAINT pk_ieee_caminhao PRIMARY KEY ( id_caminhao, id_veiculo );

--CRIANDO TABELA CHAMADO
CREATE TABLE t_ieee_chamado (
    id_chamado    INTEGER NOT NULL,
    st_chamado    CHAR(1) NOT NULL,
    dt_ocorrencia DATE NOT NULL,
    ds_guincho    VARCHAR2(50) NOT NULL,
    nm_endereco   VARCHAR2(100) NOT NULL,
    id_veiculo    INTEGER NOT NULL
);

--CRIANDO CHECK CONSTRAINT 
ALTER TABLE t_ieee_chamado
    ADD CONSTRAINT ck_ieee_st_chamado CHECK ( st_chamado IN ( 'A', 'F', 'P' ) );


--CRIANDO CHAVE PRIMÃ?RIA
ALTER TABLE t_ieee_chamado ADD CONSTRAINT pk_ieee_chamado PRIMARY KEY ( id_chamado );


--CRIANDO TABELA CIDADE
CREATE TABLE t_ieee_cidade (
    id_cidade   INTEGER NOT NULL,
    id_estado   INTEGER NOT NULL,
    nm_cidade   VARCHAR2(50) NOT NULL,
    nr_ddd      INTEGER NOT NULL,
    dt_cadastro DATE NOT NULL
);

--CRIANDO CHAVE PRIMÃ?RIA
ALTER TABLE t_ieee_cidade ADD CONSTRAINT pk_ieee_cidade PRIMARY KEY ( id_cidade );

--CRIANDO TABELA CLIENTE
CREATE TABLE t_ieee_cliente (
    id_cliente         INTEGER NOT NULL,
    id_plano_de_seguro INTEGER NOT NULL,
    nr_cpf             VARCHAR2(14) NOT NULL,
    nm_pessoa          VARCHAR2(70) NOT NULL,
    ds_email           VARCHAR2(100) NOT NULL,
    ds_senha           VARCHAR2(15) NOT NULL,
    dt_nascimento      DATE,
    fl_sexo_biologico  CHAR(1),
    id_endereco        INTEGER NOT NULL
);

--CRIANDO CHECK CONSTRAINT

ALTER TABLE t_ieee_cliente
    ADD CONSTRAINT ck_sexo_biologico CHECK ( fl_sexo_biologico IN ( 'F', 'I', 'M' ) );

--CRIANDO CHAVE PRIMÃ?RIA
ALTER TABLE t_ieee_cliente ADD CONSTRAINT pk_ieee_cliente PRIMARY KEY ( id_cliente );

--CRIANDO UNIQUE CONSTRAINT
ALTER TABLE t_ieee_cliente ADD CONSTRAINT uk_ieee_cpf_cliente UNIQUE ( nr_cpf );

--CRIANDO TABELA ENDEREÃ‡O
CREATE TABLE t_ieee_endereco (
    id_endereco         INTEGER NOT NULL,
    id_logradouro       INTEGER NOT NULL,
    nr_logradouro       INTEGER NOT NULL,
    ds_num_complemento  VARCHAR2(30),
    ds_ponto_referencia VARCHAR2(50),
    dt_cadastro         DATE NOT NULL
);

--CRIANDO CHAVE PRIMÃ?RIA
ALTER TABLE t_ieee_endereco ADD CONSTRAINT pk_ieee_endereco PRIMARY KEY ( id_endereco );


--CRIANDO TABELA ESTADO
CREATE TABLE t_ieee_estado (
    id_estado   INTEGER NOT NULL,
    sg_estado   CHAR(2) NOT NULL,
    nm_estado   VARCHAR2(30) NOT NULL,
    dt_cadastro DATE NOT NULL
);

--CRIANDO CHAVE PRIMÃ?RIA
ALTER TABLE t_ieee_estado ADD CONSTRAINT pk_ieee_estado PRIMARY KEY ( id_estado );

--CRIANDO TABELA GUINCHO
CREATE TABLE t_ieee_guincho (
    id_guincho         INTEGER NOT NULL,
    id_veiculo         INTEGER NOT NULL,
    nr_max_toneladas   NUMBER NOT NULL,
    nr_max_comprimento NUMBER NOT NULL,
    ds_guincho         VARCHAR2(50) NOT NULL
);

--CRIANDO CHAVE PRIMÃ?RIA
ALTER TABLE t_ieee_guincho ADD CONSTRAINT pk_ieee_guincho PRIMARY KEY ( id_guincho,
                                                                     id_veiculo );


--CRIANDO TABELA LOGRADOURO
CREATE TABLE t_ieee_logradouro (
    id_logradouro INTEGER NOT NULL,
    id_bairro     INTEGER NOT NULL,
    nm_logradouro VARCHAR2(100) NOT NULL,
    nr_cep        INTEGER NOT NULL,
    dt_cadastro   DATE NOT NULL
);

--CRIANDO CHAVE PRIMÃ?RIA
ALTER TABLE t_ieee_logradouro ADD CONSTRAINT pk_ieee_logradouro PRIMARY KEY ( id_logradouro );


--CRIANDO TABELA PLANO DE SEGURO
CREATE TABLE t_ieee_plano_de_seguro (
    id_plano_de_seguro INTEGER NOT NULL,
    tp_seguro          VARCHAR2(20) NOT NULL,
    ds_cobertura       VARCHAR2(20) NOT NULL,
    dt_contrato        DATE NOT NULL,
    tp_vinculo         VARCHAR2(20) NOT NULL
);

--CRIANDO CHAVE PRIMÃ?RIA
ALTER TABLE t_ieee_plano_de_seguro ADD CONSTRAINT pk_ieee_plano_de_seguro PRIMARY KEY ( id_plano_de_seguro );


--CRIANDO TABELA VEICULO
CREATE TABLE t_ieee_veiculo (
    id_veiculo     INTEGER NOT NULL,
    cd_renavam     VARCHAR2(20) NOT NULL,
    nm_modelo      VARCHAR2(30) NOT NULL,
    tp_chassi      VARCHAR2(20) NOT NULL,
    dt_veiculo     DATE NOT NULL,
    nr_altura      NUMBER NOT NULL,
    nr_comprimento NUMBER NOT NULL,
    nr_largura     NUMBER NOT NULL,
    nm_cor         VARCHAR2(15)
);

--CRIANDO CHAVE PRIMÃ?RIA
ALTER TABLE t_ieee_veiculo ADD CONSTRAINT pk_ieee_veiculo PRIMARY KEY ( id_veiculo );

--CRIANDO UNIQUE CONSTRAINT
ALTER TABLE t_ieee_veiculo ADD CONSTRAINT uk_ieee_veiculo_renavam UNIQUE ( cd_renavam );

--CRIANDO TABELA VEICULO CLIENTE
CREATE TABLE t_ieee_veiculo_cliente (
    id_veiculo_cliente NUMBER NOT NULL,
    dt_associacao      DATE NOT NULL,
    id_veiculo         INTEGER NOT NULL,
    id_cliente         INTEGER NOT NULL
);

--CRIANDO CHAVE PRIMÃ?RIA
ALTER TABLE t_ieee_veiculo_cliente ADD CONSTRAINT pk_ieee_veiculo_cliente PRIMARY KEY ( id_veiculo_cliente );


--CRIANDO AS CHAVES ESTRANGEIRAS
ALTER TABLE t_ieee_logradouro
    ADD CONSTRAINT fk_bairro_logradouro FOREIGN KEY ( id_bairro )
        REFERENCES t_ieee_bairro ( id_bairro );

ALTER TABLE t_ieee_cidade
    ADD CONSTRAINT fk_estado_cidade FOREIGN KEY ( id_estado )
        REFERENCES t_ieee_estado ( id_estado );

ALTER TABLE t_ieee_chamado
    ADD CONSTRAINT fk_ieee_chamado_veiculo FOREIGN KEY ( id_veiculo )
        REFERENCES t_ieee_veiculo ( id_veiculo );

ALTER TABLE t_ieee_bairro
    ADD CONSTRAINT fk_ieee_cidade_bairro FOREIGN KEY ( id_cidade )
        REFERENCES t_ieee_cidade ( id_cidade );

ALTER TABLE t_ieee_cliente
    ADD CONSTRAINT fk_ieee_endereco_cliente FOREIGN KEY ( id_endereco )
        REFERENCES t_ieee_endereco ( id_endereco );

ALTER TABLE t_ieee_cliente
    ADD CONSTRAINT fk_ieee_pl_sgr_cliente FOREIGN KEY ( id_plano_de_seguro )
        REFERENCES t_ieee_plano_de_seguro ( id_plano_de_seguro );

ALTER TABLE t_ieee_caminhao
    ADD CONSTRAINT fk_ieee_vclo_caminhao FOREIGN KEY ( id_veiculo )
        REFERENCES t_ieee_veiculo ( id_veiculo );

ALTER TABLE t_ieee_guincho
    ADD CONSTRAINT fk_ieee_vclo_guincho FOREIGN KEY ( id_veiculo )
        REFERENCES t_ieee_veiculo ( id_veiculo );

ALTER TABLE t_ieee_endereco
    ADD CONSTRAINT fk_logradouro_endereco FOREIGN KEY ( id_logradouro )
        REFERENCES t_ieee_logradouro ( id_logradouro );

ALTER TABLE t_ieee_veiculo_cliente
    ADD CONSTRAINT fk_ieee_cliente_veiculo FOREIGN KEY ( id_veiculo )
        REFERENCES t_ieee_veiculo ( id_veiculo );

ALTER TABLE t_ieee_veiculo_cliente
    ADD CONSTRAINT fk_ieee_veiculo_cliente FOREIGN KEY ( id_cliente )
        REFERENCES t_ieee_cliente ( id_cliente );

--CRIANDO AS TRIGGERS
CREATE OR REPLACE TRIGGER arc_arc_1_t_ieee_guincho BEFORE
    INSERT OR UPDATE OF id_veiculo ON t_ieee_guincho
    FOR EACH ROW
DECLARE
    d INTEGER;
BEGIN
    SELECT
        a.id_veiculo
    INTO d
    FROM
        t_ieee_veiculo a
    WHERE
        a.id_veiculo = :new.id_veiculo;

    IF ( d IS NULL OR d <> :new.id_veiculo ) THEN
        raise_application_error(-20223, 'FK FK_IEEE_VCLO_GUINCHO in Table T_IEEE_GUINCHO violates Arc constraint on Table T_IEEE_VEICULO - discriminator column ID_VEICULO doesn''t have value ID_VEICULO'
        );
    END IF;

EXCEPTION
    WHEN no_data_found THEN
        NULL;
    WHEN OTHERS THEN
        RAISE;
END;
/

--CRIANDO AS TRIGGERS
CREATE OR REPLACE TRIGGER arc_arc_1_t_ieee_caminhao BEFORE
    INSERT OR UPDATE OF id_veiculo ON t_ieee_caminhao
    FOR EACH ROW
DECLARE
    d INTEGER;
BEGIN
    SELECT
        a.id_veiculo
    INTO d
    FROM
        t_ieee_veiculo a
    WHERE
        a.id_veiculo = :new.id_veiculo;

    IF ( d IS NULL OR d <> :new.id_veiculo ) THEN
        raise_application_error(-20223, 'FK FK_IEEE_VCLO_CAMINHAO in Table T_IEEE_CAMINHAO violates Arc constraint on Table T_IEEE_VEICULO - discriminator column ID_VEICULO doesn''t have value ID_VEICULO'
        );
    END IF;

EXCEPTION
    WHEN no_data_found THEN
        NULL;
    WHEN OTHERS THEN
        RAISE;
END;
/

--ALTERANDO TABELAS
ALTER TABLE t_ieee_plano_de_seguro
MODIFY tp_seguro VARCHAR2(50);

ALTER TABLE t_ieee_plano_de_seguro
MODIFY ds_cobertura VARCHAR2(200);

ALTER TABLE t_ieee_plano_de_seguro
MODIFY tp_vinculo VARCHAR2(50);

COMMIT;