CREATE TABLE P_USER(
ID NUMBER PRIMARY KEY,
NAME VARCHAR2(20) NOT NULL,
PWD VARCHAR2(32) NOT NULL
)
drop table P_user


CREATE TABLE P_CARD_RECORD(
ID NUMBER PRIMARY KEY,
PID NUMBER NOT NULL,
CREATE_TIME timestamp
)

CREATE TABLE P_USER(
ID NUMBER PRIMARY KEY,
sno number not null,
NAME VARCHAR2(20) NOT NULL,
PWD VARCHAR2(32) NOT NULL
)

create sequence seq_p_user start with 1 increment by 1;
create sequence seq_p_card start with 1 increment by 1;



select * from p_user

--现在的用户表结构
CREATE TABLE P_USER(
ID NUMBER PRIMARY KEY,
sno number not null,
NAME VARCHAR2(20) NOT NULL,
PWD VARCHAR2(200) NOT NULL
)

drop table P_CARD_RECORD


--现在的打卡记录表结构
CREATE TABLE P_CARD_RECORD(
ID NUMBER PRIMARY KEY,
PID NUMBER NOT NULL,
CREATE_TIME varchar(20),
address varchar2(200) not null,
heat number(3) not null,
trip_code number not null,
health_code number not null
)

select * from P_CARD_RECORD where pid=88888888
insert into P_CARD_RECORD(id,pid,CREATE_TIME,address,heat,trip_code,health_code)values(seq_p_card.nextval,0,to_timestamp('','yyyy-MM-dd'),'重庆合川',36.8,0,0)

select * from t_bloggercontent

insert into P_CARD_RECORD(id,pid,CREATE_TIME,address,heat,trip_code,health_code)values(seq_p_card.nextval,12,'2022-03-28','重庆合川',23.2,0,0)

select pu.name name,pc.address address,pc.CREATE_TIME time,heat,trip_code,health_code
from P_CARD_RECORD pc inner join p_user pu
                                 on pc.pid=pu.sno and pu.sno=12
