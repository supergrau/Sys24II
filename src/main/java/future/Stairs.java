package future;

public class Stairs {
    public static void main(String[] args) {
        // Declarations
        int height = 5;  // Chairs height
        int width = 4;   // Chais width

        String stairStep = "*".repeat(width);
        String spaces = " ".repeat(width);

        //System.out.println(stairStep);

        for (int i = 1; i <= height; i++) {
            // Spaces ausgeben
            for (int j = 1; j <= height - i; j++ ) {
                System.out.print(spaces);
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(stairStep);
            }
            System.out.println();
        }
    }
}
