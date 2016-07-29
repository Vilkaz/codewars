package romanNumeralsEncoder;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by vkukanauskas on 29/07/2016.
 */
public class Conversion {

    private ArrayList<String> romanNumbers = new ArrayList<String>(Arrays.asList("I", "V", "X", "L", "C", "D", "M"));
    private int counter;

    public String solution(int number) {
        counter = 0;
        String romanNumber = "";
        while (number > 0) {
            romanNumber = getRomanNumberForSingleDigit(number % 10) + romanNumber;
            number = number / 10;
            counter++;
        }
        return romanNumber;
    }

    private String getRomanNumberForSingleDigit(int number) {
        if (number == 0) {
            return "";
        }
        if (number < 4) {
            return getRomanianNumberLessThenFour(number);
        }

        if (number < 9) {
            return getRomanianNumberBetweenFourAndEight(number);
        }
        return getOne() + getTen();
    }

    private String getRomanianNumberBetweenFourAndEight(int number) {
        String five = getFive();
        String one = getOne();
        if (number - 5 < 0) {
            return one + five;
        } else {
            String romanNumber = five;
            int index = 5;
            while (number > 5 && index < number) {
                romanNumber += one;
                index++;
            }
            return romanNumber;
        }
    }

    private String getRomanianNumberLessThenFour(int number) {
        String one = getOne();
        String romanNumber = "";
        for (int i = 0; i < number; i++) {
            romanNumber += one;
        }
        return romanNumber;
    }

    /**
     * gives you I,X,C in dependency of Counter
     */
    private String getOne() {
        return romanNumbers.get(counter * 2);
    }

    /**
     * gives you V,L,D in dependency of Counter
     */
    private String getFive() {
        return romanNumbers.get(1 + counter * 2);
    }


    /**
     * gives you X,C,M in dependency of Counter
     *
     * @return
     */
    private String getTen() {
        return romanNumbers.get(2 + counter * 2);
    }


}

