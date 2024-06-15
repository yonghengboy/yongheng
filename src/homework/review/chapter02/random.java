package homework.review.chapter02;
//利用随机数类Random生成指定范围随机数
//1.导包
import java.util.Random;
public class random {
    public static void main(String[] args) {
        int min =10;//范围内最小值
        //2.创建对象
        int max =20;//范围内最大值
        Random random = new Random();
        int randomNumber =min+random.nextInt(max-min+1);
    }
}
