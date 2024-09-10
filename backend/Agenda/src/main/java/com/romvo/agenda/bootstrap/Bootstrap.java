package com.romvo.agenda.bootstrap;

import com.romvo.agenda.adapter.out.persistence.jpa.H2RepositorioContacto;
import com.romvo.agenda.adapter.out.persistence.jpa.entity.ContactoEntity;
import com.romvo.agenda.adapter.out.persistence.jpa.entity.ProductoBancarioEntity;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Bootstrap implements CommandLineRunner {

    private final H2RepositorioContacto h2RepositorioContacto;

    @Override
    public void run(String... args) throws Exception {
        List<ProductoBancarioEntity> productoBancarioList = new ArrayList<>();
        productoBancarioList.add(ProductoBancarioEntity.builder().nombreProducto("Tarjeta").build());
        h2RepositorioContacto.save(ContactoEntity.builder()
                .nombreContacto("")
                .numeroIdentificacion("")
                .numeroTelefonico("")
                .correoElectronico("jose@mail.com")
                .productoBancarios(productoBancarioList)
                .build());
    }
}
