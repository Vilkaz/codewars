package decompose;

/**
 * Created by vkukanauskas on 02/08/2016.
 */
public class Decompose {


    public String decompose(long number) {
        boolean valid = true;
        int fittingSquare = getNextFittingSquare(number);
        String result = "";
        int restNumber = (int) (Math.pow(number,2) - Math.pow(fittingSquare,2));
        if (restNumber!=0){
            System.out.println("number="+number+" rest="+restNumber);
            decompose(restNumber);
        }
        return result;

    }

    private int getNextFittingSquare(long number) {
        return (int) Math.sqrt(number)-1;
    }
}
