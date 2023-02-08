package Exn003Calc;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick() {
        Double c = view.getValue("Команда --> ");
        Double a = view.getValue("Первое число --> ");
        Double b = view.getValue("Втотое число --> ");

        model.setZ(c);
        model.setX(a);
        model.setY(b);

        Double result = model.result();
        view.print(result, "Результат --> ");
    }
}
