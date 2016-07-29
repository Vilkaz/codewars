package braceChecker;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by vkukanauskas on 21/07/2016.
 */
public class BraceChecker {
    public boolean isValid(String braces) {
        System.out.println(braces);

        char firstSymbol = braces.charAt(0);
        if (isClosingBracket(firstSymbol)) {
            return false;
        }
        char closingBracket = getClosingBracketToChar(firstSymbol);
        int positionOfClosingBracket = braces.indexOf(closingBracket);

        switch (positionOfClosingBracket) {
            case -1:
                return false;
            case 1:
                if (braces.length() == 2) {
                    return true;
                }
            default:
                return isValid(braces.substring(1, positionOfClosingBracket) + braces.substring(positionOfClosingBracket));
        }
    }

    private char getClosingBracketToChar(char firstSymbol) {
        char closingBracket = ' ';
        switch (firstSymbol) {
            case '(':
                closingBracket = ')';
                break;
            case '[':
                closingBracket = ']';
                break;
            case '{':
                closingBracket = '}';
                break;
        }
        return closingBracket;
    }

    private boolean isClosingBracket(char symbol) {
        return (symbol == ')' || symbol == ']' || symbol == '}');
    }

    public static void main(String[] args) {
        boolean test = new BraceChecker().isValid("{{[[]]}}))");
        System.out.println(test);
    }


}
