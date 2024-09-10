package com.romvo.agenda.adapter.in.rest.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactoDTO {
    private Long id;
    private String nombreContacto;
    private String numeroIdentificacion;
    private String numeroTelefonico;
    private String correoElectronico;
    private List<ProductoBancarioDTO> productoBancarios;
}
