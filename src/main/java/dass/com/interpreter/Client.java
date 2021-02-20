package dass.com.interpreter;

/*
* 解释器模式（Interpreter Pattern）是一种按照规定语法进行解析的方案，在现在项目中使用较少，其定义如下：
* Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
* （给定一门语言，定义它的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中的句子。）
*
* 运算元素(终结元素):a,b,c,d 运算符号:+ - * /
*
* 4个角色:
* 1.AbstractExpression:抽象解析器 表达式 语法树
* 2.TerminalExpression:终结符表达式 a,b,c,d
* 3.NonTerminalExpression:非终结符表达式  + - * /
* 4.Context:环境角色 Hashmap
*
* 优点:
* 1.拓展性,修改语法只需要修改相应的非终结符表达式
*
* 使用场景:
* 1.日志分析,虽然服务器日志格式不同,但是数据要素相同(a,b,c,d) 可以根据需要专门定制非终结符表达式
* 2.简单语法需要解析的场景 一般用来解析*标准*的字符集 如SQL语法分析
* 3.产生模型公式,进行模型运算 a+b-c+d
*
* */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {

    //运行四则运算
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        //赋值
        HashMap<String,Integer> var = getValue(expStr);

        Calculator cal = new Calculator(expStr);

        System.out.println("运算结果为："+expStr +"="+cal.run(var));
    }
    //获得表达式
    public static String getExpStr() throws IOException{
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
    //获得值映射
    public static HashMap<String,Integer> getValue(String exprStr) throws IOException{
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        //解析有几个参数要传递
        for(char ch:exprStr.toCharArray()){
            if(ch != '+' && ch != '-'){
                //解决重复参数的问题
                if(!map.containsKey(String.valueOf(ch))){
                    String in = (new BufferedReader(new InputStreamReader (System.in))).readLine();
                    map.put(String.valueOf(ch),Integer.valueOf(in));
                }
            }
        }
        return map;
    }

}
