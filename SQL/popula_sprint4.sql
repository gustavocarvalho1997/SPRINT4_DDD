--ADICIONANDO OS INSERTS 
-- Inserts da tabela t_ieee_estado
INSERT INTO t_ieee_estado (id_estado, sg_estado, nm_estado, dt_cadastro)
VALUES (1, 'SP', 'São Paulo', SYSDATE);

INSERT INTO t_ieee_estado (id_estado, sg_estado, nm_estado, dt_cadastro)
VALUES (2, 'RJ', 'Rio de Janeiro', SYSDATE);

INSERT INTO t_ieee_estado (id_estado, sg_estado, nm_estado, dt_cadastro)
VALUES (3, 'MG', 'Minas Gerais', SYSDATE);

INSERT INTO t_ieee_estado (id_estado, sg_estado, nm_estado, dt_cadastro)
VALUES (4, 'ES', 'Espirito Santo', SYSDATE);

INSERT INTO t_ieee_estado (id_estado, sg_estado, nm_estado, dt_cadastro)
VALUES (5, 'GO', 'Goiás', SYSDATE);

INSERT INTO t_ieee_estado (id_estado, sg_estado, nm_estado, dt_cadastro)
VALUES (6, 'PR', 'Paraná', SYSDATE);

INSERT INTO t_ieee_estado (id_estado, sg_estado, nm_estado, dt_cadastro)
VALUES (7, 'SC', 'Santa Catarina', SYSDATE);

INSERT INTO t_ieee_estado (id_estado, sg_estado, nm_estado, dt_cadastro)
VALUES (8, 'RS', 'Rio Grande do Sul', SYSDATE);

INSERT INTO t_ieee_estado (id_estado, sg_estado, nm_estado, dt_cadastro)
VALUES (9, 'BA', 'Bahia', SYSDATE);

INSERT INTO t_ieee_estado (id_estado, sg_estado, nm_estado, dt_cadastro)
VALUES (10, 'PE', 'Pernambuco', SYSDATE);


-- Inserts da tabela t_ieee_cidade
INSERT INTO t_ieee_cidade (id_cidade, id_estado, nm_cidade, nr_ddd, dt_cadastro)
VALUES (1, 1, 'São Paulo', 11, SYSDATE);

INSERT INTO t_ieee_cidade (id_cidade, id_estado, nm_cidade, nr_ddd, dt_cadastro)
VALUES (2, 2, 'Rio de Janeiro', 21, SYSDATE);

INSERT INTO t_ieee_cidade (id_cidade, id_estado, nm_cidade, nr_ddd, dt_cadastro)
VALUES (3, 3, 'Belo Horizonte', 31, SYSDATE);

INSERT INTO t_ieee_cidade (id_cidade, id_estado, nm_cidade, nr_ddd, dt_cadastro)
VALUES (4, 4, 'Vitória', 27, SYSDATE);

INSERT INTO t_ieee_cidade (id_cidade, id_estado, nm_cidade, nr_ddd, dt_cadastro)
VALUES (5, 5, 'Goiânia', 62, SYSDATE);

INSERT INTO t_ieee_cidade (id_cidade, id_estado, nm_cidade, nr_ddd, dt_cadastro)
VALUES (6, 6, 'Curitiba', 41, SYSDATE);

INSERT INTO t_ieee_cidade (id_cidade, id_estado, nm_cidade, nr_ddd, dt_cadastro)
VALUES (7, 7, 'Florianópolis', 48, SYSDATE);

INSERT INTO t_ieee_cidade (id_cidade, id_estado, nm_cidade, nr_ddd, dt_cadastro)
VALUES (8, 8, 'Porto Alegre', 51, SYSDATE);

INSERT INTO t_ieee_cidade (id_cidade, id_estado, nm_cidade, nr_ddd, dt_cadastro)
VALUES (9, 9, 'Salvador', 71, SYSDATE);

INSERT INTO t_ieee_cidade (id_cidade, id_estado, nm_cidade, nr_ddd, dt_cadastro)
VALUES (10, 10, 'Recife', 81, SYSDATE);



