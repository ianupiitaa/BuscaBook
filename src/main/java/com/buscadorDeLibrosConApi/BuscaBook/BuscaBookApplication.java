package com.buscadorDeLibrosConApi.BuscaBook;

import com.buscadorDeLibrosConApi.BuscaBook.principal.DespliegaMenuDeOpciones;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuscaBookApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BuscaBookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DespliegaMenuDeOpciones despliegaMenuDeOpciones = new DespliegaMenuDeOpciones();
		despliegaMenuDeOpciones.muestraMenu();
	}
}
