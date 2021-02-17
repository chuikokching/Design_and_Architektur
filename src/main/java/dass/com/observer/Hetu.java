package dass.com.observer;

public class Hetu implements Observer {
    //ConcreteObserver

    //河图，观察到韩非子活动后，自己也得做一些事
    public void update(String str){
        System.out.println("河图：观察到韩非子活动，开始动作了...");
        this.shouting(str);
        System.out.println("河图：乐死了\n");
    }
    //一看韩非子有变化，他就快乐
    private void shouting(String context){
        System.out.println("河图：因为" +context+",--所以我快乐呀！" );
    }

}
