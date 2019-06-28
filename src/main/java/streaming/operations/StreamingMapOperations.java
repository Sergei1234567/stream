package streaming.operations;

//Если имеется функция, которая преобразует значение из одного типа в другой,
// то метод map позволит применить ее к потоку значений и
// тем самым породить поток новых значений

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamingMapOperations {
    public static void main(String[] args) {

        //  Преобразование строк в верхний регистр в цикле for

        List<String> collected = new ArrayList<>();
        for (String string : asList("a", "b", "c", "hello")) {
            String uppercaseString = string.toUpperCase();
            collected.add(uppercaseString);
        }
        System.out.print(collected);

        System.out.println();

        // Преобразование строк в верхний регистр с помощью map

        List<String> collecteds = Stream.of("a", "b", "c", "hello")
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());
        System.out.print(collecteds);
    }
}
