package com.romvo.agenda.adapter.out.persistence.jpa.mapper;

import com.romvo.agenda.adapter.out.persistence.jpa.entity.ProductoBancarioEntity;
import com.romvo.agenda.domain.entity.ProductoBancario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface ProductoBancarioEntityMapper {

    ProductoBancarioEntityMapper INSTANCE = Mappers.getMapper(ProductoBancarioEntityMapper.class);

    ProductoBancarioEntity productoBancarioToProductoBancarioEntity(ProductoBancario productoBancario);
    ProductoBancario productoBancarioEntityToProductoBancario(ProductoBancarioEntity productoBancarioEntity);
}
