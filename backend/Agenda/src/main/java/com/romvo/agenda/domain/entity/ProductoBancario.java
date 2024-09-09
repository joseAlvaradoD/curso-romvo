package com.romvo.agenda.domain.entity;

public class ProductoBancario {
    private String nombreProducto;

    public ProductoBancario(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
}
