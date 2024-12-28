package com.buscadorDeLibrosConApi.BuscaBook.principal;

import com.buscadorDeLibrosConApi.BuscaBook.model.DatosBusqueda;
import com.buscadorDeLibrosConApi.BuscaBook.service.ConsumoAPI;
import com.buscadorDeLibrosConApi.BuscaBook.service.ConvierteDatos;

import java.util.Scanner;

public class BusquedaHastaUnaFecha {
    private Scanner teclado = new Scanner(System.in);
    private final String URL = "http://gutendex.com/books/?author_year_end=";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();

    public void BuscaHastaFecha(){
        System.out.println("Escribe el anyo hasta el que quieres buscar");
        var hastaAnyo = teclado.nextInt();
        var json = consumoAPI.obtenerDatos(URL + hastaAnyo);
        DatosBusqueda busqueda = conversor.obtenerDatos(json, DatosBusqueda.class);
        System.out.println(busqueda);
    }
}
