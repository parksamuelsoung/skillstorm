import java.util.Comparator;

public class AthleteComparator implements Comparator<Athlete> {
    
    public AthleteComparator() {}

    public float calcWinPercentage(Athlete athlete) {
        return (float) athlete.getNumOfWins() / (float) athlete.getNumOfEvents();
    }

    @Override
    public int compare(Athlete a, Athlete b) {

        if (a.getNumOfEvents() <= 30 || b.getNumOfEvents() <= 30) {
            if (a.getNumOfWins() - b.getNumOfWins() < 0) {
                return -1;
            } else if (a.getNumOfWins() - b.getNumOfWins() > 0) {
                return 1;
            } else {
                return 0;
            }
        }

        if (calcWinPercentage(a) - calcWinPercentage(b) < 0) {
            return -1;
        } else if (calcWinPercentage(a) - calcWinPercentage(b) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