-- Inserts da tabela t_ieee_bairro
INSERT INTO t_ieee_bairro (id_bairro, id_cidade, nm_bairro, nm_zona, dt_cadastro)
VALUES (1, 1, 'Santana', 'Zona Norte', SYSDATE);

INSERT INTO t_ieee_bairro (id_bairro, id_cidade, nm_bairro, nm_zona, dt_cadastro)
VALUES (2, 1, 'Pinheiros', 'Zona Oeste', SYSDATE);

INSERT INTO t_ieee_bairro (id_bairro, id_cidade, nm_bairro, nm_zona, dt_cadastro)
VALUES (3, 1, 'República', 'Zona Central', SYSDATE);

INSERT INTO t_ieee_bairro (id_bairro, id_cidade, nm_bairro, nm_zona, dt_cadastro)
VALUES (4, 1, 'Tatuapé', 'Zona Leste', SYSDATE);

INSERT INTO t_ieee_bairro (id_bairro, id_cidade, nm_bairro, nm_zona, dt_cadastro)
VALUES (5, 1, 'Morumbi', 'Zona Sul', SYSDATE);

INSERT INTO t_ieee_bairro (id_bairro, id_cidade, nm_bairro, nm_zona, dt_cadastro)
VALUES (6, 2, 'Copacabana', 'Zona Sul', SYSDATE);

INSERT INTO t_ieee_bairro (id_bairro, id_cidade, nm_bairro, nm_zona, dt_cadastro)
VALUES (7, 2, 'Tijuca', 'Zona Norte', SYSDATE);

INSERT INTO t_ieee_bairro (id_bairro, id_cidade, nm_bairro, nm_zona, dt_cadastro)
VALUES (8, 2, 'Lapa', 'Zona Central', SYSDATE);

INSERT INTO t_ieee_bairro (id_bairro, id_cidade, nm_bairro, nm_zona, dt_cadastro)
VALUES (9, 2, 'Saúde', 'Zona Leste', SYSDATE);

INSERT INTO t_ieee_bairro (id_bairro, id_cidade, nm_bairro, nm_zona, dt_cadastro)
VALUES (10, 2, 'Barra da Tijuca', 'Zona Oeste', SYSDATE);


-- inserts na tabela t_ieee_logradouro
INSERT INTO t_ieee_logradouro (id_logradouro, id_bairro, nm_logradouro, nr_cep, dt_cadastro)
VALUES (1, 1, 'Rua Alfredo Pujol', 02017000, SYSDATE);

INSERT INTO t_ieee_logradouro (id_logradouro, id_bairro, nm_logradouro, nr_cep, dt_cadastro)
VALUES (2, 2, 'Rua dos Pinheiros', 05422002, SYSDATE);

INSERT INTO t_ieee_logradouro (id_logradouro, id_bairro, nm_logradouro, nr_cep, dt_cadastro)
VALUES (3, 3, 'Rua da Consolação', 01301000, SYSDATE);

INSERT INTO t_ieee_logradouro (id_logradouro, id_bairro, nm_logradouro, nr_cep, dt_cadastro)
VALUES (4, 4, 'Rua Tuiuti', 03081000, SYSDATE);

INSERT INTO t_ieee_logradouro (id_logradouro, id_bairro, nm_logradouro, nr_cep, dt_cadastro)
VALUES (5, 5, 'Avenida Giovanni Gronchi', 05724003, SYSDATE);

INSERT INTO t_ieee_logradouro (id_logradouro, id_bairro, nm_logradouro, nr_cep, dt_cadastro)
VALUES (6, 6, 'Rua Barata Ribeiro', 22011002, SYSDATE);

INSERT INTO t_ieee_logradouro (id_logradouro, id_bairro, nm_logradouro, nr_cep, dt_cadastro)
VALUES (7, 7, 'Rua Conde de Bonfim', 20520053, SYSDATE);

INSERT INTO t_ieee_logradouro (id_logradouro, id_bairro, nm_logradouro, nr_cep, dt_cadastro)
VALUES (8, 8, 'Rua do Lavradio', 20230070, SYSDATE);

