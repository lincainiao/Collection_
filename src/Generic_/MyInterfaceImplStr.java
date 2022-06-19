package Generic_;

//泛型接口实现类
public class MyInterfaceImplStr implements MyInterface<String>{

    @Override
    public String service(String s) {
        //s == t
        System.out.println(s);
        return s;
    }
}
