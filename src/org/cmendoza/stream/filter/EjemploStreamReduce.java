package org.cmendoza.stream.filter;

import org.cmendoza.stream.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamReduce {

    public static void main(String[] args) {

        /*
        cuando se imprima java.util.stream.IntPipeline$Head@312b1dae
        es porque se necesita imprimir coin una expresión lambda
        ejemplo: nombreVariable.forEach(g-> System.out.println(g));
         */

        System.out.println("====================Suma números con reduce()================================");
        Stream<Integer> nombres = Stream.of(1,2,3,4,5,6,7,8,9);

        int suma1 = nombres.reduce(0,(a,b)->a+b);
        System.out.println("La suma es: " + suma1);

             /*   Optional<Integer> suma = nombres.reduce((a, b)-> a+b);//para obtener solo un elemento
        System.out.println(suma);*/

        System.out.println("====================concatena nombres con reduce()================================");

        Stream<String> nombresU = Stream.of("carlos mendoza","jazmin diaz"
                ,"jessy rangel","daniela venegas","jazmin mendoza");

        String resultado = nombresU.reduce("",(a,b)->a + ", " + b);
        System.out.println("nombre: " + resultado);

        System.out.println("====================rango================================");

        IntStream resulRango = IntStream.rangeClosed(5,20).peek(System.out::print);

       //int r = resulRango.reduce(0,(a,b)->a+b);
        //System.out.println("\n" + r);
        //resulRango.forEach(a-> System.out.print("\t" + a));

        System.out.println("====================SummaryStatistics================================");

        IntSummaryStatistics stac = resulRango.summaryStatistics();
        System.out.println("\nValor maximo dentro del rango : " + stac.getMax());
        System.out.println("Valor minimo dentro del rango : " + stac.getMin());
        System.out.println("cuantos valores hay dentro del rango : " + stac.getCount());
        System.out.println("La suma con IntSummaryStatistics  de los valores dentro del rango es: " + stac.getSum());
        System.out.println("promedio de los elementos " + stac.getAverage());




























    }
}
