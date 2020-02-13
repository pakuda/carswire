create table CARSWIRE_MODEL (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    YEAR_FROM integer,
    YEAR_TO varchar(255),
    BRAND_ID varchar(32) not null,
    --
    primary key (ID)
);