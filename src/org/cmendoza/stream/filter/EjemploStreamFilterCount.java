package org.cmendoza.stream.filter;

import org.cmendoza.stream.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterCount {

    public static void main(String[] args) {

        System.out.println("====================================================");
        long catidad  = Stream.of("carlos mendoza","jazmin diaz" ,
                        "jessy rangel",
                        "daniela venegas",
                        "jazmin mendoza")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .count();//final


        System.out.println(catidad);
        















    }
}
