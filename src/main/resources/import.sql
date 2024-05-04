insert into users (name, email, password, created_at) values ('Jorge Perez', 'jp@gmail.com', 'jkl', NOW());
insert into movement (amount, description, type, created_at) values (-500.00, 'Retiro', 'OUT', NOW())
insert into report(userName, amount) values ('Jorge Perez', -500.00);