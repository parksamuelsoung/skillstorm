import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    private String name;
    private LocalDate DOB;

    public Person(String name, LocalDate DOB) {
        this.name = name;
        this.DOB = DOB;
    }

    public String getName() {
        return this.name;
    }

    public int calculateAge() {
        return DOB.until(LocalDate.now()).getYears();
    }

    public String formatDOB() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM, uuuu");
        return formatter.format(DOB);
    }

    @Override
    public String toString() {
        return String.format("%s was born on %s and is %s years old.", name, formatDOB(), calculateAge());
    }

    
}