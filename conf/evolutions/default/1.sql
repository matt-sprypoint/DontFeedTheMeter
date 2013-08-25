# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table meter_maid (
  location                  varchar(255),
  heading                   varchar(255),
  velocity                  varchar(255))
;

create table parking_location (
  contact_number            varchar(255),
  location                  varchar(255),
  start_time                timestamp)
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists meter_maid;

drop table if exists parking_location;

SET REFERENTIAL_INTEGRITY TRUE;

