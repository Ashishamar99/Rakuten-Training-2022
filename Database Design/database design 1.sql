# create database db1;
use db1;
create table user(name varchar(25), age integer, dob date);
# Creating with primary key.
# create table user(userid integer, name varchar(25), age integer, dob date, primary key(userid));
select * from user;
# drop table user;