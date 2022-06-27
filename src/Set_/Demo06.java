package Set_;

import java.util.Comparator;
import java.util.Properties;
import java.util.TreeSet;

//TreeSet
//Comparator接口:实现定制比较（比较器）
public class Demo06 {
    public static void main(String[] args) {
        //匿名内部类，创建集合并指定规则
        TreeSet<Person> people = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int n1 = o1.getAge()- o2.getAge();
                int n2 = o1.getName().compareTo(o2.getName());
                return n1==0? n2 : n1;
            }
        });

        Person person1 =new Person("lin",22);
        Person person2 =new Person("zhao",20);
        Person person3 =new Person("zz",24);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        System.out.println(people.toString());
        Person person = new Person("del",20);
        people.add(person);
        System.out.println(people.toString());
    }
}
