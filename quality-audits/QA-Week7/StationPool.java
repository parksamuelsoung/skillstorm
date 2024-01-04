import java.util.LinkedList;
import java.util.Queue;

public class StationPool {

    private static final short NUM_OF_STATIONS = 3;
    private Queue<Station> availableStations = new LinkedList<>();

    public StationPool(){}

    public StationPool(Queue<Station> availableStations) {
        this.availableStations = availableStations;
    }

    public Station addStation(Station station) {
        if (availableStations.size() <= NUM_OF_STATIONS) {
            availableStations.add(station);
        } else {
            System.out.println("There are no more available stations currently.");
            return null;
        }
        return station;
    }

    public Station callPatron() {
        return availableStations.poll();
    }

    @Override
    public String toString() {
        return "\nAvailable Stations:" + availableStations + "\n";
    }

    
    
    
    
}
