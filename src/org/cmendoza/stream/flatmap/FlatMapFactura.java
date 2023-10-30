package org.cmendoza.stream.flatmap;

import org.cmendoza.stream.models.Factura;
import org.cmendoza.stream.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  FlatMapFactura {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Jazmin","Diaz");
        Usuario u2 = new Usuario("Carlos","mendoza");

        u1.addFactura(new Factura("Tecnologia"));
        u1.addFactura(new Factura("Muebles"));

        u2.addFactura(new Factura("bicicleta"));
        u2.addFactura(new Factura("pc gamer"));



        List<Usuario> usuarios = Arrays.asList(u1,u2);
        usuarios.stream().flatMap(u->u.getFacturas().stream())
                .forEach(f-> System.out.println(f.getDescripcion().concat(" : cliente ").concat(f.getUsuario().getNombre().concat(" ").concat(f.getUsuario().getApellido()))));



























    }
}
