-- begin CARSWIRE_BRAND
create table CARSWIRE_BRAND (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end CARSWIRE_BRAND
-- begin CARSWIRE_MODEL
create table CARSWIRE_MODEL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    YEAR_FROM integer,
    YEAR_TO varchar(255),
    BRAND_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CARSWIRE_MODEL
