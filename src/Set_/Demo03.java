package Set_;
//存储过程
//1 根据hashCode计算保存位置，如果位置为空，则保存；如果不为空，执行第二部
//2 再执行equals方法，如果结果为true，则认为重复；否则形成链表
import java.util.HashSet;
import java.util.Iterator;

public class Demo03 {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<Person>();
        //添加
        Person[] people = new Person[4];
        people[0] = new Person("lin",22);
        people[1] = new Person("zhao",21);
        people[2] = new Person("zz",24);
        people[3] = new Person("del",10);
        for (int i = 0; i < 4; i++) {
            hashSet.add(people[i]);
        }
        System.out.println("size : "+hashSet.size());
        System.out.println("hashSet : "+hashSet.toString());

        //如果名字一样，年龄一样，则判断为统一对象，不能添加进Set
        hashSet.add(new Person("lin",22));
        System.out.println("size : "+hashSet.size());//添加成功
        //需要重写equals方法和hashCode方法，重写方法后就不能添加进来，

        //遍历
        System.out.println("增强for");
        for (Object o:people
             ) {
            System.out.println(o.toString());
        }

        System.out.println("迭代器");
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
