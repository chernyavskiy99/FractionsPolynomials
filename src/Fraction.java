public class Fraction implements Comparable<Fraction> {
    private int numerator;
    private int denominator;

    Fraction(Integer m, Integer n) {
        this.numerator = m / utils.GCD(m, n);
        this.denominator = n / utils.GCD(m, n);
    }

    Fraction() {
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    Fraction addFraction(Fraction fraction) {
        return new Fraction(numerator * fraction.denominator + fraction.numerator * denominator,
                denominator * fraction.denominator);
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }

    @Override
    public int compareTo(Fraction o) {
        return numerator * o.denominator - o.numerator * denominator;
    }
}
