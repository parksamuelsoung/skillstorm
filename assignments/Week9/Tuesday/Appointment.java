import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {
    
    private ZonedDateTime start;
    private Duration duration;

    public Appointment(ZonedDateTime start, Duration duration) {
        this.start = start;
        this.duration = duration;
    }

    public void alert() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d MMM uuuu");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a z");
        System.out.printf("You have a %s minute appointment on %s at %s",
            duration.toMinutes(), start.format(dateFormatter), start.format(timeFormatter));
    }

    
}
