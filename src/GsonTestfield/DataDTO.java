package GsonTestfield;

import java.util.ArrayList;

/**
 * Created by vkukanauskas on 28/07/2016.
 */
public class DataDTO {
    private String string;
    private int number;
    private ArrayList<DataContainer2> dataContainers;

    public DataDTO(String string, int number, ArrayList<DataContainer2> dataContainers) {
        this.string = string;
        this.number = number;
        this.dataContainers = dataContainers;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<DataContainer2> getDataContainers() {
        return dataContainers;
    }

    public void setDataContainers(ArrayList<DataContainer2> dataContainers) {
        this.dataContainers = dataContainers;
    }
}
