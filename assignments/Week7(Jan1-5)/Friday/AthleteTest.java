import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class AthleteTest {

    public static void main(String[] args) {
        
        List<Athlete> athletes = new ArrayList<>(8);
        athletes.add(new Athlete("Jack Nicklaus", 75, 595));
        athletes.add(new Athlete("Lindsey Vonn", 82, 395));
        athletes.add(new Athlete("Mikaela Shiffrin", 82, 232));
        athletes.add(new Athlete("Novak Djokovic", 92, 280));
        athletes.add(new Athlete("Rafael Nadal", 92, 304));
        athletes.add(new Athlete("Roger Federer", 103, 367));
        athletes.add(new Athlete("Serena Williams", 73, 240));
        athletes.add(new Athlete("Tiger Woods", 82, 395));

        // System.out.println("\nBefore Testing Sort with Comparator:\n" + athletes);
        // Collections.sort(athletes, new AthleteComparator());
        // System.out.println("\nSorting Least to Greatest Win Percentage:\n" + athletes);
        // Collections.sort(athletes, new AthleteComparator().reversed());
        // System.out.println("\nSorting Greatest to Least Win Percentage:\n" + athletes);

        System.out.println("\nBefore Testing Sort with Comparable:\n" + athletes);
        Collections.sort(athletes);
        System.out.println("\nSorting Least to Greatest Win Percentage:\n" + athletes);
        Collections.sort(athletes, Comparator.reverseOrder());
        System.out.println("\nSorting Greatest to Least Win Percentage:\n" + athletes);

        List<Athlete> bonus = new ArrayList<>(2);
        bonus.add(new Athlete("Sean Carter", 1, 2));
        bonus.add(new Athlete("Mikaela Shiffrin", 82, 232));

        System.out.println("\nBefore Testing Bonus Sort with Comparable:\n" + bonus);
        Collections.sort(bonus);
        System.out.println("\nSorting Least to Greatest Events Won:\n" + bonus);
        Collections.sort(bonus, Comparator.reverseOrder());
        System.out.println("\nSorting Greatest to Least Events Won:\n" + bonus);
    }
}