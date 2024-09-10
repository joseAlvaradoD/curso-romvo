package com.romvo.agenda.domain.service;


import com.romvo.agenda.port.in.ServicioContacto;
import com.romvo.agenda.domain.entity.Contacto;
import com.romvo.agenda.port.out.persistence.RepositorioContacto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplServicioContacto implements ServicioContacto {

    private final RepositorioContacto repositorioContacto;

    public ImplServicioContacto(RepositorioContacto repositorioContacto){
        this.repositorioContacto = repositorioContacto;
    }

    @Override
    public Contacto findById(Long id) {
        return null;
    }

    @Override
    public Contacto crear(Contacto contacto) {
        return this.repositorioContacto.crear(contacto);
    }

    @Override
    public Contacto editar(Contacto contacto) {
        return this.repositorioContacto.editar(contacto);
    }

    @Override
    public void eliminar(Long id) {
        this.repositorioContacto.eliminar(id);
    }

    @Override
    public List<Contacto> listar() {
        return this.repositorioContacto.listar();
    }
}
