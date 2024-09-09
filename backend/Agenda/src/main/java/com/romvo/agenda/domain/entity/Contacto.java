package com.romvo.agenda.domain.entity;

import java.util.List;

public class Contacto {

    private String nombreContacto;
    private String numeroIdentificacion;
    private String numeroTelefonico;
    private String correoElectronico;

    private List<ProductoBancario> productoBancarios;

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<ProductoBancario> getProductoBancarios() {
        return productoBancarios;
    }

    public void setProductoBancarios(List<ProductoBancario> productoBancarios) {
        this.productoBancarios = productoBancarios;
    }
}
