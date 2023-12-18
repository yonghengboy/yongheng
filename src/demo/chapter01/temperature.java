package demo.chapter01;
import java.util.Scanner;//获取键盘 导包
public class temperature {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);//获取键盘

        System.out.println("今天温度多少");
        byte temperature = (byte) in.nextInt();//获取温度
        if (temperature>25){
            System.out.println("晴天");
        }
        else {
            System.out.println("阴天");
        }
    }
}

