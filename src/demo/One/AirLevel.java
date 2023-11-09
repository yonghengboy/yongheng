package demo.One;
import java.util.Scanner;//获取键盘 导包
public class AirLevel {//为Java的主方法，是程序的起点
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);//获取键盘
/*
        System.out.println("请输入空气指数：");
        int level =  in.nextInt();//获取分数
        if(level>=90&&level<=100){
            System.out.println("优");
        }
        else if(level>=80&&level<90){
            System.out.println("良");
        }
        else if(level>=70&&level<80){
            System.out.println("中");
        }
        else if(level>=60&&level<70){
            System.out.println("合格");
        }
        else if(level>=0&&level<60){
            System.out.println("不合格");
        }
        else {
            System.out.println("请输入正确的数值 0~100");
        }
*/
        System.out.println("请输入空气指数：");
        int level =  in.nextInt();//获取指数
        switch (level/10)   {
            case 10:
            case 9:
                System.out.println("优");
                break;
            case 8:
                System.out.println("良");
                break;
            case 7:
                System.out.println("中");
                break;

        }


    }
}
