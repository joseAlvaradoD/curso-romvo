package com.romvo.agenda.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contacto {

    private String nombreContacto;
    private String numeroIdentificacion;
    private String numeroTelefonico;
    private String correoElectronico;

    private List<ProductoBancario> productoBancarios;
}
