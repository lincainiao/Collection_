package Set_;

import java.util.Iterator;
import java.util.TreeSet;

//用TreeSet保存数据
//保存的元素必须要实现Comparable接口
//compareTo方法返回0，表示重复
public class Demo05 {
    public static void main(String[] args) {
        TreeSet<Girls> girls = new TreeSet<>();
        Girls girls1 = new Girls("zhao",20);
        Girls girls2 = new Girls("zz",24);
        Girls girls3 = new Girls("juju",20);
        Girls girls4 = new Girls("del",10);
        Girls girls5 = new Girls("zhao",25);
        girls.add(girls1);
        girls.add(girls2);
        girls.add(girls3);
        girls.add(girls4);
        girls.add(girls5);
        System.out.println("size : "+girls.size());//出现转换异常
        System.out.println(girls.toString());

        //删除
        girls.remove(girls5);
        System.out.println("size : "+girls.size());
        System.out.println(girls.toString());
        //遍历
        //增强for
//        for (Object o:girls) {
//            System.out.println(o.toString());
//        }
        //迭代器
//        Iterator iterator = girls.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().toString());
//        }
    }
}
