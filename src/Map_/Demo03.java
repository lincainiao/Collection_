package Map_;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//TreeMap
public class Demo03 {
    public static void main(String[] args) {
        //需要实现Comparator方法或实现Comparable接口
        TreeMap<Person,String> treeMap = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int n1 = o1.getName().compareTo(o2.getName());
                int n2 = o1.getAge() - o2.getAge();
                return n1 == 0 ? n2 : n1;
            }
        });
        Person p1 = new Person("lin",22);
        Person p2 = new Person("zhao",20);
        Person p3 = new Person("zz",24);
        treeMap.put(p1,"GL");
        treeMap.put(p2,"LY");
        treeMap.put(p3,"B");
        System.out.println(treeMap.toString());

        //删除remove
        //遍历
        for (Person person:treeMap.keySet()) {
            System.out.println(person+" "+treeMap.get(person));
        }
        for (Map.Entry<Person,String> entry: treeMap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
