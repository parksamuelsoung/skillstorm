public class Station {
    
    private int stationNumber;
    private Patron patron;

    public Station(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public Station(short stationNumber, Patron patron) {
        this.stationNumber = stationNumber;
        this.patron = patron;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(short stationNumber) {
        this.stationNumber = stationNumber;
    }

    public Patron getPatron() {
        return patron;
    }

    public void setPatron(Patron patron) {
        this.patron = patron;
    }

    @Override
    public String toString() {
        return "" + stationNumber;
    }

    
}
