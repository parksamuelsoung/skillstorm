public class DMV {

    public static void main(String[] args) {
        System.out.println("\nThe Sedgwick County DMV is now open!\n");
        StationPool availableStations = new StationPool();
        Station station1 = new Station(1);
        Station station2 = new Station(2);
        Station station3 = new Station(3);
        availableStations.addStation(station1);
        availableStations.addStation(station2);
        availableStations.addStation(station3);
        System.out.println(availableStations);

        WaitingLine waitingLine = new WaitingLine();
        waitingLine.addPatron(new Patron("Bill", "renew"));
        waitingLine.addPatron(new Patron("Nancy", "license"));
        waitingLine.addPatron(new Patron("Robert", "register"));
        System.out.println(waitingLine);

        Station callingStation = availableStations.callPatron();
        waitingLine.servePatron(callingStation);

        System.out.println(availableStations);
        waitingLine.nextPatron();
        System.out.println(waitingLine);

    }
    
    
}
