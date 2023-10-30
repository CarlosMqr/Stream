package tarea;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class repaso {
    public static void main(String[] args) {


        Function<Integer[],Integer> funcion = mayor->Arrays.stream(mayor)
                .reduce(0,(a,b)-> a > b ? a:b);

        System.out.println(funcion.apply(new Integer[]{1,2,3,4,5}));










    }
}
