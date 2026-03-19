package com.biblioteca.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    @NotBlank(message = "El título es obligatorio")
    @Size(max = 255, message = "El título no puede exceder los 255 caracteres")
    private String titulo;
    @Column(nullable = false)
    @NotBlank(message = "El autor es obligatorio")
    private String autor;
    @Column(nullable = false)
    @NotBlank(message = "La editorial es obligatoria")
    private String editorial;
    @Column(nullable = false)
    @NotNull(message = "El año de publicación es obligatorio")
    @PastOrPresent(message = "El año de publicación no puede ser en el futuro")
    private LocalDate anioPublicacion;

}