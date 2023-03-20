CREATE DATABASE "product";
create schema "product";

create table product.product_list
(
    "id"       BIGSERIAL PRIMARY KEY,
    "name"     varchar(255) COLLATE "pg_catalog"."default",
    "category" varchar(100) COLLATE "pg_catalog"."default",
    "code"     int8
)