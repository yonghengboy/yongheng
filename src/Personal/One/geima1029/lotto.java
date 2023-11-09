package Personal.One.geima1029;
import java.util.Scanner;//获取键盘 导包
import java.util.Random;
//2023.11.1  彩票系统开发
/*项目需求
* 1.六个红球一个蓝球  红球范围1-33之间 蓝球1-16之间
* 2.用户输入购买号码 红球不能购买重复的数字
* 3.系统随机生成六个红球一个蓝球 红球不重复 范围见1
* 4.自动校对所购买彩票投中几个 并返回中奖金额
* 需要开发的方法
* 1.输入号码方法 可用for
* 2.判断是否重复
* 3，随机生成 并去2.判断是否重复
* 4.判断投中数量
* 5.返回中奖金额 */
public class lotto {
    static Scanner sc =new Scanner(System.in);//创建键盘输入对象
    // sc =  sc.nextInt();//获取键盘输入
    static Random r =new Random();//#生成随机
   // r.nextInt();//#生成随机数

    public static void main(String[] args) {
        int[] buy=new int[7];//七个购买号码
        int[] Draw=new int[7];//七个开奖号码
        int[] count=new int[2];//中奖情况
        buy=select_number();
        Draw=Draw();//开奖号码
        System.out.println("您购买的号码为");//输出购买号码
        output(buy);
        System.out.println("本次开奖号码为");//输出开奖号码
        output(Draw);
        count=judge(buy,Draw);//查询中奖几个号码
        result(count);
    }

    private static void result(int[] count) {//用于输出最后中奖界面
        if(count[0]==6&&count[1]==1){
            System.out.println("恭喜您中了1000万，您可以开启开挂人生!!!");
        }
        else if(count[0]==6&&count[1]==0){
            System.out.println("恭喜您中了500万，您可以开启躺平人生!!!");
        }
        else if(count[0]==5&&count[1]==1){
            System.out.println("恭喜您中了3000元，您可以考虑好好玩几天了！");}
        else if((count[0]==5&&count[1]==0)||(count[0]==4&&count[1]==1)){
            System.out.println("恭喜您中了200元，您可以好好吃一顿了!");}
        else if((count[0]==4&&count[1]==0)||(count[0]==3&&count[1]==1)){
            System.out.println("恭喜您中了10元，您今天可以加个鸡腿了!");}
        else if((count[0]==2&&count[1]==1)||(count[0]==1&&count[1]==1)||(count[0]==0&&count[1]==1)){
            System.out.println("恭喜您中了5元，您今天可以多加个小菜了!");}
        else if(count[0]==0&&count[1]==0){
            System.out.println("感谢您对福利事业作出的伟大事业");
        }
    }

    private static int[] judge(int[] buy, int[] draw) {//用于查看中奖几个号码
        int[] count=new int[2];
        for (int i = 0; i < buy.length-1; i++) {
            for (int i1 = 0; i1 < draw.length-1; i1++) {
                if (buy[i]==draw[i1]){
                    count[0]++;
                    break;
                }
            }
        }
        if (buy[buy.length-1]==draw[draw.length-1]) {
            count[1]++;
        }
        return count;
    }

    public static int[] select_number(){//用于选择购买号码
        int[] buy=new int[7];//七个购买号码
        for (int i = 0; i < buy.length-1; i++) {//选择红球 只要六个 所以length-1便可
            while (true) {//死循环除非输入正确否则一直循环
                System.out.println("请输入你要投注的第" + (i + 1) + "个红球号码/1-33之间");
                int number = sc.nextInt();
                if (number < 1 || number > 33){//不在范围内说明输入错误
                        System.out.println("您输入的数字不在1-33范围内请重试");
                    }else {//进入这里说明已经在范围内 将要判断是否重复
                    if (exist(buy,number)){//查看是否存在这个数 存在说明重复；
                        System.out.println("您输入的第"+i+"个数字重复,请重试");
                    }else{
                       buy[i] =number;
                       break;
                    }
                }
            }
        }
        System.out.println("请输入蓝球号码 1-16");//购买蓝球号码
        while (true) {//死循环除非输入正确否则一直循环
            int number = sc.nextInt();
            if (number < 1 || number > 16){//不在范围内说明输入错误
                System.out.println("您输入的数字不在1-33范围内请重试");
            }else {//进入这里说明已经在范围内
                    buy[6] =number;
                    break;
                }
            }
        return buy;
        }

    public static int[] Draw(){//随机生成中奖号码
        int[] num=new int[7];
        for (int i = 0; i < num.length-1; i++) {//六个红球一个蓝球
            while (true) {//死循环除非输入正确否则一直循环
                int number = r.nextInt(33)+1;
                    if (!exist(num,number)){//查看是否存在这个数 存在说明重复；
                        num[i] =number;
                        break;
                    }

            }
        }
        System.out.println("请输入蓝球号码 1-16");//购买蓝球号码
        while (true) {//死循环除非输入正确否则一直循环
            int number = r.nextInt(16)+1;
               num[6] =number;
                break;
            }

        return num;
    }

    private static boolean exist(int[] buy,int number) {//判断是否重复 重复返回trun 不重复返回false
        for (int j : buy) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
    public static void output(int[] num){
        System.out.print("[");
        for (int i = 0; i < num.length; i++) {
            System.out.print(i==num.length-1?num[i]+"]\n":num[i]+",");
        }
    }


}
