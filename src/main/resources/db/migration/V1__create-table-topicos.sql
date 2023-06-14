CREATE TABLE topicos(
	id int NOT NULL auto_increment,
	titulo varchar(100) NOT NULL,
	mensaje varchar(300) NOT NULL,
	fecha_creacion date NOT NULL,
	estatus varchar(25) NOT NULL,
	autor varchar(100) NOT NULL,
	curso varchar(100) NOT NULL,	
	primary key (id)
);