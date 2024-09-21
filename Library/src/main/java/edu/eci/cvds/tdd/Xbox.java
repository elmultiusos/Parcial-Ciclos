package edu.eci.cvds.tdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Xbox {

    public void addProducto() {
        GUIFactory.createXbox();
    }

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}
}
