import java.util.*;

public class ListOfFractions {
    List<Fraction> list = new ArrayList<>();
    Fraction memorizedMin, memorizedMax;

    void addFraction(Fraction fraction) {
        list.add(fraction);
        if (memorizedMax != null) {
            if (fraction.compareTo(memorizedMax) > 0) {
                memorizedMax = fraction;
            }
        }
        if (memorizedMin != null) {
            if (fraction.compareTo(memorizedMin) < 0) {
                memorizedMin = fraction;
            }
        }
    }

    Fraction minFraction() {
        if (memorizedMin == null) {
            memorizedMin = Collections.min(list);
        }
        return memorizedMin;
    }

    Fraction maxFraction() {
        if (memorizedMax == null) {
            memorizedMax = Collections.max(list);
        }
        return memorizedMax;
    }

    int countGreaterThan(Fraction fraction) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(fraction) > 0) {
                count++;
            }
        }
        return count;
    }

    int countLessThan(Fraction fraction) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(fraction) < 0) {
                count++;
            }
        }
        return count;
    }
}