package demo.One;//指定当前Java文件所在地址
//网上订单数据
/*开发日志
*09.26；简单添加个判断免配送费  可用三元运算符求是否免去运费
*  */

import java.time.LocalDateTime;//此类用于处理时间，如获取
import java.time.format.DateTimeFormatter;//用于格式化时间和日期的显示和解析，提供了各种格式化模式
import java.util.Random;//导包 Random用于生成随机数
import java.util.Scanner;//导包 获取键盘输入
public class Main {//为Java的主方法，是程序的起点

    public static String generateOrderId() {
        Random r = new Random();//生成一个随机数
        long orderId1 = r.nextInt(8999)+1000;//生成一个随机数用于放如订单
        long orderId2= r.nextInt(8999)+1000;//生成一个随机数用于放如订单
        long orderId3= r.nextInt(8999)+1000;//生成一个随机数用于放如订单
        long orderId4= r.nextInt(8999)+1000;//生成一个随机数用于放如订单
        long orderId5 = r.nextInt(8999)+1000;//生成一个随机数用于放如订单
        String orderId = orderId1 +" " +orderId2 +" "+orderId3 +" " +orderId4;
        return orderId;
    }//封装随机数生成订单号

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);//获取键盘
        float Total_cost0 = 0;//定义商品总价
        float Total_cost1 = 0;//定义商品总价
        float Total_cost2 = 0;//定义商品总价
        boolean isValidInput = false;//判断输入是否为真
        int invcommodity1 = -1; // 初始化为无效的值 否则无法执行循环

       /* 第一部分订单  商品列表*/
        System.out.println("-----------------------商品列表----------------------------");
        String foods1 ="红豆派";//String类型用于字符串 显然红豆派就属于字符串
        int number1 =1 ;//int整形
        float price1 =5.50f;//浮点型
        String foods2 ="香辣鸡腿汉堡（辣）";//第二件商品
        int number2 =1;
        float price2 = 11.50f;
                //开始输出商品列表
        System.out.println("1."+foods1+"\t\t\t\t"+number1+"份"+"\t"+"￥"+price1+"元");
        System.out.println("2."+foods2+"\t"+number2+"份"+"\t"+"￥"+price2+"元");
        System.out.println("3.我全都要");
        System.out.println("----------------------------------------------------------");

        //商品选择
     do {
         System.out.println("请选择你的商品 （回复数字）");//
         invcommodity1 = in.nextInt();//获取商品
      switch (invcommodity1) {
          case 1:
              System.out.println("请输入"+foods1+"的数量 （回复数字）");//
               number1 = in.nextInt();//获取商品数量
                Total_cost0 =number1 * price1;//计算商品总价
              isValidInput = true;
              break;
          case 2:
              System.out.println("请输入"+foods2+"的数量 （回复数字）");//
              number2 = in.nextInt();//获取商品数量
                Total_cost0 =number2 * price2;//计算商品总价
              isValidInput = true;
              break;
          case 3:
              System.out.println("请分别输入"+foods1+"和"+foods2+"数量 （回复数字）");//
              number1 = in.nextInt();//获取商品数量
              number2 = in.nextInt();//获取商品数量
                Total_cost0 =(number1 * price1)+(number2 * price2);//计算商品总价
              isValidInput = true;
              break;
          default:
              System.out.println("没有的商品无法输入哦，请重试");
      }
     } while (!isValidInput);

      //计算支付价格
         Total_cost1=number1 * price1;//计算商品总价
         Total_cost2=number2 * price2;//计算商品总价2

        float delivery_fee = Total_cost0 >30?0:6;//使用三元运算符判断是否需要配送费
        Total_cost0 +=delivery_fee;//需支付价格

      //结算面表
        System.out.println("----------------------------------------------------------");
       if (invcommodity1==1||invcommodity1==3){
        System.out.println("1."+foods1+"\t\t\t\t"+number1+"份"+"\t"+"￥"+ Total_cost1 +"元");
       }
       if (invcommodity1==2||invcommodity1==3) {
           System.out.println("2." + foods2 + "\t" + number2 + "份" + "\t" + "￥" + Total_cost2 + "元");
       }
        System.out.println("配送费 ￥"+delivery_fee+"元");
        System.out.println("合计\t￥"+Total_cost0+"元");
        System.out.println("----------------------------------------------------------");

        //第二部分订单信息
        String expectTime = "立即配送";
        String address = "锦绣花园（9-1801）";
        String service = "商家配送";
        System.out.println("期望时间"+"     "+expectTime);
        System.out.println("配送地址"+"     "+address);
        System.out.println("配送服务"+"     "+service);
        System.out.println("----------------------------------------------------------");

        //此段用于随机生成四个随机数组成一个订单号


        //用于生成时间
        LocalDateTime now = LocalDateTime.now();//获取当前的系统时间
        DateTimeFormatter ofPattern =DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");//用于格式化时间和日期的格式
        String orderId = generateOrderId();//调用生成的方法 随机订单号码
        String payStyle = "在线支付";
        String tableware = "商家按量提供";
        System.out.println("订单号码"+"     "+orderId);
        System.out.println("下单时间"+"     "+now.format(ofPattern));
        System.out.println("餐具数量"+"     "+tableware);

    }
}
