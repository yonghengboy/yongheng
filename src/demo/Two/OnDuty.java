package demo.Two;

import java.util.Random;
import java.util.Scanner;

//抽取值日生
public class OnDuty {
    //定义一个存储宿舍同学的方法
    public static void addName(String[] student){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < student.length; i++) {
            System.out.println("请输入第"+(i+1)+"个同学的姓名！！");
            student[i]= sc.next();
        }
        System.out.println("今日值日同学为：");
    }
//遍历值日生
    public static String randomStudent(String[] students){//抽取值日生
        Random r=new Random();
        int a=r.nextInt(students.length);
        String name=students[a];
        return name;
    }
    public static void main(String[] args) {
        System.out.println("-----------抽取值日生-----------");
        String[] students =new String[6];
        //调用值日生方法
        addName(students);
        //抽取值日生方法
        String dutyName=randomStudent(students);
        System.out.println(dutyName);

    }
}
