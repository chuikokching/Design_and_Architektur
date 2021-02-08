package dass.com.builder;

public class BenzModel extends CarModel {
    protected void start() {
        System.out.println("Benz start!");
    }

    protected void stop() {
        System.out.println("Benz stop!");
    }

    protected void alarm() {
        System.out.println("Benz alarm!");
    }

    protected void engineBoom() {
        System.out.println("Benz engine boom!");
    }
}
