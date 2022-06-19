package Set_;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet
//存储结构：红黑树（主要二叉查找树）
public class Demo04 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        //添加
        treeSet.add("lin");
        treeSet.add("zhao");
        treeSet.add("zz");
        treeSet.add("del");
        System.out.println("size : "+treeSet.size());
        System.out.println(treeSet.toString());//按顺序打印
        //重复添加
//        treeSet.add("del");//无法添加，
        //删除
        treeSet.remove("del");
        System.out.println(treeSet.toString());
        //遍历
        System.out.println("增强for：");
        for (Object o: treeSet) {
            System.out.println(o.toString());
        }
        //迭代器
        System.out.println("迭代器");
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        //判断
        System.out.println("empty? "+treeSet.isEmpty());
    }
}
