public class Mosquito implements Annoyance {
    public Mosquito() {
        System.out.println("\nIt's a mosquito!");
    }
    
    protected void fly(Direction direction) throws InterruptedException {
        while(true) {
            boolean clear = checkIfClear(direction);

            if (clear) {
                System.out.print("Flying " + direction);
                beAnnoying();
            } else { // joke: the mosquito will keep going forward against a window either way
                System.out.print("Flying " + direction);
                beAnnoying();
            }
            Thread.sleep(1000);
        }
    }
    
    private boolean checkIfClear(Direction direction) {
        // most probably not clear in that direction
        return false;
    }
    
    @Override
    public void beAnnoying() {
        // it is being annoying
        System.out.println(" -- Bzzzzzz");
    }
}

enum Direction {
    // without loss of generality we will use only FORWARD
    FORWARD
}
