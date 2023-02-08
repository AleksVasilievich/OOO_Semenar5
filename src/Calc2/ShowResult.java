package Calc2;

/**
 * Класс, реализующий поля и методы родительских класса и интерфейса
 */
public class ShowResult extends CalcMod {
    @Override
    public Double result() {
        Option on = new Option();
        return on.Opt();
    }

    @Override
    public void setX(double value) {
        x = value;
    }
    @Override
    public void setY(double value) {
        y = value;
    }
    @Override
    public void setZ(double value) {
        z = value;
    }
}
