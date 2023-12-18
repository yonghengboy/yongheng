package homework.chapter01;
import java.util.Scanner;//获取键盘 导包
public class Week8homework {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);//创建键盘输入对象
        double[] sights={82.7,20.17,19.9,14.1,12.2,11.1,10.5,10.1};//数据库
        System.out.println("------------------十一黄金周云南各地旅游人次统计------------------");
        System.out.println("1:----------最高人数旅游目的地");
        System.out.println("2:----------平均人数旅游目的地");
        System.out.println("3:----------较少游客目的地");
        System.out.println("4.:----------返回");
        System.out.println("4.:---------------------------------------------------------");
        System.out.println("请输入需要操的功能号");
        byte choose = 0;
        while (choose!=4){//用于判断是否返回
        choose = (byte) sc.nextInt();//获取键盘输入
        switch (choose){//通过switch 用于判断用户输入
            case 1:
                System.out.println("2023年国庆期间云南景区最高游客数为："+sights[Highest(sights)]+"万人");break;
            case 2:
                System.out.println("2023年国庆期间云南景区平均游客数为："+average(sights)+"万人");break;
            case 3:
                System.out.println("2023年国庆期间低于13万人云南景区数为："+less(sights)+"个");break;
            case 4:
                break;
            default:System.out.println("输入错误！");
            }
        }
    }
    public static int Highest(double[] data0) {//求最高人次
        double Highest =data0[0];//寄存最大值 以便比较
        int max=0;//用于储存最大值的索引
        for (int i = 1; i < data0.length; i++) {//遍历 寻找最大值
            if (data0[i]>Highest)
            {max =i;
            }
        }
        return max;//返回最高的数值
    }
    public static double average(double[] data0){//平均人次
       double ave = 0;
        for (double v : data0) {//先算总人数
            ave += v;
        }
        return ave / data0.length;//返回平均人数
    }
    public  static int less(double[] data0){//较少的地方
        int count =0;//用于计数
        for (double v : data0) {//for获取少于13W人次
            if (v < 13) {//判断是否少于13
                count++;
            }
        }
        return count;//返回计数器
    }
}
