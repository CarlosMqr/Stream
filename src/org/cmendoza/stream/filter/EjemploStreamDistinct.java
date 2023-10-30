package org.cmendoza.stream.filter;

import org.cmendoza.stream.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {

    public static void main(String[] args) {

        System.out.println("====================================================");
        Stream<String> nombres = Stream.of("carlos mendoza","jazmin diaz" ,
                "jessy rangel",
                "daniela venegas",
                "jazmin mendoza","carlos mendoza","carlos mendoza","carlos mendoza")

                .distinct();//los elementos que están repetidos los excluye
        nombres.forEach(k-> System.out.println(k));



















    }
}
