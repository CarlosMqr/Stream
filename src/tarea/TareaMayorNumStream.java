package tarea;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class TareaMayorNumStream {
    public static void main(String[] args) {


        Function<Integer[],Integer> funcion = nums-> Arrays.stream(nums).reduce(0,(x,m)-> x > m ? x:m);

        int resultado = funcion.apply(new Integer[]{2345,383,3409,47,89,90});
        System.out.println("Numero mayor: " + resultado);




















    }
}
