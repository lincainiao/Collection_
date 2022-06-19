package Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//HashMap
//存储结构：哈希表+红黑树
//使用key的hashCode和equals方法作为重复的依据
public class Demo02 {
    public static void main(String[] args) {
        HashMap<Person,String> hashMap = new HashMap<Person,String>();
        //添加
        Person p1 = new Person("lin",22);
        Person p2 = new Person("zhao",20);
        Person p3 = new Person("zz",24);
        String s1 = "GL";
        String s2 = "LY";
        String s3 = "B";
        hashMap.put(p1,s1);
        hashMap.put(p2,s2);
        hashMap.put(p3,s3);
        System.out.println("size : "+hashMap.size());
        hashMap.put(p1,"LL");//添加不成功，size = 3
        hashMap.put(new Person("zz",24),"B");//虽然属性相同，但依然添加成功，size = 4;需要重写equals方法和hashCode方法 size = 3
        System.out.println("size : "+hashMap.size());
        //删除
        hashMap.remove(p3);
        //遍历
        for (Person person:hashMap.keySet()) {
            System.out.println(person.toString()+" "+ hashMap.get(person));
        }
        //entrySet
        for (Map.Entry<Person,String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        //判断
        System.out.println(hashMap.containsKey(p1));
        System.out.println(hashMap.containsKey(new Person("lin",20)));
    }
}
