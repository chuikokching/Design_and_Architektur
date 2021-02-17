package dass.com.composite;

/*
class A{
public A(){} // 1:无参数构bai造方法。
public A(String s){} // 2.
}
class B extends A{
public B(String s){
super(s); // 3.
}
}
说明：如du果没有zhi1处的无参数构造方法，那么3处一定要主动调用父类带参数的构造方法。
如果有1处的构造方法，那么3处代码可以不要，因为Java会自动默认调用父类的无参数构造方法。
在构造子类时，一定会调用到父类的构造方法。
所以父类要么有一个默认的无参数构造，这样Java会自动调用这个无参数的构造。如果父类没有无参数的构造，那么就要你自己在子类的构造中，通过super()的方式调用父类的构造
*/

public class Leaf extends Corp {
    public Leaf(String _name, String _position, int _salary) {
        super(_name, _position, _salary); //构造子类时，一定会调用到父类的构造方法
    }

}
