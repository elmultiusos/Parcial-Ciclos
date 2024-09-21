package edu.eci.cvds.tdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Escribir en el stdout si hay menos de 5 unidades disponibles lo cual generará una alerta
*/
@SpringBootApplication
public class AgenteWarn extends Agente {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}
}