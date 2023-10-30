package tarea;

import tarea.models.Producto;

import java.util.Arrays;
import java.util.List;

public class StreamCalcularImporte {
    public static void main(String[] args) {

        Producto celular = new Producto(4500,3);
        Producto teclado = new Producto(1550,2);
        Producto raton = new Producto(560,3);


        System.out.println("====================usando sum========================");
        List<Producto> productos = Arrays.asList(celular,teclado,raton);
        double total = productos.stream()
                .mapToDouble(p->p.getPrecio() * p.getCantidad())
                .sum();
       System.out.println(total);

        System.out.println("====================usando reduce========================");
        List<Producto> productos1 = Arrays.asList(celular,teclado,raton);
        double total2 = productos1.stream()
                .mapToDouble(l->l.getPrecio() * l.getCantidad())
                .reduce(0,(q,w)->q+w);
        System.out.println(total2);























    }
}
