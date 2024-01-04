import java.util.LinkedList;
import java.util.Queue;

public class WaitingLine {
    
    private Queue<Patron> waitingNow = new LinkedList<>();
    private short ticketNumber = 100;

    public WaitingLine() {}

    public WaitingLine(LinkedList<Patron> waitingNow) {
        this.waitingNow = waitingNow;
    }

    public Patron addPatron(Patron patron) {
        patron.setTicketNumber(++ticketNumber);
        patron.setReasonCode();
        waitingNow.add(patron);
        System.out.println(patron.getName() + "'s Ticket#: " + patron);
        return patron;
    }

    public void nextPatron() {
        System.out.println("Next Ticket#: " + waitingNow.peek() + ". Please have your documents ready.");
    }

    public void servePatron(Station station) {
        Patron patron = waitingNow.poll();
        station.setPatron(patron);
        System.out.println("Ticket#: " + patron + " is now being served at station number " + station);
    }

    @Override
    public String toString() {
        return "\nWaiting: " + waitingNow + "\n";
    }
    
}