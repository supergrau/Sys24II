package future;

public class Password {
    public static void main(String[] args) {
        byte value = (byte)((Math.random() * 94 + 1) + 32);
            System.out.println((char)value);
            if ( 48 <= value && value <= 57 )
                System.out.println("digit!!");
            else if ( 65 <= value && value <= 90 )
                System.out.println("Großbuchstabe");
            else if ( 97 <= value && value <= 122 )
                System.out.println("Kleinbuchstabe");
            else
                System.out.println("Sonderzeichen");
    }
}
