package Set_;

import java.util.HashSet;
import java.util.Iterator;

//演示HashSet使用
//存储结构：数组+双向链表+红黑树
public class Demo02 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        //添加
        hashSet.add("lin");
        hashSet.add("zhao");
        hashSet.add("zz");
        hashSet.add("del");
        System.out.println("size : "+hashSet.size());
        System.out.println("hashSet : "+ hashSet.toString());
        //删除
        hashSet.remove("del");
        System.out.println("hashSet : "+ hashSet.toString());
        //遍历
        for (Object o:hashSet) {
            System.out.println(o.toString());
        }

        //迭代器
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        //判断
        System.out.println("判断");
        System.out.println("empty? "+hashSet.isEmpty());
        System.out.println("zhao? "+hashSet.contains("zhao"));
    }
}
