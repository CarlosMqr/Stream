package org.cmendoza.stream.list;

import org.cmendoza.stream.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListToStream {


    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Jazmin","Diaz"));
        lista.add(new Usuario("Carlos","mendoza"));
        lista.add(new Usuario("Jessy","Rangel"));
        lista.add(new Usuario("Daniela","liz"));
        lista.add(new Usuario("Thalia","Sanchez"));
        lista.add(new Usuario("Adriana","Mote"));
        lista.add(new Usuario("Jazmin","Mendoza"));


        System.out.println("Convertir un List a Stream");
        lista.stream().map(u -> u.getNombre().toUpperCase()
                .concat(" ")
                .concat(u.getApellido()).toUpperCase())
                .flatMap(nombre->{
                    if (nombre.contains("Jazmin".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .forEach(d-> System.out.println(d));























    }
}
