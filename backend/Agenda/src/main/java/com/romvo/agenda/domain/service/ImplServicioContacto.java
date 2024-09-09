package com.romvo.agenda.domain.service;


import com.romvo.agenda.port.in.ServicioContacto;
import com.romvo.agenda.domain.entity.Contacto;

import java.util.List;

public class ImplServicioContacto implements ServicioContacto {
    @Override
    public Contacto crear(Contacto contacto) {
        return null;
    }

    @Override
    public Contacto editar(Contacto contacto) {
        return null;
    }

    @Override
    public void eliminar(Object id) {

    }

    @Override
    public List<Contacto> listar(Contacto contacto) {
        return List.of();
    }
}
