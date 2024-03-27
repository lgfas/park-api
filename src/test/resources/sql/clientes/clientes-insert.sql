insert into usuarios (id, username, password, role) values (100, 'luis@email.com', '$2a$12$EPB5ieGzJBlyf2TjchEQnOyTx.GDKYx3e4JA/OS37W1RtDgbcIn9i', 'ROLE_ADMIN');
insert into usuarios (id, username, password, role) values (101, 'bia@email.com', '$2a$12$EPB5ieGzJBlyf2TjchEQnOyTx.GDKYx3e4JA/OS37W1RtDgbcIn9i', 'ROLE_CLIENTE');
insert into usuarios (id, username, password, role) values (102, 'bob@email.com', '$2a$12$EPB5ieGzJBlyf2TjchEQnOyTx.GDKYx3e4JA/OS37W1RtDgbcIn9i', 'ROLE_CLIENTE');
insert into usuarios (id, username, password, role) values (103, 'toby@email.com', '$2a$12$EPB5ieGzJBlyf2TjchEQnOyTx.GDKYx3e4JA/OS37W1RtDgbcIn9i', 'ROLE_CLIENTE');

insert into clientes (id, nome, cpf, id_usuario) values (10, 'Bianca Silva', '79801702028', 101);
insert into clientes (id, nome, cpf, id_usuario) values (20, 'Roberto Gomes', '77373367020', 102);
