package com.romvo.agenda.port.in;


import com.romvo.agenda.domain.entity.Contacto;

import java.util.List;

public interface ServicioContacto{
    Contacto crear(Contacto contacto);
    Contacto editar(Contacto contacto);
    void eliminar(Object id);
    List<Contacto> listar(Contacto contacto);
}
