package demo.chapter01;
import java.util.Scanner;
public class Arraytest02 {
    public static void main(String[] args) {
        //五件商品
        String[] goods =new String[5];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < goods.length; i++) {
            System.out.println("请输入第"+(i+1)+"件商品名称：");
            goods[i] =sc.next();
        }
        for (String good : goods) {
            System.out.println(good);
        }
    }
}
