package Generic_;

//在接口中未确定类型，由实现类确定
public class MyInterfaceImplInt<T> implements MyInterface<T>{

    @Override
    public T service(T t) {
        return t;
    }
}
