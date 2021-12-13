/*insert into ocupacion(nombre, createdat, sueldobase) values ("Profesor", "2019-05-15", 3600.61), ("Contador", "2017-10-02", 4500.79), ("Ingeniero de Sistemas", "2021-12-11", 5800.99);
*/


/*Insertamos datos en la tabla socio*/
insert into socio(nomsocio, apsocio, dni, sexo, ocupacion, fechanac, correo, celular, login, contrasena) values ("Roberto", "Miranda Boluarte", "65489494", "M", "Medico", "1980-11-09", "robert@gmail.com", "958123165", "rob123", "hola789");
insert into socio(nomsocio, apsocio, dni, sexo, ocupacion, fechanac, correo, celular, login, contrasena) values ("Adrian", "Quiroz Mendoza", "15264532", "M", "Comerciante", "1972-12-02", "adrian@gmail.com", "939561248", "ad72", "xlr801");
insert into socio(nomsocio, apsocio, dni, sexo, ocupacion, fechanac, correo, celular, login, contrasena) values ("Daniela", "Guerra Escobar", "72856431", "F", "Vendedora de Abarrotes", "1982-03-23", "dange@gmail.com", "980456532", "dani57", "S014aax");
insert into socio(nomsocio, apsocio, dni, sexo, ocupacion, fechanac, correo, celular, login, contrasena) values ("Pedro", "Tapia Flores", "06052356", "M", "Distribuidor de Golosinas", "1968-01-22", "petf@gmail.com", "921598728", "pedro28", "s0nn3");

/*Insertamos datos en la tabla cuenta*/
insert into cuenta(tipocuenta, nrocuenta, saldo, fechaapertura, pertenece_socio) values ("Cuenta Simple", "0000123", 0, "2021-01-13", 1);
insert into cuenta(tipocuenta, nrocuenta, saldo, fechaapertura, pertenece_socio) values ("Cuenta Emprendedor", "0000511", 0, "2021-02-25", 1);
insert into cuenta(tipocuenta, nrocuenta, saldo, fechaapertura, pertenece_socio) values ("Cuenta Premium", "0000811", 0, "2021-01-15", 2);
insert into cuenta(tipocuenta, nrocuenta, saldo, fechaapertura, pertenece_socio) values ("Cuenta Simple", "0000124", 0, "2021-05-27", 3);
insert into cuenta(tipocuenta, nrocuenta, saldo, fechaapertura, pertenece_socio) values ("Cuenta Emprendedor", "0000512", 0, "2021-04-18", 4);

/*Insertamos datos en la tabla movimiento*/
insert into movimiento(tipomov, montomov, fechahoramov, pertenece_cuenta) values ("Deposito", "30.00", "2021-01-16", 1);


/*Insertamos datos en la tabla prestamo*/
insert into prestamo(tipoprestamo, montoprestamo, fecemision, tasainteres, solicitadopor_socio) values ("Empresa Chica", 1000.00, "2021-01-14", 0.04, 1);


/*no se puede insertar cuentas*/
/*insert into cuenta(tipocuenta, nrocuenta, saldo, fechaapertura, perteneceSocio) values ("Cuenta Simple", "0000123", 0, "2021-01-13", 1);
*/


/*
insert into socio(nomSocio, apSocio, dni, sexo, fechaNac, correo, celular, tieneUsuario, perteneceSocio, solicitadoporSocio, tieneocupacion) values ("Juan", "Hurtado", "12345678", "M", fecha, "jhurtado@gmail.com", "918562365", 1, 1, 1, 3)
*/


