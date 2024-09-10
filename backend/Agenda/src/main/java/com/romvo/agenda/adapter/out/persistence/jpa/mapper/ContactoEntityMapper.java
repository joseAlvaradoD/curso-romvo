package com.romvo.agenda.adapter.out.persistence.jpa.mapper;

import com.romvo.agenda.adapter.out.persistence.jpa.entity.ContactoEntity;
import com.romvo.agenda.domain.entity.Contacto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

@Component
@Mapper(uses = ProductoBancarioEntityMapper.class)
public interface ContactoEntityMapper {

    ContactoEntity contactoToContactoEntity(Contacto contacto);

    Contacto contactoEntityToContacto(ContactoEntity contactoEntity);
}
