package dass.com.singleton;

/*实例对象并不直接初始化,调用getInstance时再初始化*/
/**
 * 这种单例模式在并发量增加的情况下可能在内存中出现多个实例
 * 比如线程A执行 singleton = new singleton() 但还没获得对象 （初始化需要时间）
 * 线程B 执行到singleton==null  判断为真 因此A B都获得了一个对象
 * 因此建议使用声明的时候直接初始化
 *
 *
 * **/
public class SingletonTwo {

    private SingletonTwo()
    {
    }

    private static SingletonTwo go=null;

    public static SingletonTwo getInstance()
    {
        if(go == null)
            go = new SingletonTwo();

        return go;
    }
}
