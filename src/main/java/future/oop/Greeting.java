package future.oop;

/**
 * An Example for create a class
 */
public class Greeting {
    // Attributes|Fields
    private String username = "not set";
    private String greet = "not set";

    /**
     * Constructor: set username and greet
     *
     * @param username Username as String
     * @param greet Greet as String
     */
    public Greeting(String username, String greet) {
        if (username != null && !username.isEmpty())
            this.username = username;
        setGreet(greet);
    }

    /**
     * Change the greet
     * @param greet Greet as String
     */
    public void setGreet(String greet) {
        if (greet != null && !greet.equals(""))
            this.greet = greet;
    }

    /**
     * get the greet compilation
     *
     * @return greet compilation
     */
    public String getGreeting() {
        return "Hello dear " + username + ". " + greet;
    }

    /**
     * Show greet on screen
     */
    public void printGreet() {
        System.out.println(getGreeting());
    }

    @Override
    public String toString() {
        return getClass().getName()+"[username=" + this.username+", greet="+this.greet+"]";
    }

}
