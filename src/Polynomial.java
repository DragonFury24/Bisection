import java.util.HashMap;

public class Polynomial {
    private HashMap<String, Double> coeffs = new HashMap<>();

    public Polynomial(double a, double b, double c){
        coeffs.put("a", a);
        coeffs.put("b", b);
        coeffs.put("c", c);
    }

    public HashMap<String, Double> getCoeffs() {
        return coeffs;
    }

    public String toString() {

    }
}
