package Exn003Calc;
public class Program {
    public static void main(String[] args) {
        System.out.println("Программа Калькулятор --- Меню ---");
        System.out.println("Введите команду на выбор :\n 1 - сложить; 2 - вычесть; 3 - умножить; 4 - делить");
        var m = new ShowResult();
        var v = new View();
        var l = new Log();
        Presenter p = new Presenter(m, v);
        p.buttonClick();
        l.log();
    }

}
