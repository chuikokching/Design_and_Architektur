package dass.com.builder;

import java.util.ArrayList;

/*
* private : 私有成员, 在类的内部才可以访问。
* protected : 保护成员，该类内部和继承类中可以访问。
* public : 公共成员，完全公开，没有访问限制。
*
* */


public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run(){

        for(int i=0;i<this.sequence.size();i++)
        {
            String name = this.sequence.get(i);

            if(name.equals("start"))
                this.start();
            else if(name.equals("stop"))
                this.stop();
            else if(name.equals("alarm"))
                this.alarm();
            else if(name.equals("engine Boom"))
                this.engineBoom();
        }

    }

    final public void setSequence(ArrayList<String> sequence)
    {
        this.sequence=sequence;
    }
}
