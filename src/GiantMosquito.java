import java.time.Duration;
import java.time.LocalTime;

public class GiantMosquito extends Mosquito implements Annoyance {
    public GiantMosquito() {
        System.out.println("Be careful! It's a giant one!\n");
    }

    public static void main(String[] args) throws InterruptedException {
        Mosquito mosquito = new GiantMosquito();
        LocalTime timeOfBirth = LocalTime.now();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                LocalTime timeOfDeath = LocalTime.now();
                Duration duration = Duration.between(timeOfBirth, timeOfDeath);

                System.out.println("Smashed it.");
                System.out.println("It lived " + duration.getSeconds() + " seconds");
            }
        });

        mosquito.fly(Direction.FORWARD);
    }
}
