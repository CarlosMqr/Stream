package tarea;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAplanarArreglo {
    public static void main(String[] args) {


        String[][] lenguajes =  {{"java", "groovy"},
                {"php"},
                {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"},
                {"javascript"}, {}};

        System.out.println("============Aplana con función Lambda============================ ");

        Function<String[][], List<String>> aplanar = arr ->Arrays.stream(arr).flatMap(a->Arrays.stream(a))
                .distinct()
                .collect(Collectors.toList());

        aplanar.apply(lenguajes).forEach(ap-> System.out.print("\t" + ap));

        System.out.println("============Aplanar forma sencilla============================ ");

        String[][] len =  {{"java", "groovy"},
            {"php"},
            {"c#", "python", "groovy"},
            {"java", "javascript", "kotlin"},
            {"javascript"}, {}};
        Arrays.stream(len)
                .flatMap(arr->Arrays.stream(arr))
                .distinct()
                .forEach(kl-> System.out.println("\t" + kl));






    }
}
