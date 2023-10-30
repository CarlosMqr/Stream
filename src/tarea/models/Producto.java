package tarea.models;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private double precio;
    private double cantidad;
    private List<Producto> productos;

//////////// CONSTRUCTOR ////////////


    public Producto() {
    }

    public Producto(double precio, double cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.productos = new ArrayList<>();
    }

    /////////// GETTER ANS SETTER //////
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public double getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    public List<Producto> getProductos(){
        return this.productos;
    }

////////// MÉTODOS ////////////////





}
