package org.cmendoza.stream.filter;

import org.cmendoza.stream.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {

    public static void main(String[] args) {

        System.out.println("====================================================");
        long nombresU = Stream.of("","jazmin diaz" ,"jessy rangel","daniela venegas","")

                .filter(p->p.isEmpty())
                .count();

        System.out.println("cantidad de vacios" + nombresU);
















    }
}
