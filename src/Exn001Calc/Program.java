package Exn001Calc;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите первое число , Затем второе");
        System.out.println("Затем Введите одну из цифр: 1 - сложить; 2 - вычесть; 3 - умножить; 4 - делить");
        var m = new ShowResult();
        var v = new View();
        Presenter p = new Presenter(m, v);
        p.buttonClick();
        System.out.println(m.x + " " + m.d + " " + m.y + " = " + m.result());
    }
}
