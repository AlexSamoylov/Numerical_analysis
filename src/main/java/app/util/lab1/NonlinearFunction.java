package app.util.lab1;

public class NonlinearFunction {
    final int a = 1; //always = 1;
    /**
     * custom variant parameters
     */
    int b = -1;
    int c = 2;
    int d = -3;


    public double F(double x) {
        return a * x * x * x
                + b * x * x
                + c * x
                + d;
    }

    public double dF(double x) {
        return 3 * a * x * x
                + 2 * b * x
                + c;
    }


    /**
     * custom variant formula
     * F / dF
     */
    public double dF2(double x) {
        return 6 * x - 4;
    }


    @Override
    public String toString() {
        return  "x^3 "
                + strParameter(b, "*x^2 ")
                + strParameter(c, "*x ")
                + strParameter(d, " ")
                + "= 0";
    }

    private String strParameter(double b, String sufix) {
        return b == 0 ? "" : str(b) + sufix;
    }


    private String str(double n) {
        return n < 0 ? String.valueOf(n) : "+" + String.valueOf(n);
    }
}
