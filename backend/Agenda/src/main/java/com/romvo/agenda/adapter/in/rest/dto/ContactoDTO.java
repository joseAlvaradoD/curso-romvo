package com.romvo.agenda.adapter.in.rest.dto;

import com.romvo.agenda.domain.entity.ProductoBancario;

import java.util.List;

public record ContactoDTO (
    Long id,
    String nombreContacto,
    String numeroIdentificacion,
    String correoElectronico,
    List<ProductoBancario> productoBancarios
){
}
