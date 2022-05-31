insert into tb_user(nome, email, senha) values ('maria','maria@gmail.com',123);
insert into tb_user(nome, email, senha) values ('jose','jose@gmail.com',123);

insert into tb_role(authority)values('ROLE_ADMIN');
insert into tb_role(authority)values('ROLE_USUARIO');

insert into tb_user_role(user_id, role_id)values(1,1);
insert into tb_user_role(user_id, role_id)values(2,2);