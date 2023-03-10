package Exn002Calc;


public class ShowResult extends CalcModel {
    public ShowResult() {
    }

    @Override
    public Double result() {
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

    @Override
    public void setX(Double value) {
        x = value;
    }

    @Override
    public void setY(Double value) {
        y = value;
    }

    @Override
    public void setZ(Double value) {
        z = value;
    }
}
