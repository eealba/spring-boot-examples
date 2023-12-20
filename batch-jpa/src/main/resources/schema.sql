drop table if exists prices;
create table customers (
    id int auto_increment primary key,
    first_name varchar(250) not null,
    last_name varchar(250) not null,
    birthdate date not null
);

INSERT INTO customers(first_name, last_name, birthdate) VALUES
('Joe','Doe', '1945-06-14');
INSERT INTO customers(first_name, last_name, birthdate) VALUES
('Clint','Eastwood', '1940-01-14');
