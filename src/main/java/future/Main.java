package future;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Verschiedene Datenquellen:
        // - Datenbank (ist eine anderes Thema)
        // - Konstanten
        // - Einlesen von der Tastatur

/*
        // Ein Konstante definieren:
        final String WELCOME = "Hallo und willkommen!";
        final String LINEFEED = "line-feed";
        final int VALUE1 = 1234;


        // Einlesen von Werten mit Hilfe der Tastatur
        Scanner scanner = new Scanner(System.in);

        int age = 0;  // Deklaration und Initialisierung einer Variablen

        System.out.print("Your age please: ");
        age = scanner.nextInt();
        System.out.println("Age = " + age);
        // Verschiedene Ausgabemöglichkeiten
        System.out.println(LINEFEED);
        System.out.print("Without line-feed - ");
        System.out.printf(WELCOME);
        System.out.println("Selber hallo");
        System.out.println(WELCOME);

        System.out.printf("Integer-Value: %5d\n", VALUE1);

        double salary = 0.0;
        System.out.print("Double-Value please: ");
        salary = scanner.nextDouble();

        System.out.printf("Double-Value: %6.2f\n", salary / 2);
        System.out.print("Text please: ");
        String line = scanner.next();
        line = line + scanner.nextLine();
        System.out.println(line);

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
*/

        long greatValue = 1_000_000_000;
        float capital = (float)1.79769;
        System.out.println(greatValue);
        System.out.println(capital);


    }
}