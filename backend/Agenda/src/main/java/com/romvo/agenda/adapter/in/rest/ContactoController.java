package com.romvo.agenda.adapter.in.rest;

import com.romvo.agenda.adapter.in.rest.dto.ContactoDTO;
import com.romvo.agenda.adapter.in.rest.dto.ContactoDTOMapper;
import com.romvo.agenda.port.in.ServicioContacto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/contacto")
public class ContactoController {

    private final ServicioContacto servicioContacto;
    private final ContactoDTOMapper contactoDTOMapper;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ContactoDTO> listarContactos(){
        return this.servicioContacto
            .listar()
            .stream()
            .map(contactoDTOMapper::contactoToContactoDTO)
            .toList();
    }
}
