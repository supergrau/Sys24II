package future;

public class RollTurf {
    public static void main(String[] args) {
        // Declarations|Input:
        double l = 13.0, gl = 27.0, b = 26.0, d = 3.0;
        double A1, A2, A3, A;

        // Processing:
        A1 = b * l;
        A2 = b / 2 * (gl - l);
        A3 = Math.PI * d * d / 4;
        A = A1 + A2 - A3;

        // Output
        System.out.printf("%.2f",A);
    }
}
