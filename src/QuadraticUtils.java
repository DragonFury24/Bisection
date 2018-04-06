import java.util.HashMap;

public class QuadraticUtils {
    public static double factor(Polynomial polynomial) {

    }

    public static double[] findSolnWithForm(Polynomial polynomial) {
        HashMap<String, Double> coeff = polynomial.getCoeffs();
        double a = coeff.get("a");
        double b = coeff.get("b");
        double c = coeff.get("c");

        double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
        double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;

        double[] solns = {x1, x2};
        return solns;
    }
}
