package hammingNumbers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by vkukanauskas on 29/07/2016.
 */
public class Hamming {

    private static ArrayList<Integer> invalidNumbers = new ArrayList<Integer>();

    private static ArrayList<Integer> listOfValidNumbers = generateListOfValidNumbers();

    private static ArrayList<Integer> generateListOfValidNumbers() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i=1;
        while (list.size()<500){
            if (validNumber(i)) {
                list.add(i);
            }
            i++;
        }
        return list;
    }

    private static boolean validNumber(int i) {
        if (i==1 || i==2 ||i==3 ||i==5){
            return true;
        }
        if (invalidNumbers.contains(i)){
            return  false;
        }

        if (i > 6 && isPrime(i)) {
            invalidNumbers.add(i);
            return false;
        } else {
            int a = i % 2;
            int b = i % 3;
            int c = i % 5;
            if (a!=0 && b!=0 && c!=0 ){
                invalidNumbers.add(i);
                return false;
            } else {
                if (a == 0) {
                    return validNumber(i / 2);
                }
                if (b == 0) {
                    return validNumber(i / 3);
                }
                if (c == 0) {
                    return validNumber(i / 5);
                }
            }
        }
        return true;
    }

    //checks whether an int is prime or not.
    private static boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n % 2 == 0) return false;
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static long hamming(int y) {
        return listOfValidNumbers.get(y - 1);

    }

    public static void main(String[] args) {

    }


}
