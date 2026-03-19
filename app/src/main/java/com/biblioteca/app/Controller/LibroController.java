package com.biblioteca.app.Controller;
import java.util.Arrays;
import java.util.List;

import com.biblioteca.app.model.Libro;

public class LibroController {

    private List<Libro> libros = Arrays.asList(
        new Libro(1, "El Quijote", "Miguel de Cervantes", "Editorial A", 1605),
        new Libro(2, "Cien Años de Soledad", "Gabriel García Márquez", "Editorial B", 1967),
        new Libro(3, "La Sombra del Viento", "Carlos Ruiz Zafón", "Editorial C", 2001)
    );
    
    
}
