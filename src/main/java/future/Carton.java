package future;

public class Carton {
    public static void main(String[] args) {

        // Declaration|Input
        int bottles = 333, capacity = 20;

        // Processing
        int numberOfCartons = bottles / capacity;
        int remainingBottles = bottles - (numberOfCartons * capacity);

        // Output
        System.out.println("Number of cartons: " + numberOfCartons);
        System.out.println("Remaining Bottles: " + remainingBottles);
    }
}
