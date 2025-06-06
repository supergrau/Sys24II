package future.oop;

public class GreetingUse {
    public static void main(String[] args) {
        Greeting greetingMax = new Greeting("Max", "Have a nice day.");

//        greeting.username = "Max";
//        greeting.greet = "Have a nice day.";

        greetingMax.printGreet();

        // change greet
        String g = null;
        greetingMax.setGreet(g);
        greetingMax.printGreet();
        greetingMax.setGreet("have fun");
        greetingMax.printGreet();
        String greetmax = greetingMax.getGreeting();
        System.out.println(greetmax);


        // greet for luise
        Greeting greetingLuise = new Greeting("Luise", null);
        greetingLuise.printGreet();
        greetingLuise.setGreet("Welcome to the machine!");
        greetingLuise.printGreet();

        System.out.println(greetingMax);
    }
}
