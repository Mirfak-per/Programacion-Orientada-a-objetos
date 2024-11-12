alter session set "_ORACLE_SCRIPT" = true;


create user BDtest IDENTIFIED by BDtest;

grant all PRIVILEGES to BDtest;
