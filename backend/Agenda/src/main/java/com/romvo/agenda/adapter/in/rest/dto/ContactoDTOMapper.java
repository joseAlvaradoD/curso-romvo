package com.romvo.agenda.adapter.in.rest.dto;

import com.romvo.agenda.domain.entity.Contacto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface ContactoDTOMapper {
    ContactoDTO contactoToContactoDTO(Contacto contacto);
}
