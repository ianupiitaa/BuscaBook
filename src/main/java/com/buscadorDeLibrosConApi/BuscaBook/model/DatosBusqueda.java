package com.buscadorDeLibrosConApi.BuscaBook.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosBusqueda(
        @JsonAlias("count") Integer contador,
        @JsonAlias("next") String siguienteDireccion,
        @JsonAlias("previous") String anteriorDireccion,
        @JsonAlias("results") List<DatosLibros> libros
) {
}
