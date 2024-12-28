package com.buscadorDeLibrosConApi.BuscaBook.principal;

import java.util.Scanner;

public class DespliegaMenuDeOpciones {

private Scanner teclado = new Scanner(System.in);
private Integer metodo;

    public void muestraMenu(){
        while (true){
            System.out.println("""
                Seleccione su metodo de busqueda:
                1) Desde una fecha
                2) Hasta una fecha
                3) Entre un periodo de tiempo determinado
                4) Por idioma
                5) Por titulo y autor
                6) Por tema
                
                9) Salir
                """);
            metodo = teclado.nextInt();
            if (metodo == 9){
                break;
            }else {
                switch (metodo){
                    case 1 :
                        BusquedaDesdeUnaFecha busquedaDesdeUnaFecha = new BusquedaDesdeUnaFecha();
                        busquedaDesdeUnaFecha.BuscaDesdeFecha();
                        break;
                    case 2:
                        BusquedaHastaUnaFecha busquedaHastaUnaFecha = new BusquedaHastaUnaFecha();
                        busquedaHastaUnaFecha.BuscaHastaFecha();
                        break;
                    case 3:
                        BusquedaPeriodoDeTiempo busquedaPeriodoDeTiempo = new BusquedaPeriodoDeTiempo();
                        busquedaPeriodoDeTiempo.BusquedaPeriodoTiempo();
                        break;
                    case 4:
                        BusquedaPorIdioma busquedaPorIdioma = new BusquedaPorIdioma();
                        busquedaPorIdioma.BusquedaIdioma();
                        break;
                    case 5:
                        BusquedaPorTema busquedaPorTema = new BusquedaPorTema();
                        busquedaPorTema.BusquedaTema();
                        break;
                    case 6:
                        BusquedaTituloAutor busquedaTituloAutor = new BusquedaTituloAutor();
                        busquedaTituloAutor.BuscaTituloAutor();
                        break;
                    default: break;
                }
            }
        }
    }
}
