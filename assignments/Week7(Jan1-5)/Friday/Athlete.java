
public class Athlete implements Comparable<Athlete> {

    private String name;
    private int numOfWins;
    private int numOfEvents;
    private float winPercentage;
    
    public Athlete() {
    }

    public Athlete(String name, int numOfWins, int numOfEvents) {
        this.name = name;
        this.numOfWins = numOfWins;
        this.numOfEvents = numOfEvents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfWins() {
        return numOfWins;
    }

    public void setNumOfWins(int numOfWins) {
        this.numOfWins = numOfWins;
    }

    public int getNumOfEvents() {
        return numOfEvents;
    }

    public void setNumOfEvents(int numOfEvents) {
        this.numOfEvents = numOfEvents;
    }

    public void setWinPercentage() {
        this.winPercentage = (float) numOfWins / (float) numOfEvents;
    }

    public float calcWinPercentage(Athlete athlete) {
        return (float) athlete.getNumOfWins() / (float) athlete.getNumOfEvents();
    }

    @Override
    public int compareTo(Athlete otherAthlete) {
        setWinPercentage();
        otherAthlete.setWinPercentage();

        if (this.numOfEvents <= 30 || otherAthlete.numOfEvents <= 30) {
            if (this.numOfWins - otherAthlete.numOfWins < 0) {
                return -1;
            } else if (this.numOfWins - otherAthlete.numOfWins > 0) {
                return 1;
            } else {
                return 0;
            }
        }

        if (this.winPercentage - otherAthlete.winPercentage < 0) {
            return -1;
        } else if (this.winPercentage - otherAthlete.winPercentage > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + numOfWins;
        result = prime * result + numOfEvents;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Athlete other = (Athlete) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (numOfWins != other.numOfWins)
            return false;
        if (numOfEvents != other.numOfEvents)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }

    
}