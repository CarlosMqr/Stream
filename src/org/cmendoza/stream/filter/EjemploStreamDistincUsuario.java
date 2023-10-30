package org.cmendoza.stream.filter;

import org.cmendoza.stream.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistincUsuario {

    public static void main(String[] args) {

        System.out.println("====================================================");
        IntStream nombresU = Stream.of("carlos mendoza "," jazmin diaz " ," jessy rangel "," daniela venegas "," jazmin mendoza ",
                        " jazmin diaz",
                        " jazmin diaz")

                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                // .filter(a->a.equals(a))
                .distinct()//para poder usar el .distinct() después de .map() es necesario filtrar para buscar
                //elementos iguales con el .equals(), los más sencillo es ponerlo antes del .map()
                //también solo crear el método equals y ya
                .peek(System.out::print)
                .mapToInt(u -> u.toString().length());


        //nombresU.forEach(k-> System.out.println(": cantidad de letras: " + k));

        IntSummaryStatistics iss = nombresU.summaryStatistics();

        System.out.println("\nSuma total de letras: " + iss.getSum());
        System.out.println("Nombre con más letras: " + iss.getMax());
        System.out.println("nombre con menos letras: " + iss.getMin());
        System.out.println("Promedio de la suma del total de letras: " + iss.getAverage());
        System.out.println("cantidad de usuarios: " + iss.getCount());







       /* Optional<Usuario> listUsuario = nombresU.findFirst();//forma de buscar la primera coincidencia en el Stream
        System.out.println(listUsuario.orElse(new Usuario("adri", "luo")));
        //sí no encuentra él id retorna un nuevo usuario como se muestra, para no caer en una excepción
        //con expresión lambda abajo
        System.out.println(listUsuario.orElseGet(() -> new Usuario("adri", "luo")));*/















    }
}
