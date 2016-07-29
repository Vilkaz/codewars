package bingo;

import java.util.*;

/**
 * Created by vkukanauskas on 21/07/2016.
 */

public class BingoCard {
    private static Random randomGenerator = new Random();

    public static String[] getCard() {
        String[] bingoCard = new String[24];
        int bingoFieldNumber = 0;
        for (int letterIndex = 0; letterIndex < 5; letterIndex++) {
            int neededNumbers = (letterIndex == 2) ? 4 : 5;
            for (int bingoNumber = 0; bingoNumber < neededNumbers; bingoNumber++) {
                bingoCard[bingoFieldNumber++] = getBingoNumber(letterIndex, bingoCard);
            }
        }
        return bingoCard;
    }

    private static String getBingoNumber(int letterIndex, String[] bingoCArd) {
        String bingoNumber;
        do {
            int number = randomGenerator.nextInt(14) + 1 + (15 * letterIndex);
            bingoNumber = "BINGO".charAt(letterIndex) + String.valueOf(number);
        } while (Arrays.asList(bingoCArd).contains(bingoNumber));
        return bingoNumber;
    }


    public static void main(String[] args) {
        String[] bingoCard = getCard();
        System.out.println(bingoCard.length);
        System.out.println("debug here");
    }


}
