package com.romvo.agenda.adapter.out.persistence.jpa.entity;

import com.romvo.agenda.domain.entity.Contacto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "producto_bancario")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductoBancarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Contacto contacto;
    @Column
    private String nombreProducto;
}
