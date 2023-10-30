package org.cmendoza.stream.filter;

import org.cmendoza.stream.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {

    public static void main(String[] args) {

        System.out.println("====================================================");
                Stream<Usuario> nombresU = Stream.of("carlos mendoza","jazmin diaz" ,"jessy rangel","daniela venegas","jazmin mendoza")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(p->p.getNombre().equals("jazmin"))
                .peek(System.out::println);



        List<Usuario> listUsuario = nombresU.collect(Collectors.toList());
       // listUsuario.forEach(u-> System.out.println(u.getNombre() + " " + u.getApellido()));//imprimir sin el ToString
        listUsuario.forEach(System.out::println);// imprimir con el ToString en la clase Usuario












    }
}
