package com.biblioteca.app.Repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.biblioteca.app.model.Libro;

@Repository
public class LibroRepository {

    private List<Libro> libros = Arrays.asList(
        new Libro(1, "El Quijote", "Miguel de Cervantes", "Editorial A", 1605),
        new Libro(2, "Cien Años de Soledad", "Gabriel García Márquez", "Editorial B", 1967),
        new Libro(3, "La Sombra del Viento", "Carlos Ruiz Zafón", "Editorial C", 2001),
        new Libro(4, "Don Juan Tenorio", "José Zorrilla", "Editorial D", 1844)
    );

    public List<Libro> findAll() {
        return libros;
    }

    public Libro findByid(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }
    // investigar factibilidad de usar reflection para evitar tener que escribir un método por cada atributo
    // por ejemplo, findByAutor, findByTitulo, etc. y en su lugar tener un método genérico que reciba el nombre del atributo y el valor a buscar
    //¿Posible?
    //Respuesta: Sí, es posible usar reflection para crear un método genérico que busque por cualquier atributo. 
    // Sin embargo, esto puede ser más complejo y menos eficiente que tener métodos específicos para cada atributo, 
    // especialmente si la cantidad de libros es grande. Además, el uso de reflection puede hacer que el código sea más difícil de mantener y depurar.
    // En general, es recomendable tener métodos específicos para cada atributo a menos que realmente se necesite una solución más flexible.
    public List<Libro> findByAtributte(String atributte, String value) {

        return libros;
    }

    public void save(Libro libro) {
        // Aquí se implementaría la lógica para guardar el libro en la base de datos
    }

}
