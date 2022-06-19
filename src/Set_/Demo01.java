package Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//测试Set接口的使用
//无序、无下标、不重复
public class Demo01 {
    public static void main(String[] args) {
        //不能直接实例化
        Set<String> set = new HashSet<>();
        //添加
        set.add("lin");
        set.add("zhao");
        set.add("zz");
        set.add("del");
        System.out.println("set 's size : "+set.size());
        System.out.println(set.toString());
        //删除，通过元素删除;清空clear
        set.remove("del");
        System.out.println(set.toString());

        //遍历
        //增强for
        System.out.println("foreach:");
        for (Object o:set) {
            System.out.println(set.toString());
        }
        //迭代器
        System.out.println("迭代器");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //判断
        System.out.println(set.contains("zhao"));
        System.out.println(set.isEmpty());
    }
}
