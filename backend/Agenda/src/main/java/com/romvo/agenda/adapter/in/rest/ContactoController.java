package com.romvo.agenda.adapter.in.rest;

import com.romvo.agenda.adapter.in.rest.dto.ContactoDTO;
import com.romvo.agenda.adapter.in.rest.dto.ContactoDTOMapper;
import com.romvo.agenda.domain.entity.Contacto;
import com.romvo.agenda.port.in.ServicioContacto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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

    @PostMapping
    public ContactoDTO crear(@RequestBody Contacto contacto) {
        return contactoDTOMapper.contactoToContactoDTO(this.servicioContacto.crear(contacto));
    }

    @PutMapping()
    public ContactoDTO editar( @RequestBody Contacto contacto) {
        return contactoDTOMapper.contactoToContactoDTO(this.servicioContacto.editar(contacto));

    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        this.servicioContacto.eliminar(id);
    }
}
