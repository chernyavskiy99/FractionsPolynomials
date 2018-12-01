import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("in.txt"))) {
            List<Integer> numbers = new ArrayList<>();
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            System.out.println(numbers);
            ListOfFractions listOfFractions4 = new ListOfFractions();
            for (int i = 0; i < numbers.size(); i += 2) {
                listOfFractions4.addFraction(new Fraction(numbers.get(i), numbers.get(i + 1)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Fraction fraction = new Fraction(3, 8);
        Fraction fraction3 = new Fraction(1, 2);
        ListOfFractions listOfFractions2 = new ListOfFractions();
        listOfFractions2.addFraction(fraction3);
        listOfFractions2.addFraction(fraction);
        listOfFractions2.addFraction(new Fraction(-1, 3));
        listOfFractions2.addFraction(new Fraction(1, 4));
        listOfFractions2.addFraction(new Fraction(4, 2));
        listOfFractions2.addFraction(new Fraction(-13, 3));
        listOfFractions2.addFraction(new Fraction(8, 1));
        System.out.println(listOfFractions2.maxFraction());
        System.out.println(listOfFractions2.minFraction());
        System.out.println(listOfFractions2.countGreaterThan(new Fraction(3, 1)));
        System.out.println(listOfFractions2.countLessThan(new Fraction(3, 1)));
        for (Fraction elem : listOfFractions2.list) {
            System.out.println(elem);
        }
        /* ---------------------------------------------------------------------------------------------------------- */
        ListOfFractions listOfFractions3 = new ListOfFractions();
        listOfFractions3.addFraction(new Fraction(3, 4));
        listOfFractions3.addFraction(new Fraction(-2, 3));
        listOfFractions3.addFraction(new Fraction(4, 8));
        for (Fraction elem : listOfFractions3.list) {
            System.out.println(elem);
        }
        Polynomial polynomial2 = new Polynomial(listOfFractions2);
        Polynomial polynomial3 = new Polynomial(listOfFractions3);
        Polynomial polynomial4 = polynomial2.addPolynomial(polynomial3);
        System.out.println(polynomial4);
    }
}
