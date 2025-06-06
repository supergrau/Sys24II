package future;

public class MemMon {
    public static void main(String[] args) {
        int sumLast = 0;
        int mwTag = 0;
        int mwVormittag = 0;
        int mwNachmittag = 0;

        int[] maxRAM =
                {83, 54, 40, 52, 60, 56, 33, 44, 40, 52, 60, 56, 33, 44, 40, 52, 60, 56, 33, 44, 40, 52, 60, 56};

        for (int i = 0; i < 24; i++) {
            sumLast = sumLast + maxRAM[i];
        }
        mwTag = sumLast / 24;

        System.out.println("Mittelwert des Tages: " + mwTag);

        sumLast = 0;
        for (int i = 0; i < 12; i++) {
            sumLast = sumLast + maxRAM[i];
        }
        mwVormittag = sumLast / 12;

        sumLast = 0;
        for (int i = 12; i < 24; i++) {
            sumLast = sumLast + maxRAM[i];
        }
        mwNachmittag = sumLast / 12;

        if(mwVormittag > mwNachmittag) {
            System.out.println("Mittelwert Vormittag: " + mwVormittag);
            System.out.println("Mittelwert Nachmittag: " + mwNachmittag);
        } else {
            System.out.println("Mittelwert Nachmittag: " + mwNachmittag);
            System.out.println("Mittelwert Vormittag: " + mwVormittag);
        }


    }
}
