package dass.com.builder;

public class BMWModel extends CarModel {
    protected void start() {
        System.out.println("BMW start!");
    }

    protected void stop() {
        System.out.println("BMW stop!");
    }

    protected void alarm() {
        System.out.println("BMW alarm!");
    }

    protected void engineBoom() {
        System.out.println("BMW engine boom!");
    }
}
