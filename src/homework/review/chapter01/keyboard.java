package homework.review.chapter01;
//键盘输入的四个步骤
//1.导包
import java.util.Scanner;
public class keyboard {
    public static void main(String[] args) {
        //2.创建对象
        Scanner scanner = new Scanner(System.in);
        //3.读取输入
        int number = scanner.nextInt();
        //4.关闭Scanner
        scanner.close();
    }
}
