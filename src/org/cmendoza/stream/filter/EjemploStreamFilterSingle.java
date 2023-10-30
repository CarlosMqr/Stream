package org.cmendoza.stream.filter;

import org.cmendoza.stream.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {

    public static void main(String[] args) {

        System.out.println("====================================================");
        Stream<Usuario> nombresU = Stream.of("carlos mendoza","jazmin diaz" ,"jessy rangel","daniela venegas","jazmin mendoza")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(p->p.getId().equals(2));//final

        Optional<Usuario> listUsuario = nombresU.findFirst();//forma de buscar la primera coincidencia en el Stream
        System.out.println(listUsuario.orElse(new Usuario("adri", "luo")));
        //sí no encuentra él id retorna un nuevo usuario como se muestra, para no caer en una excepción
        //con expresión lambda abajo
        System.out.println(listUsuario.orElseGet(() -> new Usuario("adri", "luo")));















    }
}
