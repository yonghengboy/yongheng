package homework.review.chapter02;
//封装一个数据实体类
public class EncapsulateEntityClasses {
/*类定义的三要素
    1.成员变量（属性）
    2.构造方法
    3.成员方法
（包括属性的getter()和setter()方法）*/
    //1,成员变量
    public String names;
    public int age;
    public int classes;
    //2.构造方法
    public EncapsulateEntityClasses(){//无参构造器
    }
    //3.成员方法
    public String getNames() {return names;}
    public void setNames(String names) {this.names = names;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public int getClasses() {return classes;}
    public void setClasses(int classes) {this.classes = classes;}
}
class subclass extends EncapsulateEntityClasses{//子类继承父类（extends关键字）    

}
