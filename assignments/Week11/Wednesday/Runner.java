
public class Runner implements Runnable {

    private String name;
    private int distance;

    public Runner(String name) {
        this.name = name;
    }

    public int getDistance() {
        return this.distance;
    }

    public synchronized void run() {
        try {
            while (distance < 100) {
                Thread.sleep(1000);
                distance += 10;
                System.out.printf("%s has run %d meters so far.%n", name, distance);
            }
        } catch (InterruptedException e) {
        }
        
    } 
}