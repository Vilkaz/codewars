package romanNumeralsEncoder;

/**
 * Created by vkukanauskas on 29/07/2016.
 */
public class ConversionMuster1 {

    public String solution(int number) {
        String romanNumbers[] = {"M", "CMXC", "CM", "D", "CDXC", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (number > 0 || arab.length == (i - 1)) {
            while ((number - arab[i]) >= 0) {
                number -= arab[i];
                result.append(romanNumbers[i]);
            }
            i++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
//        ConversionMuster1 cm1 = new ConversionMuster1();
//        System.out.println(cm1.solution(10));
        System.out.println(1 % 4);
        System.out.println(2 % 4);
        System.out.println(3 % 4);
        System.out.println(4 % 4);
        System.out.println(5 % 4);
        System.out.println(6 % 4);
        System.out.println(7 % 4);
        System.out.println(8 % 4);
        System.out.println(9 % 4);
    }
}
