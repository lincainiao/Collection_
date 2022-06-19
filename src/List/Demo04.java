package List;

import java.util.Enumeration;
import java.util.Vector;

//List实现类
//Vector类的使用
//存储结构：数组
public class Demo04 {
    public static void main(String[] args) {
        //创建Vector
        Vector vector = new Vector<>();
        vector.add("lin");
        vector.add("zhao");
        vector.add("zz");
        vector.add("del");
        System.out.println("size : "+vector.size());
        //删除、清空同ArrayList
        //遍历，使用枚举器
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            Object o = enumeration.nextElement();
            System.out.println(o.toString());
        }
        //判断：contains
        //获取第一个元素
        System.out.println("the first element : "+vector.firstElement());
        System.out.println("the last element : "+vector.lastElement());
    }
}
