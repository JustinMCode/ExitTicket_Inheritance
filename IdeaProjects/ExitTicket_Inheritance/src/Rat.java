public class Rat extends Cat {
    private final int numOfRats;

    public Rat(String dryFood, String wetFoot, int numOfRats) {
        super(dryFood, wetFoot);
        this.numOfRats = numOfRats;
    }

    // Getter method for numOfRats
    public int getNumOfRats() {
        return numOfRats;
    }

    // Override the toString() method
    public String toString() {
        return "Cat eats " + getDryFood() + ", and hates " + getWetFood() + ". So " + numOfRats + " rats show up and eat the " + getWetFood() + " bringing the black plague.";
    }
}
