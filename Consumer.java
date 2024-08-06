import java.util.List;

public class Consumer {
    public static void main(String[] args) {
        List<String> strings = List.of("hello", "world", "java", "consumer");
        java.util.function.Consumer<String> toUpperCaseAndPrint = s -> System.out.println(s.toUpperCase());
        strings.forEach(toUpperCaseAndPrint);
    }
}