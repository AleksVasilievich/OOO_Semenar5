package Calc2;

/**
 * Вывод на консоль
 */
public class Output extends View {
    public void OutputP() {
        System.out.println("Программа Калькулятор --- Меню ---");
        System.out.println("Введите команду на выбор :\n 1 - сложить; 2 - вычесть; 3 - умножить; 4 - делить");
    }

    public Double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }
    public void print(Double data, String title) {
        System.out.printf("%s %f\n", title, data);
    }
}
