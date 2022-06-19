package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//演示List的使用
//有序、有下标、可重复
public class Demo01 {
    public static void main(String[] args) {
        //创建list对象
        List list = new ArrayList();
        //添加元素
        list.add("apple");
        list.add("banana");
        list.add("peach");
        list.add("grape");
        list.add("delete");
        System.out.println("the size of list is "+list.size());
        System.out.println("there are "+list);
        //删除remove；清空clear
        list.remove("delete");
        System.out.println("after delete "+list);

        //遍历，由于list有下标，可以使用普通for
        System.out.print("普通for：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //增强for
        System.out.print("增强for：");
        for (Object o:
             list) {
            System.out.print(o+" ");
        }
        System.out.println();

        //迭代器
        System.out.print("迭代器：");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        //列表迭代器，允许按任意方向遍历列表
        System.out.print("列表迭代器：");
        ListIterator listIterator = list.listIterator();
        //从前往后
        System.out.println("from start: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.nextIndex()+":"+listIterator.next()+" ");
        }
        System.out.println();

        //从后往前，需要先执行从前往后
        System.out.print("from end: ");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previousIndex()+":"+listIterator.previous()+" ");
        }
        System.out.println();
        //判断
        System.out.println(list.contains("apple"));
        //获取位置
        System.out.println(list.indexOf("grape"));
    }
}
