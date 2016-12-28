create table tb_usuario(
id_usuario integer not null,
nome_usuario varchar(50) null,
sobrenome_usuario varchar(50) null,
login_usuario varchar(15) not null unique,
senha_usuario varchar(8) not null,

constraint pk_usuario
primary key(id_usuario)
);

create table tb_profissional(
id_profissional integer not null,
nome_profissional varchar(50) not null,
sobrenome_profissional varchar(50) not null,

constraint pk_profissional
primary key(id_profissional)
);

/*create table tb_endereco(
id_endereco integer not null,
logradouro_endereco varchar(100) not null,
bairro_endereco integer not null,
cidade_endereco integer not null,
constraint pk_endereco
primary key(id_endereco),

constraint fk_endereco_bairro foreign key(bairro_endereco)
references tb_bairro(id_bairro)

constraint fk_endereco_cidade foreign key(cidade_endereco)
references tb_cidade(id_cidade)
);
*/

create table tb_cidade(
id_cidade integer not null,
nome_cidade varchar(100) not null,
estado_cidade char(2) not null,
primary key (id_cidade)
)

create table tb_bairro(
id_bairro integer not null,
nome_bairro varchar(50) not null,

constraint pk_bairro 
primary key(id_bairro)
);


create table tb_cliente(
id_cliente integer not null,
nome_cliente varchar(50) not null,
sobrenome_cliente varchar(50) not null,
nascimento_cliente varchar(4) null,
telefone_cliente varchar(50) null,
email_cliente varchar(100) null,
rg_cliente varchar(50) not null unique,
cpf_cliente varchar(50) not null unique,
logradouro_cliente varchar(100) not null,
numero_endereco_cliente integer null,
bairro_cliente integer not null,
cidade_cliente integer not null,

constraint pk_cliente 
primary key(id_cliente),

constraint fk_bairro_cliente foreign key(bairro_cliente)
references tb_bairro(id_bairro),

constraint fk_cidade_cliente foreign key(cidade_cliente)
references tb_cidade(id_cidade)
);


create table tb_os(
id_os integer not null,
usuario_os varchar(100) not null,
cliente_os integer not null,
profissional_os integer not null,
data_entrada_os varchar(10) not null,
equipamento_os varchar(50) not null,
defeito_os varchar(200),
data_saida_os varchar(10),
valor_os numeric(5,2),
servico_os varchar(50),
situacao_os varchar(100) null,

constraint pk_os 
primary key(id_os),

constraint fk_cliente_os foreign key(cliente_os)
references tb_cliente(id_cliente),

constraint fk_profissional_os foreign key(profissional_os)
references tb_profissional(id_profissional)


/*Criando as views*/
create view vBairro as
select id_bairro ID, nome_bairro Bairro from tb_bairro

create view vCidade as 
select id_cidade ID, nome_cidade Cidade, estado_cidade Estado from tb_cidade

create view vCliente as
select C.id_cliente ID, C.nome_cliente Nome, C.sobrenome_cliente SOBRENOME, C.nascimento_cliente NASC, C.cpf_cliente CPF, C.rg_cliente RG,
C.telefone_cliente TEL, C.email_cliente EMAIL, C.logradouro_cliente ENDEREÇO, C.numero_endereco_cliente Nº, B.nome_bairro BAIRRO, Cid.nome_cidade CIDADE
from tb_cliente C, tb_bairro B, tb_cidade Cid where C.bairro_cliente = B.id_bairro and C.cidade_cliente = Cid.id_cidade

create view vOrdemServico as
select Os.id_os OS, Os.usuario_os ATENDENTE, P.nome_profissional PROFISSIONAL, C.nome_cliente || ' ' || C.sobrenome_cliente CLIENTE,
C.cpf_cliente CPF, Os.equipamento_os EQUIPAMENTO, Os.servico_os SERVIÇO, Os.valor_os VALOR,
Os.data_entrada_os ENTRADA, Os.data_saida_os SAÍDA, Os.situacao_os SITUAÇÃO, Os.defeito_os DEFEITO
from tb_os Os, tb_profissional P, tb_cliente C
where Os.profissional_os = P.id_profissional and Os.cliente_os = C.id_cliente

create view vProfissional as
select id_profissional Id, nome_profissional Nome, sobrenome_profissional Sobrenome from tb_profissional

create view vUsuario as
select id_usuario Id, nome_usuario Nome, sobrenome_usuario Sobrenome, login_usuario Login, senha_usuario Senha from tb_usuario

create view valorTotal as
select situacao_os as Situacao, data_saida_os as Entrega, sum(valor_os) as Valor from tb_os
group by (situacao_os, data_saida_os);


);