INSERT INTO t_ieee_logradouro (id_logradouro, id_bairro, nm_logradouro, nr_cep, dt_cadastro)
VALUES (9, 9, 'Rua Dona Maria', 20541030, SYSDATE);

INSERT INTO t_ieee_logradouro (id_logradouro, id_bairro, nm_logradouro, nr_cep, dt_cadastro)
VALUES (10, 10, 'Avenida Ayrton Senna', 22775004, SYSDATE);



--inserts na tabela t_ieee_plano_de_seguro
INSERT INTO t_ieee_plano_de_seguro (id_plano_de_seguro, tp_seguro, ds_cobertura, dt_contrato, tp_vinculo)
VALUES (1, 'Seguro de Guincho para Caminhões', 'reboque, assistência mecânica, combustível, travamento de chaves e outros', SYSDATE, 'Vinculo de Veículo');

INSERT INTO t_ieee_plano_de_seguro (id_plano_de_seguro, tp_seguro, ds_cobertura, dt_contrato, tp_vinculo)
VALUES (2, 'Seguro de Guincho Básico', 'Reboque e problemas mecânicos', SYSDATE, 'Vinculo de Veículo');

INSERT INTO t_ieee_plano_de_seguro (id_plano_de_seguro, tp_seguro, ds_cobertura, dt_contrato, tp_vinculo)
VALUES (3, 'Seguro de Guincho de Emergência', 'assistência imediata de guincho em situações de emergência, como acidentes graves', SYSDATE, 'Vinculo de Veículo');

INSERT INTO t_ieee_plano_de_seguro (id_plano_de_seguro, tp_seguro, ds_cobertura, dt_contrato, tp_vinculo)
VALUES (4, 'Seguro de Guincho para Veículos Recreativos', 'assistência em caso de quebras ou problemas na estrada', SYSDATE, 'Vinculo de Veículo');

INSERT INTO t_ieee_plano_de_seguro (id_plano_de_seguro, tp_seguro, ds_cobertura, dt_contrato, tp_vinculo)
VALUES (5, 'Seguro de Guincho para Motocicletas', 'assistência em caso de pane ou acidentes', SYSDATE, 'Vinculo de Veículo');

INSERT INTO t_ieee_plano_de_seguro (id_plano_de_seguro, tp_seguro, ds_cobertura, dt_contrato, tp_vinculo)
VALUES (6, 'Seguro de Guincho para Viagens', ' reboque de longa distância', SYSDATE, 'Vinculo de Veículo');

INSERT INTO t_ieee_plano_de_seguro (id_plano_de_seguro, tp_seguro, ds_cobertura, dt_contrato, tp_vinculo)
VALUES (7, 'Seguro de Guincho para Empresas', 'cobertura de guincho e assistência para veículos comerciais.', SYSDATE, 'Vinculo de Veículo');


-- Inserts da tabela t_ieee_endereco
INSERT INTO t_ieee_endereco (id_endereco, id_logradouro, nr_logradouro, ds_num_complemento, ds_ponto_referencia,  dt_cadastro)
VALUES (1, 1, 4, 'Apto 4B', 'Bloco B', SYSDATE);

INSERT INTO t_ieee_endereco (id_endereco, id_logradouro, nr_logradouro, ds_num_complemento, ds_ponto_referencia,  dt_cadastro)
VALUES (2, 2, 1530, 'n 1530', 'Próximo a Drogasil', SYSDATE);

INSERT INTO t_ieee_endereco (id_endereco, id_logradouro, nr_logradouro, ds_num_complemento, ds_ponto_referencia,  dt_cadastro)
VALUES (3, 3, 390, 'n 390', 'Próximo ao Carrefour', SYSDATE);

INSERT INTO t_ieee_endereco (id_endereco, id_logradouro, nr_logradouro, ds_num_complemento, ds_ponto_referencia,  dt_cadastro)
VALUES (4, 4, 650, 'n 650', 'Próximo ao Posto de Saúde', SYSDATE);

INSERT INTO t_ieee_endereco (id_endereco, id_logradouro, nr_logradouro, ds_num_complemento, ds_ponto_referencia,  dt_cadastro)
VALUES (5, 5, 540, 'Apto 540C', 'Bloco C', SYSDATE);

