package com.biblioteca.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    
    private int id;
    private String titulo;
    private String autor;
    private String editorial;
    private int anioPublicacion;

}