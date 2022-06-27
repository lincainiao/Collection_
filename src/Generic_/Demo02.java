package Generic_;

import List.Person;

import java.util.ArrayList;
import java.util.Iterator;

//泛型集合
//避免类型转换异常
public class Demo02 {
    public static void main(String[] args) {
        //Integer类泛型
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        //arrayList.add("str");//添加字符串会报错
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        //迭代器遍历
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
