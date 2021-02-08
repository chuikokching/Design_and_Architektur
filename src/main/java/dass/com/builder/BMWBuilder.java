package dass.com.builder;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {

    private BMWModel bmw = new BMWModel();

    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.bmw;
    }
}
