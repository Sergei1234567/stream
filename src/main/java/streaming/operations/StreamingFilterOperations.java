package streaming.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class StreamingFilterOperations {
    public static void main(String[] args) {
        // Обход списка в цикле и использование if

        List<String> beginningWithNumbers = new ArrayList<>();
        for (String value : asList("a", "1abc", "ab1c")) {
            if (isDigit(value.charAt(0))) {
                beginningWithNumbers.add(value);
            }
            System.out.print(beginningWithNumbers);
        }
        System.out.println();

        // Функциональный стиль

        List<String> beginningWithNumber = Stream.of("a", "1abc", "ab1c")
                .filter(value -> isDigit(value.charAt(0)))
                .collect(toList());
    }
}
