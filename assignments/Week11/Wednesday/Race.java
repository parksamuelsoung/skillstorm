import java.util.concurrent.locks.ReentrantLock;

public class Race {

    private static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {

        Runner gilbert = new Runner("Gilbert");
        Runner nancy = new Runner("Nancy");

        Thread gilbertThread = new Thread(gilbert);
        Thread nancyThread = new Thread(nancy);   
        
        System.out.println("Ready, set, go!");

        gilbertThread.start();
        nancyThread.start(); 

        try {
            while (gilbertThread.isAlive() && nancyThread.isAlive()) {
                if (gilbert.getDistance() == 100) {
                    nancyThread.interrupt();
                    reentrantLock.lock();
                    System.out.println("Gilbert won!");
                } else if (nancy.getDistance() == 100) {
                    gilbertThread.interrupt();
                    reentrantLock.lock();
                    System.out.println("Nancy won!");
                }
            }    
            gilbertThread.join();
            nancyThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("The race is over.");
        }
        
        
    }
}
