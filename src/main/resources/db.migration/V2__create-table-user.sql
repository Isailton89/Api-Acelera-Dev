create table users(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    data_nascimento varchar(100) not null,
    cpf varchar(11) not null unique,
    cep varchar(8) not null,

    primary key(id)

);