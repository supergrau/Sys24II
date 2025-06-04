package future;

import java.time.LocalDate;

public class Greeting {
    public static void main(String[] args) {
        int time = 4;
        String greet;

/*
        switch (time) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                greet = "Guten Morgen";
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                greet = "Guten Tag";
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                greet = "Guten Abend";
                break;
            default:
                greet = "Gute Nacht";
        }
*/
        switch (time) {
            case 4,5,6,7,8,9,10 -> greet = "Guten Morgen";
            case 11,12,13,14,15,16,17 -> greet = "Guten Tag";
            case 18,19,20,21,22 -> greet = "Guten Abend";
            default -> greet = "Gute Nacht";
        }
        System.out.println(greet);


    }
}
