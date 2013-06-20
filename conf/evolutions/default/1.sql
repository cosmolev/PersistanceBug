# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table language (
  id                        integer not null,
  code                      varchar(255),
  constraint pk_language primary key (id))
;

create table phrase (
  id                        integer not null,
  word_id                   integer,
  constraint pk_phrase primary key (id))
;

create table word (
  id                        integer not null,
  language_id               integer,
  constraint pk_word primary key (id))
;

create sequence language_seq;

create sequence phrase_seq;

create sequence word_seq;

alter table phrase add constraint fk_phrase_word_1 foreign key (word_id) references word (id) on delete restrict on update restrict;
create index ix_phrase_word_1 on phrase (word_id);
alter table word add constraint fk_word_language_2 foreign key (language_id) references language (id) on delete restrict on update restrict;
create index ix_word_language_2 on word (language_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists language;

drop table if exists phrase;

drop table if exists word;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists language_seq;

drop sequence if exists phrase_seq;

drop sequence if exists word_seq;

