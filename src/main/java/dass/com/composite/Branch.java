package dass.com.composite;

import java.util.ArrayList;


/*
* 安全模式
* 将控制结构的方法都放到composite里面，如果放到component当中则是透明模式
*
* */
public class Branch extends Corp {
    //Branch = Composite

    //下属容器
    ArrayList<Corp> subordinateList = new ArrayList<Corp>();

    public Branch(String _name, String _position, int _salary) {
        super(_name, _position, _salary); //构造子类时，一定会调用到父类的构造方法
    }

    //增加下属
    public void addSubordinate(Corp corp){
        this.subordinateList.add(corp);
    }

    //获得下属
    public ArrayList<Corp> getSubordinate(){
        return this.subordinateList;
    }

}
