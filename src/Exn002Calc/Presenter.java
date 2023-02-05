package Exn002Calc;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick() {
        Double z = view.getValue("Команда --> ");
        Double a = view.getValue("Первое число --> ");
        Double b = view.getValue("Втотое число --> ");

        model.setZ(z);
        model.setX(a);
        model.setY(b);

        Double result = model.result();
        view.print(result, "Результат --> ");
    }
}
