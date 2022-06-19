package Generic_;

import java.util.Comparator;

//使用泛型类
public class Demo01 {
    public static void main(String[] args) {
        //用泛型类创建对象，只能是引用类型
        //不同的泛型类型之间不能互相赋值
        MyGeneric<String> myGeneric = new MyGeneric<>("lin");
//        myGeneric.setT("zhao");
        myGeneric.show("zhao");//zhao
        System.out.println(myGeneric.getT());//lin

        MyGeneric<Integer> integerMyGeneric = new MyGeneric<>(2);
        integerMyGeneric.setT(20);
        integerMyGeneric.show(Integer.valueOf(50));//50
        System.out.println(integerMyGeneric.getT().getClass());//20

        //泛型接口
        MyInterfaceImplStr implStr = new MyInterfaceImplStr();
        implStr.service("lin");

        MyInterfaceImplInt<Integer> implInt = new MyInterfaceImplInt<>();
        System.out.println(implInt.service(Integer.valueOf(300)));

        //调用泛型方法
        MyGenericMethod myGenericMethod = new MyGenericMethod();
        //更具传入的值确定T的类型
        myGenericMethod.show("lin");
        myGenericMethod.show(200);
    }
}
