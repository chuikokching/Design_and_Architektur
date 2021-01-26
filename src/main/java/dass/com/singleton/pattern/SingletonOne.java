package dass.com.singleton.pattern;

/*创建对象实例的时候直接初始化,并且只有一个实例对象*/
/**
 * 单例模式：
 * 1.内存当中只有一个对象,节省内存空间
 * 2.避免频繁创建销毁对象 提高性能
 * 3.拓展比较困难
 * 4.长期不使用,对象被回收 造成状态丢失
 *
 * 使用场景
 * 1 生成唯一序列号环境
 * 2 创建一个对象要消耗过多资源 比如IO和数据库等资源
 * 3 需要一个共享访问点或者共享数据web计数器 不用把每次刷新都记录到数据库 用单例模式保持计数器的值
 * **/
public class SingletonOne {

    //私有构造方法
    private SingletonOne() {
        //System.out.println(" test !");
    }
    //私有静态对象实例化
    private static final SingletonOne single= new SingletonOne();

    //返回私有实例对象
    public static SingletonOne getInstance()
    {
        //System.out.println(" test gee !");
        return single;
    }
}
