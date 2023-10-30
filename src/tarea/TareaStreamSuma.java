package tarea;

import java.util.Arrays;

public class TareaStreamSuma {
    public static void main(String[] args) {

        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        double numerosStream = Arrays.stream(numeros)//es del tipo doble, ya que él reduce retorna un double
                .filter(n->n % 10 !=0)// elimina los números divisibles entre 10
                .mapToDouble(f-> (double) f / 2)//convierte los números del arreglo a un tipo double
                .reduce(0,(a,b)->a+b);//suma los elementos restantes
        System.out.println("El resultado es: " + numerosStream);






















    }
}
