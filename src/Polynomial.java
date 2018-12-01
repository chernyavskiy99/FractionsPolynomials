import java.util.List;

public class Polynomial {
    // private
    // final
    List<Fraction> coefficients;

    Polynomial(ListOfFractions listOfFractions) {
        coefficients = listOfFractions.list;
    }

    Polynomial addPolynomial(Polynomial polynomial) {
        for (int i = 0; i < Math.max(polynomial.coefficients.size(), coefficients.size()); i++) {
            if (i >= coefficients.size()) {
                coefficients.add(polynomial.coefficients.get(i));
            }
            if (i < Math.min(polynomial.coefficients.size(), coefficients.size())) {
                coefficients.get(i).addFraction(polynomial.coefficients.get(i));
            }
        }
        return this;
    }

    @Override
    public String toString() {
        String polynomial = "";
        for (int i = coefficients.size() - 1; i > 0; i--) {
            polynomial += coefficients.get(i).toString() + "x^" + i;
            if (coefficients.get(i).compareTo(new Fraction(0, 1)) > 0) {
                polynomial += " + ";
            }
        }
        polynomial += coefficients.get(0).toString();
        return String.format("Polynomial{%s}", polynomial);
    }
}
