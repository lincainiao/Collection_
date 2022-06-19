package Generic_;
//泛型方法
//语法: <T> 返回类型
public class MyGenericMethod {

    //普通方法
    public <T> void show(T t){
        System.out.println(t);
    }
}
