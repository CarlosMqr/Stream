package org.cmendoza.stream.flatmap;

import org.cmendoza.stream.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFlatMap {

    public static void main(String[] args) {

        System.out.println("====================================================");
                Stream<Usuario> nombresU = Stream.of("carlos mendoza","jazmin diaz" ,"jessy rangel","daniela venegas","jazmin mendoza")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .flatMap(o->{
                    if (o.getNombre().equals("jazmin")){
                        return Stream.of(o);//Stream.of() retorna un Stream de un solo objeto o elemento
                                            // convertimos el objeto usuario en un Stream
                    }
                    return Stream.empty();
                });


                nombresU.forEach(k-> System.out.println(k));











    }
}
