package future;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Methods {

    static void greet() {
        System.out.println("HELLO");
    }

    /**
     * Displays a message on the screen
     *
     * @param message message
     */
    static void greet(String message) {
        System.out.println(message);
    }

    static void logMessage(LocalDateTime date, String message) {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // Definiere das Format
        String formattedDate = date.format(myFormatObj); // Formatiere das Datum

        System.out.println(formattedDate + " " + message);
    }

    static String getLogMessage(LocalDateTime dateTime, String message) {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // Definiere das Format
        String formattedDate = dateTime.format(myFormatObj); // Formatiere das Datum

        return formattedDate + " --> " + message;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int... s) {
        int sum = 0;
        for (int i : s) {
            sum += i;
        }

        return sum;
    }

    static double avg(int... s) {
        return add(s) / (double)s.length;
    }

    /**
     * Delivers the sum
     * @param a summand one
     * @param b summand two
     * @return sum of a and b
     */
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Methods methods = new Methods();  // Instance of Methods
        methods.greet();
        greet();
        greet("Have a good day");

        logMessage(LocalDateTime.now(), "new log entry");

        String msg = getLogMessage(LocalDateTime.now(), "this is the error-message");
        System.err.println(msg);

        System.out.println(add(1, 2, 3));
        System.out.println(add(10, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println(add(5,6));
        System.out.println(avg(3, 6, 7));
    }
}
