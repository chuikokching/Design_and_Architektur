package dass.com.observer;

/*
* 观察者模式（Observer Pattern）也叫做发布订阅模式（Publish/subscribe）,它是一个在项目中经常使用的模式，其定义如下：
* Define a one-to-many dependency between objects so that when one object changes state,all its dependents are notified and updated automatically.（
* 定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新。）
*
* 4种角色：
* Subject：被观察者 被观察者必须实现的职责，它必须能够动态地增加、取消观察者。它一般是抽象类或者是实现类，仅仅完成作为被观察者必须实现的职责：管理观察者并通知观察者。
* Observer：观察者 观察者接收到消息后，即进行update（更新方法）操作，对接收到的信息进行处理。
* ConcreteSubject：具体的被观察者 定义被观察者自己的业务逻辑，同时定义对哪些事件进行通知。
* ConcreteObserver：具体的观察者 每个观察在接收到消息后的处理反应是不同，各个观察者有自己的处理逻辑。
*
* 优点：
* 1.subject, observer之间抽象耦合 容易扩展
* 2.建立触发机制 形成链式反应
*
* 使用场景：
* 1.关联行为场景 关联行为可拆分
* 2.触发多级事件场景
* 3.消息队列处理机制
* 如 文件系统 在一个目录下新建立一个文件，这个动作会同时通知目录管理器增加该目录，并通知磁盘管理器减少1KB的空间，也就说“文件”是一个被观察者，“目录管理器”和“磁盘管理器”则是观察者。
*    ATM取钱 比如你到ATM机器上取钱，多次输错密码，卡就会被ATM吞掉，吞卡动作发生的时候，会触发事件。第一，摄像头连续快拍，第二，通知监控系统，吞卡发生；第三，初始化ATM机屏幕，返回最初状态。一般前两个动作都是通过观察者模式来完成的，后一个动作是异常来完成
*
* 注意事项：
* 1.广播链问题 A->B->C 一般推荐只出现一个对象拥有双重身份 一是观察者也是被观察者
* 2.异步处理问题 要考虑线程安全和队列问题
*
* */


public class Client {

    public static void main(String[] args) {
        //三个观察者产生出来
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer hetu = new Hetu();

        //我们后人根据历史，描述这个场景，有三个人在观察韩非子
        HanFeiZi test = new HanFeiZi();
        test.addObserver(liSi);
        test.addObserver(wangSi);
        test.addObserver(hetu);

        test.haveBreakfast();
        test.haveFun();
    }
}
