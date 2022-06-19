package Collection_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//数组和集合的相互转换
public class Demo04 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(5);
        list.add(4);
        list.add(30);
        list.add(24);
        //集合转换为数组，数组长度小于list长度，转换后数组长度会变成list长度；大于list长度，转换后多余的部分为null
        Integer[] integer = (Integer[]) list.toArray(new Integer[0]);
        System.out.println(integer.length);
        Integer[] integer1 = (Integer[]) list.toArray(new Integer[8]);
        System.out.println(integer1.length);
        for (Integer i:integer1) {
            System.out.print(i+" ");
        }
        System.out.println();

        //数组转为集合
        String[] girls = {"zhao","zz","xie","del"};
        //该集合为受限集合，不能进行添加和删除
        List<String> list1 = Arrays.asList(girls);
        System.out.println(list1.toString());
        //基本类型数组转成集合时，需要装箱为包装类
    }
}
