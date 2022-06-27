package List;

//往集合中添加的元素为基本类型
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //添加数字，由于集合不能添加基本类型，基本类型会自动装箱
        list.add("zhizhi");
        list.add("zsy");
        list.add("wxy");
        list.add("ytm");
        System.out.println(list.size());
        System.out.println(list.toString());
        //删除，传递的可以是下对或对象
        list.remove(1);
        list.remove("zhizhi");
        System.out.println(list);

        //返回子集合
//        System.out.println(list.subList(1,3));
    }
}
