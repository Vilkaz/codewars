package GsonTestfield;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by vkukanauskas on 28/07/2016.
 */
public class Main {

    public static void main(String[] args) {
        DataContainer2 d21 = new DataContainer2("datac11", 1);
        DataContainer2 d22 = new DataContainer2("datac22", 2);
        DataContainer2 d23 = new DataContainer2("datac33", 3);
        ArrayList<DataContainer2> dataContainer2s = new ArrayList<DataContainer2>(Arrays.asList(d21,d22,d23));
        DataDTO data = new DataDTO("meinString", 123, dataContainer2s);
        Gson gson = new Gson();
        String json = gson.toJson(data);
        System.out.println(json);
    }
}
