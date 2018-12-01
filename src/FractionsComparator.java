import java.util.Comparator;

public class FractionsComparator implements Comparator<Fraction> {
    public int compare(Fraction first, Fraction second) {
        return first.getNumerator() * second.getDenominator() - second.getNumerator() * first.getDenominator();
    }
}