INSERT INTO t_ieee_endereco (id_endereco, id_logradouro, nr_logradouro, ds_num_complemento, ds_ponto_referencia,  dt_cadastro)
VALUES (6, 6, 765, 'Apto 765A', 'Bloco A', SYSDATE);

INSERT INTO t_ieee_endereco (id_endereco, id_logradouro, nr_logradouro, ds_num_complemento, ds_ponto_referencia,  dt_cadastro)
VALUES (7, 7, 525, 'n 525', 'Próximo ao Kalunga', SYSDATE);

INSERT INTO t_ieee_endereco (id_endereco, id_logradouro, nr_logradouro, ds_num_complemento, ds_ponto_referencia,  dt_cadastro)
VALUES (8, 8, 7545, 'n 7545', 'Próximo ao McDonalds', SYSDATE);

INSERT INTO t_ieee_endereco (id_endereco, id_logradouro, nr_logradouro, ds_num_complemento, ds_ponto_referencia,  dt_cadastro)
VALUES (9, 9, 120, 'Apto 120A', 'Bloco A', SYSDATE);

INSERT INTO t_ieee_endereco (id_endereco, id_logradouro, nr_logradouro, ds_num_complemento, ds_ponto_referencia,  dt_cadastro)
VALUES (10, 10, 775, 'Apto 775D', 'Bloco D', SYSDATE);

-- Inserts na tabela t_ieee_cliente
INSERT INTO t_ieee_cliente (id_cliente, id_plano_de_seguro, nr_cpf, nm_pessoa, ds_email, ds_senha, dt_nascimento, fl_sexo_biologico, id_endereco)
VALUES (1, 1, '42679183502', 'Maria da Silva', 'SilvMaria@gmail.com','Maria123',TO_DATE('1990-05-02', 'YYYY-MM-DD'),'F', 1);

INSERT INTO t_ieee_cliente (id_cliente, id_plano_de_seguro, nr_cpf, nm_pessoa, ds_email,ds_senha, dt_nascimento, fl_sexo_biologico, id_endereco)
VALUES (2, 2, '85749321608', 'Ana Santos', 'SantAna@gmail.com','Santos555',TO_DATE('1995-04-14', 'YYYY-MM-DD'), 'F', 2);

INSERT INTO t_ieee_cliente (id_cliente, id_plano_de_seguro, nr_cpf, nm_pessoa, ds_email, ds_senha, dt_nascimento, fl_sexo_biologico, id_endereco)
VALUES (3, 3, '61924850736', 'Luana Pereira', 'PereiLuana@gmail.com','LuanaP12',TO_DATE('1997-03-18', 'YYYY-MM-DD'), 'F', 3);

INSERT INTO t_ieee_cliente (id_cliente, id_plano_de_seguro, nr_cpf, nm_pessoa, ds_email, ds_senha, dt_nascimento, fl_sexo_biologico, id_endereco)
VALUES (4, 3, '50397218645', 'Isabela Barbosa', 'BarbIsabela@gmail.com','Barb159',TO_DATE('1980-02-13', 'YYYY-MM-DD'), 'F', 4);

INSERT INTO t_ieee_cliente (id_cliente, id_plano_de_seguro, nr_cpf, nm_pessoa, ds_email, ds_senha, dt_nascimento, fl_sexo_biologico, id_endereco)
VALUES (5, 2, '26489013759', 'Juliana Oliveira', 'OlivJuliana@gmail.com','Juli321',TO_DATE('1991-01-05', 'YYYY-MM-DD'), 'F', 5);

INSERT INTO t_ieee_cliente (id_cliente, id_plano_de_seguro, nr_cpf, nm_pessoa, ds_email, ds_senha, dt_nascimento, fl_sexo_biologico, id_endereco)
VALUES (6, 1, '78534261908', 'João Souza', 'SouzJoao@gmail.com','jojo1355',TO_DATE('1992-12-16', 'YYYY-MM-DD'), 'M', 6);

