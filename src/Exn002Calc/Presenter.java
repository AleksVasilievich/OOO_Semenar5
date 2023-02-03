package Exn002Calc;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick() {
        Double a = view.getValue("a: ");
        Double b = view.getValue("b: ");
        Double z = view.getValue("z: ");
        model.setX(a);
        model.setY(b);
        model.setZ(z);
        Double result = model.result();
        view.print(result, "Res: ");
    }
}
