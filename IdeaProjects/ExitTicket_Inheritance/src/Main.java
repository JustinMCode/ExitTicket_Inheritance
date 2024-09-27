public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Hot-dog", "Tuna");
        cats[1] = new Rat("Hamburger", "Salmon", 2);
        cats[2] = new Rat("Hamburger", "Salmon", 4);
        cats[3] = new Cockroaches("Steak", "Ice-Cream", 3);
        cats[4] = new Cockroaches("Filet", "Pudding", 13);

        // Loop through each object and output to console.
        for (Cat c : cats) {
            System.out.println(c);
        }
    }
}
