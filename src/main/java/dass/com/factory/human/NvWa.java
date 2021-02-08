package dass.com.factory.human;

/*
 * 工厂模式 Factory pattern 有利于模块之间解除耦合 隐藏具体产品实现类 只需要知道产品的抽象类 它的重点和主要职责就是创建
 * 比如 JDBC链接数据库 mysql到oracle 只需要更改一下接口方法中的驱动名称参数即可
 *
 * Define an interface for creating an object, but let subclasses decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.
 * 工厂模式让一个类的实例化延迟到其子类，让子类决定实例化哪一个
 */

/**
 * 业务场景实现类
 *
 * 简单工厂模式 也叫静态工厂模式 省去AbstractHumanFactory
 * 还有另外一种实现方法就是多个工厂生产类
 * 新建多个工厂生产类分别继承AbstractHumanFactory
 * 比如 public class YelloHuman extends AbstractHumanFactory{
 *     public Human createHuman()
 *     {
 *         return new YelloHuman();
 *     }
 * }
 * 在复杂的应用中一般采用多工厂方式，再增加一个协调类，协调类封装子工厂类，对高层模块提供统一的访问接口
 *
 * **/
public class NvWa {

    public static void main(String[] args) {
        Human yello = HumanFactory.createHuman(YellowHuman.class);
        yello.getTitle();
        yello.getColor();

        Human black = HumanFactory.createHuman(BlackHuman.class);
        black.getTitle();
        black.getColor();

        Human white = HumanFactory.createHuman(WhiteHuman.class);
        white.getTitle();
        white.getColor();

    }
}
