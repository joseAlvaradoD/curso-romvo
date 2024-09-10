package com.romvo.agenda.adapter.out.persistence.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "producto_bancario")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductoBancarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private ContactoEntity contacto;
    @Column
    private String nombreProducto;
}
