public class Cockroaches extends Cat {
    private final int numOfCockroaches;

    // Child constructor
    public Cockroaches(String dryFood, String wetFood, int numOfCockroaches) {
        super(dryFood, wetFood);
        this.numOfCockroaches = numOfCockroaches;
    }

    // Getter method
    public double getNumCaught() {
        return numOfCockroaches;
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "Cat eats " + getWetFood() + " and hates " + getDryFood() + ". So " + numOfCockroaches + " cockroaches show up and eat the " + getDryFood() + " and infest the house.";
    }
}