INSERT INTO t_ieee_cliente (id_cliente, id_plano_de_seguro, nr_cpf, nm_pessoa, ds_email, ds_senha, dt_nascimento, fl_sexo_biologico, id_endereco)
VALUES (7, 1, '93015624877', 'Marcos Ferreira', 'FerrMarcos@gmail.com','Marcos1993',TO_DATE('1993-11-22', 'YYYY-MM-DD'), 'M', 7);

INSERT INTO t_ieee_cliente (id_cliente, id_plano_de_seguro, nr_cpf, nm_pessoa, ds_email, ds_senha, dt_nascimento, fl_sexo_biologico, id_endereco)
VALUES (8, 1, '37298546101', 'Lucas Cardoso', 'CardLucas@gmail.com','Card1994',TO_DATE('1994-10-25', 'YYYY-MM-DD'), 'M', 8);

INSERT INTO t_ieee_cliente (id_cliente, id_plano_de_seguro, nr_cpf, nm_pessoa, ds_email, ds_senha, dt_nascimento, fl_sexo_biologico, id_endereco)
VALUES (9, 1, '15079682453', 'Matheus Rodrigues', 'RodrMatheus@gmail.com','MatheusR654',TO_DATE('1999-09-30', 'YYYY-MM-DD'), 'M', 9);

INSERT INTO t_ieee_cliente (id_cliente, id_plano_de_seguro, nr_cpf, nm_pessoa, ds_email, ds_senha, dt_nascimento, fl_sexo_biologico, id_endereco)
VALUES (10, 2, '64821039757', 'André Costa', 'CostAndre@gmail.com','Costa1898',TO_DATE('1989-08-05', 'YYYY-MM-DD'), 'M', 10);

INSERT INTO t_ieee_cliente (id_cliente, id_plano_de_seguro, nr_cpf, nm_pessoa, ds_email,ds_senha, dt_nascimento, fl_sexo_biologico, id_endereco)
VALUES (11, 2, '35521039757', 'Marcio Souza', 'SouzMarc@gmail.com','Marcio0207',TO_DATE('1999-07-02', 'YYYY-MM-DD'), 'M', 10);

INSERT INTO t_ieee_cliente (id_cliente, id_plano_de_seguro, nr_cpf, nm_pessoa, ds_email, ds_senha, dt_nascimento, fl_sexo_biologico, id_endereco)
VALUES (12, 2, '477354349632', 'Valéria Almeida', 'AlmValeria@gmail.com','Almeida2002',TO_DATE('2002-03-12', 'YYYY-MM-DD'), 'F', 9);


-- inserts na tabela t_ieee_veiculo
INSERT INTO t_ieee_veiculo (id_veiculo, cd_renavam, nm_modelo, tp_chassi, dt_veiculo, nr_altura, nr_comprimento, nr_largura, nm_cor)
VALUES (1, '15655262731', 'Scania R-Series', 'Longarina', TO_DATE('2005', 'YYYY'), 3.8, 12, 2.5, 'Preto');

INSERT INTO t_ieee_veiculo (id_veiculo, cd_renavam, nm_modelo, tp_chassi, dt_veiculo, nr_altura, nr_comprimento, nr_largura, nm_cor)
VALUES (2, '63051059531', 'Volvo FH', 'Longarina', TO_DATE('2010', 'YYYY'), 3.6, 11.5, 2.6, 'Branco');

INSERT INTO t_ieee_veiculo (id_veiculo, cd_renavam, nm_modelo, tp_chassi, dt_veiculo, nr_altura, nr_comprimento, nr_largura, nm_cor)
VALUES (3, '60844639340', 'Mercedes-Benz Actros', 'Longarina', TO_DATE('2023', 'YYYY'), 3.7, 12.2, 2.7, 'Prata');

INSERT INTO t_ieee_veiculo (id_veiculo, cd_renavam, nm_modelo, tp_chassi, dt_veiculo, nr_altura, nr_comprimento, nr_largura, nm_cor)
VALUES (4, '16611558153', 'MAN TGX', 'Longarina', TO_DATE('2020', 'YYYY'), 3.9, 12.5, 2.8, 'Vermelho');

