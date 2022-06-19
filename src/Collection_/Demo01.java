package Collection_;

import java.util.*;

/**
 * 演示Collection接口的使用
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        Collection collection = new ArrayList();
        //添加元素
        collection.add("apple");
        collection.add("banana");
        collection.add("peach");
        collection.add("grape");
        System.out.println("集合元素个数 "+collection.size());
        System.out.println(collection);
        //删除元素
        collection.remove("apple");
        System.out.println(collection);
        //清空
//        collection.clear();
//        System.out.println(collection);

        //遍历
        //1.使用增强for，不能用for
        for (Object o: collection) {
            System.out.println(o);
        }
        //2.使用迭代器，专门遍历集合的方式
        Iterator iterator = collection.iterator();
        //Iterator:hasNext()判断是否有下一个元素
        //next()获取下一个元素
        //remove()删除当前元素
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            System.out.print(s+" ");
            //在迭代器中不允许使用collection中的方法修改集合内容，要删除只能用迭代器的remove()方法
//            iterator.remove();
        }
        System.out.println("\n"+collection.size());
        //判断
        System.out.println(collection.contains("peach"));
        //是否为空
        System.out.println(collection.isEmpty());
    }
}
