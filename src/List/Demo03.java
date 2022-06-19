package List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

//List的实现类
//ArrayList
public class Demo03 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        //添加元素
        Person[] p = new Person[4];
        p[0] = new Person("lin",20);
        p[1] = new Person("zhao",18);
        p[2] = new Person("zz",24);
        p[3] = new Person("de",13);
        for (int i = 0; i < 4; i++) {
            //添加元素
            arrayList.add(p[i]);
        }
        System.out.println(arrayList.toString());
        //删除（根据下标删除）
//        arrayList.remove(3);
        //根据元素的值删除，需要重写equals方法
        arrayList.remove(new Person("zz",24));
        System.out.println(arrayList.toString());

        //遍历
        //迭代器iterator
        System.out.println("普通迭代器");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            //类型转换
            System.out.println(iterator.next().toString());
        }
        //列表迭代器
        System.out.println("列表迭代器");
        ListIterator lit = arrayList.listIterator();
        //从前往后
        System.out.println("from start: ");
        while (lit.hasNext()) {
            System.out.println(lit.next().toString());
        }
        System.out.println("from end: ");
        while (lit.hasPrevious()){
            System.out.println(lit.previous().toString());
        }
        //判断
        System.out.println(arrayList.contains(new Person("de",13)));
    }
}
