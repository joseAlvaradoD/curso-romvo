package com.romvo.agenda.adapter.out.persistence.jpa;

import com.romvo.agenda.adapter.out.persistence.jpa.mapper.ContactoEntityMapper;
import com.romvo.agenda.domain.entity.Contacto;
import com.romvo.agenda.port.out.persistence.RepositorioContacto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class ImplRepositorioContacto implements RepositorioContacto {

    private final H2RepositorioContacto h2RepositorioContacto;
    private final ContactoEntityMapper contactoEntityMapper;

    @Override
    public Contacto crear(Contacto contacto) {
        return contactoEntityMapper.contactoEntityToContacto(
            h2RepositorioContacto.save(
                contactoEntityMapper.contactoToContactoEntity(contacto)
            )
        );
    }

    @Override
    public Contacto editar(Contacto contacto) {
        return contactoEntityMapper.contactoEntityToContacto(
            h2RepositorioContacto.save(
                contactoEntityMapper.contactoToContactoEntity(contacto)
            )
        );
    }

    @Override
    public void eliminar(Long id) {
        h2RepositorioContacto.deleteById(id);
    }

    @Override
    public List<Contacto> listar() {
        return h2RepositorioContacto
                .findAll()
                .stream()
                .map(contactoEntityMapper::contactoEntityToContacto)
                .toList();
    }
}
