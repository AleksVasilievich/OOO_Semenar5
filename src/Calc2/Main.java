package Calc2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        var m = new ShowResult();
        var v = new View();
        var o = new Output();
        var l = new Log();
        o.OutputP();
        Presenter p = new Presenter(m, v, o);
        p.buttonClick();
        l.log();
    }
}
