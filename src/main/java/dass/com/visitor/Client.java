package dass.com.visitor;

/*
* 访问者模式（Visitor Pattern）是一个相对简单的模式，其定义如下：
* Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates. （
* 封装一些作用于某种数据结构中的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。）
*
* 5个角色：
* 1.Visitor: 抽象类或接口，声明访问者可以访问哪些元素，通过visit方法的参数定义
* 2.ConcreteVisitor：具体访问者，该怎么干，干什么事
* 3.Element：接口或者抽象类，声明接受哪一类访问者访问，通过accept方法的参数定义
* 4.ConcreteElement：实现accept方法，通常为visitor.visit(this) 固定模式
* 5.ObjectStructure：具体的数据结构，多个不同类，不同接口的容易 list set Map etc.
*
* 优点：
* 1.单一职责原则:Employee负责抽象子类数据的加载,visitor负责报表的展现
* 2.拓展性:对于新报表格式,只需在visitor当中新增加一个方法
* 3.灵活性:把数据扔给访问者,由访问者来进行统计计算
*
* 使用场景：
* 1.一个对象结构包含很多类对象,他们有不同接口,业务要求遍历多个不同的对象
* 2.对对象结构中的对象进行很多不同的操作,并且避免让这些操作污染这些对象的类
*
* 有了visitor之后,visitor访问每个员工并且统筹整理信息,访问者模式是一种集中规整模式,适用于大规模重构的项目.
*
* */


import java.util.ArrayList;
import java.util.List;

public class Client {

    /*
    * 1.通过循环遍历所有元素
    * 2.每个员工对象都定义了一个访问者
    * 3.员工对象把自己作为一个参数调用访问者visit方法
    * 4.访问者调用自己内部的计算逻辑，计算出相应的数据和表格元素
    * 5.访问者打印出报表和数据
    * */


    public static void main(String[] args) {
        IVisitor visitor = new Visitor();
        for(Employee emp:mockEmployee()){
            emp.accept(visitor);
        }
    }

    public static List<Employee> mockEmployee(){
        List<Employee> empList = new ArrayList<Employee>();
        //产生张三这个员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);
        //产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了！");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);
        //再产生一个经理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
