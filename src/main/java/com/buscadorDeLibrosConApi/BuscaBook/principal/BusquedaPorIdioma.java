package com.buscadorDeLibrosConApi.BuscaBook.principal;

import com.buscadorDeLibrosConApi.BuscaBook.model.DatosBusqueda;
import com.buscadorDeLibrosConApi.BuscaBook.service.ConsumoAPI;
import com.buscadorDeLibrosConApi.BuscaBook.service.ConvierteDatos;

import java.util.Scanner;

public class BusquedaPorIdioma {
    private Scanner teclado = new Scanner(System.in);
    private final String URL = "http://gutendex.com/books/?languages=";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();

    public void BusquedaIdioma(){
        System.out.println("Escribe el idioma que prefieres (en, fr, fi)");
        var idioma = teclado.nextLine().toLowerCase();
        var json = consumoAPI.obtenerDatos(URL + idioma);
        DatosBusqueda busqueda = conversor.obtenerDatos(json, DatosBusqueda.class);
        System.out.println(busqueda);
    }
}
