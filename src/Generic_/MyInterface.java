package Generic_;

//泛型接口
//不能使用泛型创建静态常量
public interface MyInterface<T> {
    static String name = "zhao";

    //抽象方法
    T service(T t);
}
