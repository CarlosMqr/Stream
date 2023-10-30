package org.cmendoza.stream.models;

public class Factura {
    private String descripcion;
    private Usuario usuario;


    public Factura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
