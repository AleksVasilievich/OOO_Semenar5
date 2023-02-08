package Calc2;

/**
 * Класс для выбора операций калькулятора (Вывел все операции калькулятора в отдельный класс)
 * (Сдесь можно добавить новые опции)
 */
public class Option extends ShowResult {
     public Double Opt() {
        if (z == 1)
            return x + y;
        if (z == 2)
            return x - y;
        if (z == 3)
            return x * y;
        if (z == 4)
            return x / y;
        return null;

    }
}
