package demo.One;
//自我介绍
import java.sql.SQLOutput;
import java.util.Scanner;//获取键盘
public class Biography {
    public static void main(String[] args) {
        //输入数据
        Scanner in =new Scanner(System.in);//获取键盘
        System.out.println("请输入你的姓名: ");
        String name = in.next();

        System.out.println("请输入你的学号: ");
        String number = in.next();

        System.out.println("请输入你的班级： ");
        String Class = in.next();

        System.out.println("请输入你的年龄： ");
        Byte age = in.nextByte();

        System.out.println("请输入你的身高： ");
        float height = in.nextFloat();

        System.out.println("请输入你的家乡： ");
        String hometown = in.next();

        System.out.println("请输入你的兴趣爱好： ");
        String hobby = in.next();

        //以下为输出
        System.out.printf("\n");
        System.out.println("*******************自我介绍*******************");
        System.out.println("大家好，我是"+name+"，下面是我的自我介绍：");
        System.out.println("姓名： "+name);
        System.out.println("学号： "+number);
        System.out.println("班级； "+Class);
        System.out.println("年龄： "+age);
        System.out.println("身高： "+height);
        System.out.println("我来自"+hometown);
        System.out.println("我的兴趣爱好是"+hobby);
        System.out.println("*****************很高兴认识你！*****************");

    }





}