INSERT INTO t_ieee_veiculo (id_veiculo, cd_renavam, nm_modelo, tp_chassi, dt_veiculo, nr_altura, nr_comprimento, nr_largura, nm_cor)
VALUES (5, '56484086672', 'Kenworth W900', 'Longarina', TO_DATE('2015', 'YYYY'), 4, 13, 3, 'Cinza');

INSERT INTO t_ieee_veiculo (id_veiculo, cd_renavam, nm_modelo, tp_chassi, dt_veiculo, nr_altura, nr_comprimento, nr_largura, nm_cor)
VALUES (6, '08661544724', 'DAF XF', 'Longarina', TO_DATE('2023', 'YYYY'), 3.5, 12.8, 2.8, 'Azul');

INSERT INTO t_ieee_veiculo (id_veiculo, cd_renavam, nm_modelo, tp_chassi, dt_veiculo, nr_altura, nr_comprimento, nr_largura, nm_cor)
VALUES (7, '37373406060', 'Iveco Stralis', 'Longarina', TO_DATE('2022', 'YYYY'), 3.7, 11.9, 2.6, 'Preto');

INSERT INTO t_ieee_veiculo (id_veiculo, cd_renavam, nm_modelo, tp_chassi, dt_veiculo, nr_altura, nr_comprimento, nr_largura, nm_cor)
VALUES (8, '28312808836', 'Freightliner Cascadi', 'Longarina', TO_DATE('2019', 'YYYY'), 3.8, 13.5, 2.8, 'Cinza');

INSERT INTO t_ieee_veiculo (id_veiculo, cd_renavam, nm_modelo, tp_chassi, dt_veiculo, nr_altura, nr_comprimento, nr_largura, nm_cor)
VALUES (9, '81720374789', 'Mack Anthem', 'Longarina', TO_DATE('2021', 'YYYY'), 3.6, 12.2, 2.7, 'Vermelho');

INSERT INTO t_ieee_veiculo (id_veiculo, cd_renavam, nm_modelo, tp_chassi, dt_veiculo, nr_altura, nr_comprimento, nr_largura, nm_cor)
VALUES (10, '22153881942', 'Ford Cargo', 'Longarina', TO_DATE('2002', 'YYYY'), 3.5, 11.5, 2.5, 'Laranja');


--inserts na tabela t_ieee_veiculo_cliente
INSERT INTO t_ieee_veiculo_cliente (id_veiculo_cliente, dt_associacao, id_veiculo, id_cliente)
VALUES (1, TO_DATE('2023-05-29', 'YYYY-MM-DD'), 1, 1);

INSERT INTO t_ieee_veiculo_cliente (id_veiculo_cliente, dt_associacao, id_veiculo, id_cliente)
VALUES (2, TO_DATE('2023-12-17', 'YYYY-MM-DD'), 2, 2);

INSERT INTO t_ieee_veiculo_cliente (id_veiculo_cliente, dt_associacao, id_veiculo, id_cliente)
VALUES (3, TO_DATE('2023-11-09', 'YYYY-MM-DD'), 3, 3);

INSERT INTO t_ieee_veiculo_cliente (id_veiculo_cliente, dt_associacao, id_veiculo, id_cliente)
VALUES (4, TO_DATE('2023-07-02', 'YYYY-MM-DD'), 4, 4);

INSERT INTO t_ieee_veiculo_cliente (id_veiculo_cliente, dt_associacao, id_veiculo, id_cliente)
VALUES (5, TO_DATE('2023-02-15', 'YYYY-MM-DD'), 5, 5);

INSERT INTO t_ieee_veiculo_cliente (id_veiculo_cliente, dt_associacao, id_veiculo, id_cliente)
VALUES (6, TO_DATE('2023-10-23', 'YYYY-MM-DD'), 6, 6);

INSERT INTO t_ieee_veiculo_cliente (id_veiculo_cliente, dt_associacao, id_veiculo, id_cliente)
VALUES (7, TO_DATE('2023-03-22', 'YYYY-MM-DD'), 7, 7);

