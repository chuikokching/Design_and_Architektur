package dass.com.singleton;

public class Test {

    public static void main(String[] args) {
        SingletonOne sin1= SingletonOne.getInstance();
        SingletonOne sin2= SingletonOne.getInstance();

        System.out.println(sin1==sin2);

        SingletonTwo sin3 = SingletonTwo.getInstance();
        SingletonTwo sin4 = SingletonTwo.getInstance();

        System.out.println(sin3==sin4);
    }

}
