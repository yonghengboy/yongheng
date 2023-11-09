package demo.Two;

import java.util.Random;

public class MathTest {
    public static void main(String[] args) {
        System.out.println("求三角函数："+Math.sin(Math.PI/2));
        System.out.println("求绝对值："+Math.abs(-6.5));
        System.out.println("四舍五入："+Math.round(2.18));
        System.out.println("求最值："+Math.max(8,6)+","+Math.min(8,6));
        System.out.println("求随机数："+Math.random());//只能产生【0.0~1.0】间的随机数

                    //#创建没有种子的随机数对象
                    Random r =new Random();//#生成随机 #随机数对象
        for (int i = 0; i < 20; i++) {//产生20个一百以内的随机整数
            System.out.println(r.nextInt(100));;//#生成随机数
        }
    }
}
