alter table CARSWIRE_MODEL add constraint FK_CARSWIRE_MODEL_ON_BRAND foreign key (BRAND_ID) references CARSWIRE_MODEL(ID);
create index IDX_CARSWIRE_MODEL_ON_BRAND on CARSWIRE_MODEL (BRAND_ID);
