drop table if exists user;

create Table user(
	empid int primary key auto_increment,
	emp_username varchar(50) not null,
	emp_password varchar(50) not null
	);
    

insert into user(empid,emp_username,emp_password) values (1,'Jishnu','jishnu123');
insert into user(empid,emp_username,emp_password) values (2,'Divya','divya123');
insert into user(empid,emp_username,emp_password) values (3,'Swetha','swetha123');
insert into user(empid,emp_username,emp_password) values (4,'Bhanu','bhanu123');
insert into user(empid,emp_username,emp_password) values (5,'Adesh','adesh123');