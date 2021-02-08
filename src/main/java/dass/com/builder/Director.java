package dass.com.builder;

import java.util.ArrayList;

/*
* 导演类指挥各个事件的先后顺序，为每种顺序定制方法
* 导演类可自定义设置多种样式或模块的执行先后顺序
*
* */


public class Director {

    //用于存放产品功能的调用顺序
    private ArrayList<String> sequence = new ArrayList();

    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel()
    {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel()
    {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }

    public BMWModel getABMWModel()
    {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("engine Boom");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) bmwBuilder.getCarModel();
    }

    public BMWModel getBBMWModel()
    {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("engine Boom");
        this.sequence.add("stop");
        this.sequence.add("alarm");
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) bmwBuilder.getCarModel();
    }

}
