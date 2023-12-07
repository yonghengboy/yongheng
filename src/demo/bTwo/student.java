package demo.bTwo;
//2023.10.26
public class student {
    //定义学生属性 成员变量（学号，姓名，年龄，班级）
     protected String number;
     protected String name;
     protected int age;
     protected String classes;

    //定义构造方法
    public  student(String number, String name, int age, String classes)
    {
        this.number=number;
        this.name=name;
        this.age=age;
        this.classes=classes;
    }

    //重载构造方法
   public  student(String name,String classes){
        this.name=name;
        this.classes=classes;
    }

    //定义属性的getter（）方法
    public String getNumber(){
        return number;
    }
    //定义属性setter()方法
    public  void setNumber(String number){
        this.number=number;
    }//定义属性的getter（）方法
    public String getName(){
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //定义属性setter()方法
    public  void setName(String name){
        this.name=name;
    }
    //定义成员方法
    public void  introduce()
    {
        System.out.println("我叫"+getName()+"来自"+getClasses()+"\n");
    }

    public static void main(String[] args)
    {
        student stu1 = new student("9527","张三",20,"网络2307");
        student stu2 = new student("9595","李四",21,"网络2307");
        student stu3 = new student("王五","人工智能2201");
        stu1.introduce();
        stu2.introduce();
        stu3.introduce();
    }
}
