package Set_;

import java.util.GregorianCalendar;

//实现Comparable接口
public class Girls implements Comparable{
    private String name;
    private int age;

    public Girls(String name, int ange) {
        this.name = name;
        this.age = ange;
    }

    //先按照姓名比较，再按照年龄比较
    @Override
    public int compareTo(Object o) {
        Girls girls = (Girls) o;
        int n1 = this.getName().compareTo(girls.getName());
        int n2 = this.age - girls.getAge();
        return n1==0? n2 : n1;
    }

    @Override
    public String toString() {
        return "Girls{" +
                "name='" + name + '\'' +
                ", ange=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int ange) {
        this.age = ange;
    }

}
