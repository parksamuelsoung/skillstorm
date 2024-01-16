import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {

    public static void main(String[] args) {

        // Part 1
        Person person1 = new Person("Sarah", LocalDate.of(2000, 12, 31));
        System.out.println(person1);

        // Part 2
        Appointment appointment1 = new Appointment(ZonedDateTime.of(2024, 01, 22, 13, 30, 0, 0, ZoneId.systemDefault()), Duration.ofMinutes(90));
        appointment1.alert();

        // Bonus
        Person person2 = new Person("Marah", LocalDate.of(1999, 12, 31));
        System.out.println();

        AgeComparator ageComparator = new AgeComparator();
        int ageCompValue = ageComparator.compare(person1, person2);
        if (ageCompValue == 0) {
            System.out.printf("%s is the same age as %s.", person1.getName(), person2.getName());
        } else if (ageCompValue > 0) {
            System.out.printf("%s is older than %s.", person1.getName(), person2.getName());
        } else {
            System.out.printf("%s is younger than %s.", person1.getName(), person2.getName());
        }
    
    }
    
}
