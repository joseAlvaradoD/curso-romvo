package com.romvo.agenda.port.out.persistence;

import com.romvo.agenda.domain.entity.Contacto;

import java.util.List;

public interface RepositorioContacto {
    Contacto crear(Contacto contacto);
    Contacto editar(Contacto contacto);
    void eliminar(Long id);
    List<Contacto> listar();
}
