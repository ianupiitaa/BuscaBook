package com.buscadorDeLibrosConApi.BuscaBook.service;

public interface IConvierteDatos {
    <T> T obtenerDatos (String json, Class <T> clase);
}
