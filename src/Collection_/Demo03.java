package Collection_;

import java.util.*;

//工具类的使用
public class Demo03 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(5);
        list.add(4);
        list.add(30);
        list.add(24);
        //sort排序
        System.out.println("original : "+list.toString());

        //创建比较器
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                //按降序
//                return o2-o1;
                //按升序
                return o1-o2;
            }
        };
        Collections.sort(list,comparator);
        System.out.println("after sort : "+list.toString());
        //二分查找，找到返回下标，使用之前需要先对list进行排序
        System.out.println("binarySearch : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" : "+Collections.binarySearch(list,list.get(i)));
        }
        //copy
        //新集合
        List list1 = new ArrayList();
        //要求两个集合大小完全相同。
        for (int j = 0; j < list.size(); j++) {
            //使新集合长度和旧集合长度一样
            list1.add(0);
        }
        Collections.copy(list1,list);
        System.out.println("the new list : "+list1);
        //反转，reverse
        Collections.reverse(list1);
        System.out.println("reverse : "+list1);
        //打乱，shuffle
        Collections.shuffle(list1);
        System.out.println("shuffle : "+list1);
    }
}
