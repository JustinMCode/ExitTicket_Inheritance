public class Cat {
    private final String wetFood;
    private final String dryFood;

    // Constructor
    public Cat(String wetFood, String dryFood) {
        this.wetFood = wetFood;
        this.dryFood = dryFood;
    }

    // Getter Method for wetFood
    public String getWetFood() {
        return wetFood;
    }

    // Getter Method for dryFood
    public String getDryFood() {
        return dryFood;
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "Cat eats " + dryFood + ", and hates " + wetFood;
    }
}


