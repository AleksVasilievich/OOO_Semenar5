package Calc2;

/**
 * Класс "Кнопка" ключевые точки для запуска программы
 */
public class Presenter {
    Output out;
    View view;
    Model model;

    public Presenter(Model m, View v, Output o) {
        model = m;
        view = v;
        out = o;
    }
    public void buttonClick(){
        Double c = out.getValue("Команда --> ");
        Double a = out.getValue("Первое число --> ");
        Double b = out.getValue("Втотое число --> ");

        model.setZ(c);
        model.setX(a);
        model.setY(b);


        Double result = model.result();
        out.print(result, "Результат --> ");

    }
}
