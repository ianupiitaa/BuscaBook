package com.buscadorDeLibrosConApi.BuscaBook.principal;

import com.buscadorDeLibrosConApi.BuscaBook.model.DatosBusqueda;
import com.buscadorDeLibrosConApi.BuscaBook.service.ConsumoAPI;
import com.buscadorDeLibrosConApi.BuscaBook.service.ConvierteDatos;

import java.util.Scanner;

public class BusquedaPorTema {
    private Scanner teclado = new Scanner(System.in);
    private final String URL = "http://gutendex.com/books/?topic=";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();

    public void BusquedaTema(){
        System.out.println("Escribe el tema que te interesa buscar");
        var tema = teclado.nextLine().toLowerCase();
        var json = consumoAPI.obtenerDatos(URL + tema);
        DatosBusqueda busqueda = conversor.obtenerDatos(json, DatosBusqueda.class);
        System.out.println(busqueda);
    }
}
