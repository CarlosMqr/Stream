package org.cmendoza.stream.map;

import org.cmendoza.stream.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {

    public static void main(String[] args) {

        System.out.println("========================MAP============================");
        Stream<String> nombres = Stream.of("carlos","jazmin","jessy","daniela")
                .map(a->a.toUpperCase())
                //.peek(bn -> System.out.println(bn));
                .map(e->e.toLowerCase());

        //nombres.forEach(as -> System.out.println(as));//retorna un void
        //peek() inspecciona cada elemento imprimiendo

        System.out.println("========================Convertir un Stream a List============================");
        List<String> listNombres = nombres.collect(Collectors.toList());
        listNombres.forEach(k-> System.out.println(k));


        System.out.println("========================Convertir un Stream a un tipo Usuario============================");
        Stream<Usuario> nombresU = Stream.of("carlos mendoza","jazmin diaz" ,"jessy rangel","daniela venegas")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.toUpperCase().split(" ")[1]))
                .map(usuario->{
                    String nom = usuario.getNombre().toUpperCase();// obtenemos el nombre en minúscula y se asigna a "nom"
                    usuario.setNombre(nom);
                    return usuario;
                });
        List<Usuario> listUsuario = nombresU.collect(Collectors.toList());
        listUsuario.forEach(u-> System.out.println(u.getNombre() + " " + u.getApellido()));//imprimir sin el ToString
        //listUsuario.forEach(System.out::println);// imprimir con el ToString en la clase Usuario












    }
}
