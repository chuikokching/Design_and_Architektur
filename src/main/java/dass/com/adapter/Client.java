package dass.com.adapter;

/*
 * Adapter Pattern:
 * Convert the interface of a class into another interface clients expect.
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 * 将一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作
 *
 * 适配器模式:3个角色：Target(IUserInfo), Adaptee(OuterInfo), Adapter(OuterUserInfo).
 *
 * 适配器模式的优点
 * 1.适配器模式可以让两个没有任何关系的类在一起运行
 * 2.增加了类的透明性 我们访问的Target目标角色，但是具体的实现都委托给了源角色，而这些对高层次模块是透明的，也是它不需要关心的
 * 3.提高了类的复用度 源角色在原有的系统中还是可以正常使用，而在目标角色中也可以充当新的演员。
 * 4.灵活性更好
 *
 * 适配器模式的使用场景
 * 1.修改一个已经投产中的接口时。比如系统扩展，需要使用一个已有或新建立的类，但这个类又不符合系统的接口的时候
 * 2.适配器模式在详细设计阶段不要考虑，它不是为了解决还处在开发阶段的问题，而是解决正在服役的项目问题，
 *  这个模式使用的主要场景是扩展应用中，系统扩展了，不符合原有设计的时候才考虑通过适配器模式减少代码修改带来的风险。
 *
 *
 */


public class Client {
    public static void main(String[] args) {
        //没有与外系统连接的时候，是这样写的
        IUserInfo youngGirl = new UserInfo();
        //从数据库中查到101个
        for(int i=0;i<101;i++){
            youngGirl.getMobileNumber();
        }


        //老板一想不对呀，兔子不吃窝边草，还是找借用人员好点
        //我们只修改了这句话
        IUserInfo youngGirl_outer = new OuterUserInfo();
        //从数据库中查到101个
        for(int i=0;i<101;i++){
            youngGirl_outer.getMobileNumber();
        }
    }
}