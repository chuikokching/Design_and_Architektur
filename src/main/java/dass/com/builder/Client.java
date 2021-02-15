package dass.com.builder;


/*
* Builder Pattern:
* separate the construction of a complex object from ist representations,
* so that the same construction process can create different representations.
*
* 将对象的构建与它的表现分离，同样的构建过程可以创建不同的表现
*
* 建造者模式关注的更多是零件类型和装配工艺(顺序)
*
* 使用场景：
* 1.相同方法，不同执行顺序，产生不同效能
* 2.多个部件，都可以装配到一个对象中，但产生的结果又不一样
* 3.产品类中的调用顺序不同产生不同的效能
*
* 它最主要的功能是基本方法的调用顺序安排，基本方法都已经实现(看作零件的装配)，顺序不同产生的对象以及产生的效能也不同(基于客户需求)
*
* 在建造者模式中，有4个角色:Product, Builder, ConcreteBuilder, Director(负责安排已有模块的顺序，让builder来建造)
*
* 建造者模式更加关注*建造的过程*,因排列组合产生不同效能的这个过程 具体表现为director类当中封装的各种组合类型情况的方法
*
* 优点：
* 1.封装性 客户不必知道产品内部的组成细节
* 2.建造者独立 容易拓展
* 3.便于控制细节风险 对*建造过程*逐步细化，不对其他模块产生影响 具体表现为director类当中的各种组合类型情况，只需要更改当中的细节
*
* */


public class Client {

    public static void main(String[] args) {

        Director d = new Director();

        for(int i=0;i<1;i++)
            d.getABenzModel().run();

        for(int i=0;i<1;i++)
            d.getBBenzModel().run();

        for(int i=0;i<1;i++)
            d.getABMWModel().run();

        for(int i=0;i<1;i++)
            d.getBBMWModel().run();
    }
}
