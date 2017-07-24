--liquibase formatted sql

--changeset clark:create-region
create table region (
    id int primary key,
    name varchar(80) not null
);

--changeset clark:insert-region-1
insert into region (id, name) values (1, '西南');
insert into region (id, name) values (2, '东北');
