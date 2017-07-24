--liquibase formatted sql

--changeset clark:create-region
create table region (
    id int primary key,
    name varchar(80) not null
);
--rollback drop table region;

--changeset clark:insert-region-1
insert into region (id, name) values (1, '华北');
insert into region (id, name) values (2, '华难');
--rollback delete from region where id in (1, 2);

-- --changeset clark:insert-region-2
-- update region set name='华南' where id = 2;
-- insert into region (id, name) values (3, '华东');
-- insert into region (id, name) values (4, '西南');
-- insert into region (id, name) values (5, '东北');
