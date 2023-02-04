package Exn001Calc;

import java.lang.constant.Constable;

public class ShowResult extends CalcModel {
    String d;

    public ShowResult() {
    }

    @Override
    public Double result() {
        if (z == 1) {
            d = "+";
            return x + y;
        }
        if (z == 2) {
            d = "-";
            return x - y;
        }
        if (z == 3) {
            d = "*";
            return x * y;
        }
        if (z == 4) {
            d = "/";
            return x / y;
        }
        return null;
    }

    @Override
    public void setX(Double value) {
        super.x = value;
    }

    @Override
    public void setY(Double value) {
        super.y = value;
    }

    @Override
    public void setZ(Double value) {
        super.z = value;
    }
}
