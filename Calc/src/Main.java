public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);  // 3
        int b = calc.minus.apply(1, 1); // 0
        int c = calc.divide.apply(a, b); // 0 (вместо ошибки)

        calc.println.accept(c); // Выведет 0

        // Дополнительная проверка перед операцией
        if (b != 0) {
            int d = calc.divide.apply(a, b);
            calc.println.accept(d);
        } else {
            System.out.println("Деление на ноль невозможно");
        }
    }
}