INSERT INTO t_ieee_veiculo_cliente (id_veiculo_cliente, dt_associacao, id_veiculo, id_cliente)
VALUES (8, TO_DATE('2023-05-12', 'YYYY-MM-DD'), 8, 8);

INSERT INTO t_ieee_veiculo_cliente (id_veiculo_cliente, dt_associacao, id_veiculo, id_cliente)
VALUES (9, TO_DATE('2023-06-10', 'YYYY-MM-DD'), 9, 9);

INSERT INTO t_ieee_veiculo_cliente (id_veiculo_cliente, dt_associacao, id_veiculo, id_cliente)
VALUES (10, TO_DATE('2023-08-30', 'YYYY-MM-DD'), 10, 10);



-- Inserts da tabela t_ieee_caminhao
INSERT INTO t_ieee_caminhao (id_caminhao, id_veiculo, qt_eixos, qt_peso)
VALUES (1, 1, 3, 15);

INSERT INTO t_ieee_caminhao (id_caminhao, id_veiculo, qt_eixos, qt_peso)
VALUES (2, 2, 3, 14);

INSERT INTO t_ieee_caminhao (id_caminhao, id_veiculo, qt_eixos, qt_peso)
VALUES (3, 3, 4, 14.5);

INSERT INTO t_ieee_caminhao (id_caminhao, id_veiculo, qt_eixos, qt_peso)
VALUES (4, 4, 3, 16);

INSERT INTO t_ieee_caminhao (id_caminhao, id_veiculo, qt_eixos, qt_peso)
VALUES (5, 5, 4, 17.5);

INSERT INTO t_ieee_caminhao (id_caminhao, id_veiculo, qt_eixos, qt_peso)
VALUES (6, 6, 3, 15.8);

INSERT INTO t_ieee_caminhao (id_caminhao, id_veiculo, qt_eixos, qt_peso)
VALUES (7, 7, 3, 14.2);

INSERT INTO t_ieee_caminhao (id_caminhao, id_veiculo, qt_eixos, qt_peso)
VALUES (8, 8, 4, 16.5);

INSERT INTO t_ieee_caminhao (id_caminhao, id_veiculo, qt_eixos, qt_peso)
VALUES (9, 9, 4, 15.3);

INSERT INTO t_ieee_caminhao (id_caminhao, id_veiculo, qt_eixos, qt_peso)
VALUES (10, 10, 3, 13.2);



-- Inserts da tabela t_ieee_guincho
INSERT INTO t_ieee_guincho (id_guincho, id_veiculo, nr_max_toneladas, nr_max_comprimento, ds_guincho)
VALUES (1, 1, 18, 3, 'Guincho Plataforma');

INSERT INTO t_ieee_guincho (id_guincho, id_veiculo, nr_max_toneladas, nr_max_comprimento, ds_guincho)
VALUES (2, 2, 20, 3.5, 'Guincho Pesado');

INSERT INTO t_ieee_guincho (id_guincho, id_veiculo, nr_max_toneladas, nr_max_comprimento, ds_guincho)
VALUES (3, 3, 19, 5, 'Guincho Rotativo');

INSERT INTO t_ieee_guincho (id_guincho, id_veiculo, nr_max_toneladas, nr_max_comprimento, ds_guincho)
VALUES (4, 4, 22, 4.5, 'Guincho Articulado');

INSERT INTO t_ieee_guincho (id_guincho, id_veiculo, nr_max_toneladas, nr_max_comprimento, ds_guincho)
VALUES (5, 5, 20, 3, 'Guincho de Arraste');

INSERT INTO t_ieee_guincho (id_guincho, id_veiculo, nr_max_toneladas, nr_max_comprimento, ds_guincho)
VALUES (6, 6, 18, 5.5, 'Guincho Hidráulico');

INSERT INTO t_ieee_guincho (id_guincho, id_veiculo, nr_max_toneladas, nr_max_comprimento, ds_guincho)
VALUES (7, 7, 19, 4, 'Guincho de Cabo de Aço');

INSERT INTO t_ieee_guincho (id_guincho, id_veiculo, nr_max_toneladas, nr_max_comprimento, ds_guincho)
VALUES (8, 8, 21, 4, 'Guincho de Plataforma Deslizante');

