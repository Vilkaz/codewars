package hammingNumbers;

/**
 * Created by vkukanauskas on 29/07/2016.
 */
public class Hamming {

    private static int a, b, c;
    private static int number;
    private static long result;

    public static long hamming(int n) {
        number = n;
        initPower(n);
        return getNNumberPowered();
    }

    private static long getNNumberPowered() {
        result =  Math.round(Math.pow(2, a) * Math.pow(3, b) * Math.pow(5, c));
        return result;
    }

    private static void initPower(int number) {
        int modulo = number % 4;
        int n = (number / 4);
        switch (modulo) {
            case (0):
                a = 2;
                b = 0;
                c = n - 1;
                break;
            case (1):
                a = 0;
                b = 0;
                c = n;
                break;
            case (2):
                a = 1;
                b = 0;
                c = n;
                break;
            case (3):
                a = 0;
                b = 1;
                c = n;
                break;
        }
    }

}
