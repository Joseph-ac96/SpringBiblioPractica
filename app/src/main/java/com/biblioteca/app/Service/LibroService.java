package com.biblioteca.app.Service;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.app.Repository.LibroRepository;
import com.biblioteca.app.model.Libro;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // Genera un constructor con los campos finales (final) o con campos anotados con @NonNull
//investigar diferencia con @Autowired
public class LibroService {
    // Inyección de dependencias a través del constructor generado por @RequiredArgsConstructor
    // @Autowired // No es necesario si se usa @RequiredArgsConstructor, pero se puede mantener para claridad
    // private LibroRepository libroRepository; // No es necesario marcarlo como @Autowired si se usa @RequiredArgsConstructor
    private final LibroRepository libroRepository;

    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }

    public Libro getLibroById(int id) {
        return libroRepository.findByid(id);
    }

}