INSERT INTO t_ieee_guincho (id_guincho, id_veiculo, nr_max_toneladas, nr_max_comprimento, ds_guincho)
VALUES (9, 9, 18, 5, 'Guincho de Reboque Articulado');

INSERT INTO t_ieee_guincho (id_guincho, id_veiculo, nr_max_toneladas, nr_max_comprimento, ds_guincho)
VALUES (10, 10, 20, 3.5, 'Guincho de Reboque de Braço Duplo');


-- Inserts da tabela t_ieee_chamado
INSERT INTO t_ieee_chamado (id_chamado, st_chamado, dt_ocorrencia,  ds_guincho, nm_endereco, id_veiculo)
VALUES (1, 'A', SYSDATE,  'Guincho Plataforma', 'Rua João da Silva, 1234', 1);

INSERT INTO t_ieee_chamado (id_chamado, st_chamado, dt_ocorrencia,  ds_guincho, nm_endereco, id_veiculo)
VALUES (2, 'A', SYSDATE,  'Guincho Pesado', 'Avenida das Flores, 567', 2);

INSERT INTO t_ieee_chamado (id_chamado, st_chamado, dt_ocorrencia,  ds_guincho, nm_endereco, id_veiculo)
VALUES (3, 'F', SYSDATE,  'Guincho Rotativo', 'Praça da Liberdade, 890', 3);

INSERT INTO t_ieee_chamado (id_chamado, st_chamado, dt_ocorrencia,  ds_guincho, nm_endereco, id_veiculo)
VALUES (4, 'A', SYSDATE,  'Guincho Articulado', 'Alameda dos Anjos, 432', 4);

INSERT INTO t_ieee_chamado (id_chamado, st_chamado, dt_ocorrencia,  ds_guincho, nm_endereco, id_veiculo)
VALUES (5, 'F', SYSDATE,  'Guincho de Arraste', 'Travessa do Sol, 567', 5);

INSERT INTO t_ieee_chamado (id_chamado, st_chamado, dt_ocorrencia,  ds_guincho, nm_endereco, id_veiculo)
VALUES (6, 'P', SYSDATE,  'Guincho Hidráulico', 'Avenida dos Ventos, 876', 6);

INSERT INTO t_ieee_chamado (id_chamado, st_chamado, dt_ocorrencia,  ds_guincho, nm_endereco, id_veiculo)
VALUES (7, 'A', SYSDATE,  'Guincho de Cabo de Aço', 'Rua das Palmeiras, 345', 7);

INSERT INTO t_ieee_chamado (id_chamado, st_chamado, dt_ocorrencia,  ds_guincho, nm_endereco, id_veiculo)
VALUES (8, 'P', SYSDATE,  'Guincho de Plataforma Deslizante', 'Praia da Esperança, 901', 8);

INSERT INTO t_ieee_chamado (id_chamado, st_chamado, dt_ocorrencia,  ds_guincho, nm_endereco, id_veiculo)
VALUES (9, 'A', SYSDATE,  'Guincho de Reboque Articulado', 'Alameda dos Girassóis, 234', 9);

INSERT INTO t_ieee_chamado (id_chamado, st_chamado, dt_ocorrencia,  ds_guincho, nm_endereco, id_veiculo)
VALUES (10, 'A', SYSDATE,  'Guincho de Reboque de Braço Duplo', 'Rua da Felicidade, 678', 10);

INSERT INTO t_ieee_chamado (id_chamado, st_chamado, dt_ocorrencia,  ds_guincho, nm_endereco, id_veiculo)
VALUES (11, 'F', TO_DATE('2020/07/15', 'YYYY/MM/DD'),  'Guincho de Reboque de Braço Duplo', 'Rua da Felicidade, 678', 10);

INSERT INTO t_ieee_chamado (id_chamado, st_chamado, dt_ocorrencia,  ds_guincho, nm_endereco, id_veiculo)
VALUES (12, 'F', TO_DATE('2021/12/05','YYYY/MM/DD'),  'Guincho Hidráulico', 'Rua Teodoro Sampaio, 537', 5);

COMMIT;