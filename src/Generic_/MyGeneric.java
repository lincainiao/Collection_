package Generic_;
//泛型类
//在类型后面加上“<>”
//T是类型占位符，表示引用类型，如果是多个能用，隔开
//不能直接实例化 T t = new T();
public class MyGeneric<T> {
    //使用泛型T
    //创建变量
    private T t;

    public MyGeneric(T t) {
        this.t = t;
    }

    //作为方法的参数
    public void show(T t){
        System.out.println(t);
    }

    public void setT(T t) {
        this.t = t;
    }

    //泛型作为方法的返回值
    public T getT(){
        return t;
    }
}
