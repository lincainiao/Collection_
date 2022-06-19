package Collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 演示Collection的使用
 * 往集合中添加类
 */

public class Demo02 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        //创建学生对象
        Person p1 = new Person("lin",23);
        Person p2 = new Person("zhao",22);
        Person p3 = new Person("X",10);
        //添加到集合
        collection.add(p1);
        collection.add(p2);
        collection.add(p3);
        System.out.println(collection.toString());
        System.out.println("length : "+collection.size());
        //删除
        collection.remove(p3);
        System.out.println("after remove : "+collection.toString());

        //遍历
        //增强for
        System.out.println("增强for");
        for (Object o:collection) {
            System.out.println(o.toString());
        }

        //迭代器
        System.out.println("迭代器");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            Person p = (Person) iterator.next();
            System.out.println(p.toString());
        }
    }
}
