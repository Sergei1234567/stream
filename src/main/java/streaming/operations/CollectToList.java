package streaming.operations;
// collect(toList()) – энергичная операция, порождающая список из значений
//в объекте Stream

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToList {
    public static void main(String[] args) {
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
        System.out.println(collected);
    }
}
