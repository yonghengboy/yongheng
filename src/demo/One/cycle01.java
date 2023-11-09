package demo.One;

import java.util.Scanner;

public class cycle01 {
    public static void main(String[] args) {
//自然数
        int sum=0;//变量
        int a=1;//相加的自然数
        while (a<=100){
            sum+=a;
            a++;
        }
        System.out.println("100以内偶数相加为:"+sum);
//偶数
        int sum1=0;
        int a1=2;
        while (a1<=100){
            sum1+=a1;
            a1+=2;
        }
        System.out.println("100以内偶数相加为:"+sum1);

        Scanner in =new Scanner(System.in);//创建键盘输入对象

        //计算你自己某一学期期末总成绩平均分
        int sum2=0;//总成绩
        int a2 = 0;//输入每门成绩
        double average = 0.0;
        int i =0;
        for (i=0;i<3;i++){
            System.out.println("请输入第"+(i+1)+"门的分数");
            a = (byte) in.nextInt();//获取键盘输入
            sum2 +=+a;
        }
        System.out.println("你的总成绩为"+sum2);
        average =sum2/i;
        System.out.println("你的平均分为："+average);

    }
}
