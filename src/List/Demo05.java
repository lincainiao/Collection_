package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//List实现类
//LinkedList类的使用
//存储结构：双向链表
public class Demo05 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();
        Person[] people = new Person[4];
        people[0] = new Person("lin",22);
        people[1] = new Person("zhao",20);
        people[2] = new Person("zz",24);
        people[3] = new Person("re",10);
        for (int i = 0; i < people.length; i++) {
            linkedList.add(people[i]);
        }
        System.out.println("size : "+linkedList.size());
        //删除
        linkedList.remove(people[3]);
//        System.out.println("size : "+linkedList.size());
        //按元素的值删除，需要重写equals方法
        linkedList.remove(new Person("re",10));
        //遍历
        //普通for
//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.println(linkedList.get(i));
//            Person person = (Person) linkedList.get(i);
//            if (person.getName().equals("zz")){
//                System.out.println("zz is NO."+(i+1));
//            }
//        }
        //增强for
//        for (Object o:
//             linkedList) {
//
//        }
        //迭代器
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Person person = (Person) iterator.next();
            System.out.println("name is : "+person.getName());
        }
        //列表迭代器
        ListIterator lit = linkedList.listIterator();
        while (lit.hasNext()) {
            lit.next();
        }
        //获取元素的位置
        System.out.println(" "+linkedList.indexOf(new Person("zz",24)));
    }
}
