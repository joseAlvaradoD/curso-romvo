package com.romvo.agenda.adapter.out.persistence.jpa.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "contacto")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContactoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nombreContacto;
    @Column
    private String numeroIdentificacion;
    @Column
    private String numeroTelefonico;
    @Column
    private String correoElectronico;

    @OneToMany(mappedBy = "contacto", cascade = CascadeType.ALL)
    private List<ProductoBancarioEntity> productoBancarios;


}
