drop database if exists `demo`;
create database `demo`;
use `demo`;

create table user
(
    id       int auto_increment
        primary key,
    name     varchar(20) null,
    password varchar(20) null
);

