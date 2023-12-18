package demo.chapter01;
import java.util.Scanner;//获取键盘 导包
public class Myscore {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);//创建键盘输入对象
        //计算你自己某学期期末总成绩平均分
        String end =null;
        do {
            int sum=0;//重置总成绩
            double average;//平均分
            int i;//计数器
            String name;
            System.out.println("请输入学生姓名：");
            name = sc.next();
            for (i = 0; i < 3; i++) {
                System.out.println("请输入第" + (i + 1) + "门的分数");
                int a = sc.nextInt();//获取键盘输入
                sum += a;
            }
            System.out.println(name+"同学你的的总成绩为" + sum);
            average = (double) sum / i;//求平均分
            String formattedAverage = String.format("%.1f", average);//平均分保留一位小数
            System.out.println(name+"同学你的平均分为：" + formattedAverage);
            System.out.println("是否输入下一个学生？y/n");
            end = sc.next();
        }while (end.equals("y")||end.equals("Y"));
        System.out.println("成绩输入完成");
    }
}
