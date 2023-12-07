package homework.aOne;
import java.util.Scanner;//导包 键盘输入
public class StepRecord {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);//创建键盘输入对象
        int[] steps = new int[7];//定义一个一维数组 用于存放步数
        int minIndex = 0, maxIndex = 0;//minIndex为最小的索引 maxIndex为最大的索引
        String[] week ={"一","二","三","四","五","六","天"};//用于存放天数
        for (int i = 0; i <  steps.length; i++) {//使用for输入步数
            System.out.println("请输入星期"+week[i]+"的步数：");
            steps[i] = sc.nextInt();//输入一个整数类型
            if(steps[i]>steps[maxIndex]) {//用于判断最大步数
                maxIndex=i;
            }else if (steps[i]<steps[minIndex]) {//用于判断最小步数
                minIndex=i;
            }
        }
        for (int i = 0; i < steps.length; i++) {
            System.out.println("星期"+week[i]+"走了"+steps[i]+"步");
        }
        if(steps[maxIndex] == 0) {//考虑如果步数全部为0的情况
            System.out.println("没有步数记录");
        }else{
                System.out.println("星期" + week[maxIndex] + "走的最多，" + "为" + steps[maxIndex] + "步");
                System.out.println("星期" + week[minIndex] + "走的最少，" + "为" + steps[minIndex] + "步");
            }
    }
}
