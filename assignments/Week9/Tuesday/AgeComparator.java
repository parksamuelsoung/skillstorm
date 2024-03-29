import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    
    public int compare(Person o1, Person o2) {
        return o1.calculateAge() - o2.calculateAge();
    }
}
