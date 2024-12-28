package com.buscadorDeLibrosConApi.BuscaBook.principal;

import com.buscadorDeLibrosConApi.BuscaBook.model.DatosBusqueda;
import com.buscadorDeLibrosConApi.BuscaBook.service.ConsumoAPI;
import com.buscadorDeLibrosConApi.BuscaBook.service.ConvierteDatos;

import java.util.Scanner;

public class BusquedaDesdeUnaFecha {
    private Scanner teclado = new Scanner(System.in);
    private final String URL = "http://gutendex.com/books/?author_year_start=";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();

    public void BuscaDesdeFecha(){
        System.out.println("Escribe el anyo desde el que quieres buscar");
        var desdeAnyo = teclado.nextInt();
        var json = consumoAPI.obtenerDatos(URL + desdeAnyo);
        DatosBusqueda busqueda = conversor.obtenerDatos(json, DatosBusqueda.class);
        System.out.println(busqueda);
    }
}
