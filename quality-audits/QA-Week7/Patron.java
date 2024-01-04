public class Patron {

    private String name;
    private String reason;
    private short ticketNumber;
    private char reasonCode;

    public Patron() {
    }
    
    public Patron(String name, String reason) {
        this.name = name;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setTicketNumber(short ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public short getTicketNumber() {
        return ticketNumber;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public char getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode() {
        if (reason == null) {
            System.out.println("Reason cannot be blank.");
        } else if (reason.equals("license")) {
            this.reasonCode = 'l';
        } else if (reason.equals("renewal") ||
                   reason.equals("renew")) {
            this.reasonCode = 'n';
        } else if (reason.equals("registration") ||
                   reason.equals("register")) {
            this.reasonCode = 'r';
        } else {
            System.out.println("Not a valid reason.");
        }
    }

    @Override
    public String toString() {
        return "" + reasonCode + ticketNumber;
    }

    
    
    
}
