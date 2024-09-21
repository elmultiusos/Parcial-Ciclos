package edu.eci.cvds.tdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Abstract factory knows about all (abstract) product types.
 */
@SpringBootApplication
public interface GUIFactory {
	
	private final Map<Book, Integer> books;
	
    public createXbox() {
		Xbox = new Xbox();
	} 
	
	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}
}