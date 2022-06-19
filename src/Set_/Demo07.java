package Set_;

import java.util.Comparator;
import java.util.TreeSet;

//使用TreeSet集合实现字符串按照长度排序
public class Demo07 {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n = o1.length()-o2.length();
                int n2 = o1.compareTo(o2);
                return n == 0 ? n2 : n;
            }
        });
        strings.add("a");
        strings.add("ain");
        strings.add("nsjbsj");
        strings.add("assgfjbsj");
        System.out.println(strings.toString());
    }
}
