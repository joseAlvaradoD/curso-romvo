package com.romvo.agenda.port.in;


import com.romvo.agenda.domain.entity.Contacto;

import java.util.List;

public interface ServicioContacto{
    Contacto findById(Long id);
    Contacto crear(Contacto contacto);
    Contacto editar(Contacto contacto);
    void eliminar(Long id);
    List<Contacto> listar();
}
