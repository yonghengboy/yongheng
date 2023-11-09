package Personal.One.geima1029;
import java.util.Scanner;
import java.util.Random;

//2023-10-16 抢红包项目
public class redEnvelope {
    static Scanner sc = new Scanner(System.in);
    static Random r =new Random();//随机
    public static void main(String[] args) {
        //设定一堆红包
        int[] pack={666,888,999,1024,66,88,9527};
        //设定一个抢红包方法
        rob(pack);
    }
    public static void rob(int[] pack){
        for (int i = 0; i < pack.length; i++) {
            while (true){
                System.out.println("请您输入任意内容进行抽奖");
                sc.next();
                int index=r.nextInt(pack.length);
                int money=pack[index];
                if (money!=0){
                    System.out.println("恭喜你，抽中"+money+"元红包");
                    pack[index]=0;
                    break;//结束此次抽奖
                }else {
                    System.out.println("本次没有抽中，请再接再厉哦~~~");
                }
            }
        }
        System.out.println("所有红包已被抽完，活动已结束");
    }
}
