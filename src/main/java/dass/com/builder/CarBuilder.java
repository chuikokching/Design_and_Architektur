package dass.com.builder;

import java.util.ArrayList;

public abstract class CarBuilder {
    //获取一个模型的组装顺序
    public abstract void setSequence(ArrayList<String> sequence);

    //设置完毕后获取这个车辆模型
    public abstract CarModel getCarModel();
}
