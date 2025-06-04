package future;

public class Loops {
    public static void main(String[] args) {
/*        System.out.println("Hallo Welt");
        System.out.println("Hallo Welt");
        System.out.println("Hallo Welt");
        System.out.println("Hallo Welt");
        System.out.println("Hallo Welt");*/

        final int MAX = 10;

        int count = 0;
        // Abweisende|kopfgesteuerte Schleife
        while (count < MAX) {
            System.out.println(++count + ": Hallo Welt");
//            count++;
        }
        while (true) {
            System.out.println(count);
            count--;
            if (count == 5) break;
        }
        count = 10;
        // Nicht abweisende|fußgesteuerte Schleife
        do {
            count++;
        } while (count < MAX);
        System.out.println(count);

        // Summer der ersten 10 natürlichen Zahlen (1+2+3+4+5+6+7+89+10)
        int sum = 0;
        count = 1;
        while (count <= MAX) {
            sum += count;
            count++;
        }
        System.out.println(sum);

        // Nur gerade Zahle von 1 bis 20 ausgeben
        count = 0;
        while (count <= 20) {
            count++;
            if (count % 2 == 0) System.out.println(count);
        }

        // Eine Linie aus Sterchen (*) zeichnen
        for (int i = 0; i < 20; i++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.println();

        // Ein Rechteck aus Sternchen zeichnen
        for (int j = 0; j < 5; j++) {
            if (j == 3) continue;
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println(j);
        }

    }
}
