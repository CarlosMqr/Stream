package org.cmendoza.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {

    public static void main(String[] args) {

        System.out.println("========================sin crear arreglo============================");
        Stream<String> nombres = Stream.of("carlos","jazmin","jessy","daniela");
        //nombres.forEach(System.out::println);
        nombres.forEach(nom-> System.out.println(nom));


        System.out.println("========================creando arreglo============================");
        String[] arreglo = {"carlos","jazmin","jessy","daniela"};
        Stream<String> nombresArr = Arrays.stream(arreglo);
        nombresArr.forEach(a-> System.out.println(a));


        System.out.println("========================usando Stream Builder============================");
        Stream<Integer> numeros = Stream.<Integer>builder().add(1)// require un tipo de datos builder()
                .add(2)
                .add(3)
                .add(4)
                .add(5)
                .build();
        numeros.forEach(num -> System.out.print(num + "\t"));



        System.out.println("\n========================usando List============================");
        List<String> nombres2 = new ArrayList<>();
        nombres2.add("jazmin");
        nombres2.add("carlos");
        nombres2.add("jessy");
        nombres2.add("daniela");
        nombres2.add("ale");

        /*Stream<String> lista = nombres2.stream();
        lista.forEach(lis -> System.out.println(lis));*/

        nombres2.stream().forEach(lis -> System.out.println(lis));





    }
}
