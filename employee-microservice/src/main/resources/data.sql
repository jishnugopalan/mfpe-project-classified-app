drop table if exists liked_by;
drop table if exists offer;
drop table if exists employee;

create table Employee(
	id int primary key auto_increment,
    name varchar(50) not null,
    department varchar(50),
    gender varchar(6) not null,
    age int not null,
    contact_number bigint,
    email varchar(100) unique,
    points_gained int default 0,
    check (gender in ('male','female','other')),
    check ( age > 0 )
    );
    
create table Offer(
	id int primary key auto_increment,
    name varchar(50) not null,
    description varchar(100),
    category varchar(50) not null,
    open_date timestamp default now(),
    closed_date timestamp,
    engaged_date timestamp,
    engaged_emp_id int,
    emp_id int not null,
    likes int default 0,
    foreign key(engaged_emp_id) references Employee(id) on delete cascade,
    foreign key(emp_id) references Employee(id) on delete cascade
    );

create table liked_by(
	emp_id int,
    offer_id int,
    liked_on timestamp default now(),
    primary key(emp_id,offer_id),
    foreign key(emp_id) references Employee(id) on delete cascade,
    foreign key(offer_id) references Offer(id) on delete cascade
    );
    
    
insert into mfpe.employee values(1,"Jishnu Gopalan","Developer","male",22,7994245510,"jishnu123@gmail.com",0);
insert into mfpe.employee values(2,"Divya","Developer","female",22,7984245510,"divya123@gmail.com",0);
insert into mfpe.employee values(3,"Swetha","Developer","female",22,7984245210,"sweth123@gmail.com",0);
insert into mfpe.employee values(4,"Bhanu","Developer","male",22,7995245510,"bhanu123@gmail.com",0);
insert into mfpe.employee values(5,"Adesh","Developer","male",22,7994245514,"adesh123@gmail.com",0);
