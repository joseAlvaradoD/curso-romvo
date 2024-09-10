package com.romvo.agenda.bootstrap;

import com.romvo.agenda.adapter.out.persistence.jpa.H2RepositorioContacto;
import com.romvo.agenda.adapter.out.persistence.jpa.entity.ContactoEntity;
import com.romvo.agenda.adapter.out.persistence.jpa.entity.ProductoBancarioEntity;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Component
public class Bootstrap implements CommandLineRunner {

    private final H2RepositorioContacto h2RepositorioContacto;

    @Override
    public void run(String... args) throws Exception {

        ContactoEntity ce = h2RepositorioContacto.save(ContactoEntity.builder()
                .nombreContacto("jose")
                .numeroIdentificacion("111111")
                .numeroTelefonico("1245679")
                .correoElectronico("jose@mail.com")
                .build());

        List<ProductoBancarioEntity> productoBancarioList = new ArrayList<>();
        productoBancarioList.add(ProductoBancarioEntity.builder().contacto(ce).nombreProducto("Tarjeta").build());
        ce.setProductoBancarios(productoBancarioList);

        h2RepositorioContacto.save(ce);

    }
}
