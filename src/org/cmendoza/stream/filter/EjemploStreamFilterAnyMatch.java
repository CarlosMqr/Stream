package org.cmendoza.stream.filter;

import org.cmendoza.stream.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {

    public static void main(String[] args) {

        System.out.println("====================================================");
        boolean existe  = Stream.of("carlos mendoza","jazmin diaz" ,"jessy rangel","daniela venegas","jazmin mendoza")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .anyMatch(p->p.getId().equals(0));//final


        System.out.println(existe);
        















    }
}
