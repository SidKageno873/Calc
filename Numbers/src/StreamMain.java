import java.util.*;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        System.out.println("Результат с Stream API:");
        intList.stream()
                .filter(x -> x > 0)           // Положительные числа
                .filter(x -> x % 2 == 0)      // Четные числа
                .sorted(Comparator.naturalOrder())  // Сортировка по возрастанию
                .forEach(x -> System.out.print(x + " "));  // Вывод

        System.out.println();
    }
}