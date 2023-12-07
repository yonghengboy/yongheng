package demo.bTwo;
//2023-11-20 9:09

import java.util.InputMismatchException;
import java.util.Scanner;
//（1）先定义一个自定义异常类
class InvalidscoreException extends Exception{
    InvalidscoreException(){//无参的构造方法
        super();//父类的构造方法
    }
    //重载该构造方法
    InvalidscoreException(String s){//无参的构造方法
        super(s);//父类的构造方法
    }
}
public class ScoreInput {
    public static void main(String[] args) {
        //定义一个接收学生成绩的数组
        float[] scores = new float[10];
        Scanner sc = new Scanner(System.in);
        //循环接收学生成绩
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第"+(i+1)+"个学生的成绩：");
            //捕获 处理 输入学生成绩的代码
            try {
                 scores[i] =sc.nextFloat();
                 if (scores[i]<0||scores[i]>100){
                     throw new InvalidscoreException("成绩0~100的合法范围");
                 }
            }catch(InvalidscoreException e){
                System.out.println(e.getMessage());
                i--;
                //如果输入的字符串无法被解析为浮点数，nextFloat() 方法将抛出 InputMismatchException 异常，
                // 而不是 NumberFormatException。
            }catch (InputMismatchException e1){
                System.out.println("输入的成绩类型错误，请重新输入！");
                sc.next();// 清除输入缓冲区中的无效输入
                i--;
            }
        }
    }
}
