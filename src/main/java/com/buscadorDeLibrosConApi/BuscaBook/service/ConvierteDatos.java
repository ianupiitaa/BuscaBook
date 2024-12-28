package com.buscadorDeLibrosConApi.BuscaBook.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos{
    private  ObjectMapper objetoMapeador = new ObjectMapper();
    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            return objetoMapeador.readValue(json,clase);
        } catch (JsonProcessingException e) {
            System.out.println("se genera una excepcion del tipo: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
