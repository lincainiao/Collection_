package Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map
//存储的是键值对，键不可重复，值可以重复，无序
public class Demo01 {
    public static void main(String[] args) {
        //创建Map集合，需要指定键和值的类型
        Map<String,String> map = new HashMap<>();
        //添加
        map.put("name","lin");
        map.put("name","zhao");
        map.put("name","zz");//添加重复的key，会覆盖原来的value
        map.put("age","20");
        map.put("address","here");
        System.out.println("size : "+map.size());
        System.out.println(map.toString());
        //删除
//        System.out.println("remove");
//        map.remove("name");
//        System.out.println(map.toString());
        //遍历，keySet返回Set
        Set<String> keySet = map.keySet();
        //遍历Set:增强for、迭代器
        for (String value : keySet) {
            //通过key获取value
            System.out.println(value+"  "+map.get(value));
        }

        //遍历，entrySet方法
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        //判断
        System.out.println(map.containsKey("name"));
        System.out.println(map.containsValue("name"));
    }
}
