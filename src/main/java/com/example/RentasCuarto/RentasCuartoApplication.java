package com.example.RentasCuarto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Borrar la siguiente línea de código cuando tenga base de datos
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//Borrar la siguiente línea de código cuando tenga base de datos y descomentar lo skiguiente
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@SpringBootApplication
public class RentasCuartoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentasCuartoApplication.class, args);
	}

}
