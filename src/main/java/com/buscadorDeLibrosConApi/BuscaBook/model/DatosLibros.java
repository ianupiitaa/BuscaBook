package com.buscadorDeLibrosConApi.BuscaBook.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibros(
        @JsonAlias("id") Integer idLibro,
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<DatosAutor> autor,
        @JsonAlias("subjects") List<String> genero,
        @JsonAlias("languages") List<String> idiomas,
        @JsonAlias("copyright") Boolean tieneCopy,
        @JsonAlias("download_count") Integer numeroDeDescargas
) {
}
