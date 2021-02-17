package dass.com.composite;

import java.util.ArrayList;

/**
 * 组合模式(Composite Pattern)也叫合成模式，有时又叫做部分-整体模式（Part-Whole），主要是用来描述部分与整体的关系，其定义如下：
 * Compose objects into tree structures to represent part-whole hierarchies.Composite lets clients treat individual objects and compositions of objects uniformly.
 * 将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个*对象*和*组合对象*的使用具有一致性.
 *
 * 涉及到树形结构，以及要体现局部和整体的关系的时候，优先考虑组合模式。
 *
 * 组合模式的3个角色：
 * 1.Component:定义组合对象的共有方法和属性 比如例子里面的getInfo()封装到抽象类中
 * 2.Composite:树枝对象 组合树枝节点和叶子节点 形成树形结构
 * 3.Leaf:叶子对象 没有分支 遍历最小单位
 *
 * 优点：
 * 1.高层模块调用简单，树形结构中所有节点都是component，局部和整体调用没有区别
 * 2.节点自由增加，容易拓展，只需要知道父节点
 *
 * 使用场景：
 * 1.维护和展示部分-整体的关系 如树形菜单 文件和文件夹管理器 js树形菜单
 * 2.从一个整体中独立出部分模块或者功能的场景
 *
 * **/


public class Client {

    public static void main(String[] args) {
        //首先是组装一个组织结构出来
        Branch ceo = compositeCorpTree();
        //首先把CEO的信息打印出来
        System.out.println(ceo.getInfo());
        //然后是所有员工信息
        System.out.println(getTreeInfo(ceo));
    }

    //把整个树组装出来
    public static Branch compositeCorpTree(){
        //首先产生总经理CEO
        Branch root = new Branch("王大麻子","总经理",100000);
        //把三个部门经理产生出来
        Branch developDep = new Branch("刘大瘸子","研发部门经理",10000);
        Branch salesDep = new Branch("马二拐子","销售部门经理",20000);
        Branch financeDep = new Branch("赵三驼子","财务部经理",30000);
        //再把三个小组长产生出来
        Branch firstDevGroup = new Branch("杨三乜斜","开发一组组长",5000);
        Branch secondDevGroup = new Branch("吴大棒槌","开发二组组长",6000);
        //把所有的小兵都产生出来
        Leaf a = new Leaf("a","开发人员",2000);
        Leaf b = new Leaf("b","开发人员",2000);
        Leaf c = new Leaf("c","开发人员",2000);
        Leaf d = new Leaf("d","开发人员",2000);
        Leaf e = new Leaf("e","开发人员",2000);
        Leaf f = new Leaf("f","开发人员",2000);
        Leaf g = new Leaf("g","开发人员",2000);
        Leaf h = new Leaf("h","销售人员",5000);
        Leaf i = new Leaf("i","销售人员",4000);
        Leaf j = new Leaf("j","财务人员",5000);
        Leaf k = new Leaf("k","CEO秘书",8000);
        Leaf zhengLaoLiu = new Leaf("郑老六","研发部副经理",20000);
        //开始组装
        //CEO下有三个部门经理和一个秘书
        root.addSubordinate(k);
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);
        //研发部经理
        developDep.addSubordinate(zhengLaoLiu);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        //看看两个开发小组下有什么
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);
        //再看销售部下的人员情况
        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);
        //最后一个财务
        financeDep.addSubordinate(j);
        return root;
    }

    //遍历整棵树,只要给我根节点，我就能遍历出所有的节点
    public static String getTreeInfo(Branch root){
        ArrayList<Corp> subordinateList = root.getSubordinate();
        String info = "";
        for(Corp s : subordinateList){
            if(s instanceof Leaf){ //是员工就直接获得信息
                info = info + s.getInfo()+"\n";
            }else{ //是个小头目
                info = info + s.getInfo() +"\n"+ getTreeInfo((Branch)s);
            }
        }
        return info;
    }
}
