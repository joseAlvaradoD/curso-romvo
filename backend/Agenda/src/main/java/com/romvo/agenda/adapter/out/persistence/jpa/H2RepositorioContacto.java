package com.romvo.agenda.adapter.out.persistence.jpa;

import com.romvo.agenda.adapter.out.persistence.jpa.entity.ContactoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface H2RepositorioContacto extends JpaRepository<ContactoEntity, Long> {
}
