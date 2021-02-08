package dass.com.factory.human;

/**
 * 工厂生产类
 *
 * **/

public class HumanFactory {

    public static <T extends Human> T createHuman(Class <T> c) {
        Human human = null;
        try {
            System.out.println(c.getName());
            //c.getName()返回一个字符串变量，它代表一个类的包名和类名 B.S. dass.com.factory.human.YellowHuman 传入参数(YellowHuman.class)
            //A a = (A)Class.forName(“package.A”).newInstance(); A a = new A();是一样的效果。
            human = (Human)Class.forName(c.getName()).newInstance();
        }catch (Exception e)
        {
            System.out.println("Errors occur");
        }


        return (T)human;
    }
}
