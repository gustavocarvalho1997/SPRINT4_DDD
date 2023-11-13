# SPRINT4_DDD

## Nomes

Gustavo Carvalho - RM 552466


Ronald de Oliveira - RM 552364


Nicoly Oliveira - RM 552410


Nicolly de Almeida - RM 552579


Vitor Teixeira - RM 552228



## Descrição

Api feita em Java para ser utilizada no desafio da Porto Seguro. A api está desempenhando a função de recuperar as informações do cliente e, de certa forma, autentica-lo.

## Resource

A camada resource fica responsável por tratar as requisições nos endpoints e, caso seja necessário, devolver as exceções com a mensagem do por quê ocorreram.

## Service

Na camada service serão feitas as validações, principalmente em relação a verificar se o que está sendo acessado pertence ou não ao cliente dono das credenciais fornecidas.

## DAO

É a camada que vai usar os Statements e fazer o acesso ao banco de dados.

# Fluxo de funcionamento

Para todos os endpoints que retornam alguma informação que pertencem ao cliente, a api irá solicitar as credenciais (email, senha) do cliente, para simular esse processo de autenticar, foi utilizada Basic Auth, encaminhando pelo Header da request as credenciais em base 64 e, após recebida no Java, será feito o decode dessas credenciais antes que de fato seja feita alguma consulta no banco.

# Endpoints

Verbo: GET
Endpoint: http://localhost:8080/PortoApi/api/guinchos
Descrição: Retorna uma lista com todos os guinchos disponíveis no cadastro 
do banco de dados.
Precisa de credenciais (email, senha): Não.


Verbo: GET
Endpoint: http://localhost:8080/PortoApi/api/guinchos/{id}
Descrição: Retorna um guincho específico conforme id fornecido.
Precisa de credenciais (email, senha): Não.


Verbo: GET
Endpoint: http://localhost:8080/PortoApi/api/cliente
Descrição: Com base nas credenciais fornecidas, é localizado o cliente no 
banco de dados e retornado o mesmo com as suas informações básicas e os 
ids referente a endereço e plano de seguro caso para que se possa buscar 
essas informações no banco caso necessário.
Precisa de credenciais (email, senha): Sim.


Verbo: GET
Endpoint: http://localhost:8080/PortoApi/api/endereco/{id}
Descrição: Irá buscar o endereço com base no id informado na url, e irá utilizar 
as credenciais para verificar se o endereço que está sendo solicitado pertence 
ou não ao cliente que tem essas credenciais.
Precisa de credenciais (email, senha): Sim.


Verbo: GET
Endpoint: http://localhost:8080/PortoApi/api/plano/{id}
Descrição: Irá buscar o plano com base no id informado na url, e irá utilizar as 
credenciais para verificar se o plano que está sendo solicitado pertence ou não 
ao cliente que tem essas credenciais.
Precisa de credenciais (email, senha): Sim.

Verbo: GET
Endpoint: http://localhost:8080/PortoApi/api/caminhao
Descrição: Com base nas credenciais informadas, irá buscar todos os veículos 
que estão vinculados a esse cliente e retornar uma lista contendo-os.
Precisa de credenciais (email, senha): Sim.
