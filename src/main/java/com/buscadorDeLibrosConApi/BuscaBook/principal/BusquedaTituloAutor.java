package com.buscadorDeLibrosConApi.BuscaBook.principal;

import com.buscadorDeLibrosConApi.BuscaBook.model.DatosBusqueda;
import com.buscadorDeLibrosConApi.BuscaBook.service.ConsumoAPI;
import com.buscadorDeLibrosConApi.BuscaBook.service.ConvierteDatos;

import java.util.Scanner;

public class BusquedaTituloAutor {
    private Scanner teclado = new Scanner(System.in);
    private final String URL = "http://gutendex.com/books?search=";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();

    public void BuscaTituloAutor(){
        System.out.println("Escribe una sola palabra del titulo y el apellido del autor");
        var tituloAutor = teclado.nextLine().replace(" ","%20");
        var json = consumoAPI.obtenerDatos(URL + tituloAutor);
        DatosBusqueda busqueda = conversor.obtenerDatos(json, DatosBusqueda.class);
        System.out.println(busqueda);
    }
}
