package edu.eci.cvds.tdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Clase Cliente que controla la aplicación
*/
@SpringBootApplication
public class Client {

    /*
    Añade Producto
    */
    public void addProducto(String) {
        GUIFactory.createXbox();
    }

    /*
    Modifica unidades del producto
    */
    public void setProduct(int) {
        
    }

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}
}
