package Calc2;
/**
 * Ввод
 */

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    public Double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }
    public void print(Double data, String title) {
        System.out.printf("%s %f\n", title, data);
    }
}

