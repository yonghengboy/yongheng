package Personal.One.geima1029;
import java.util.Objects;
import java.util.Scanner;
//计算飞机票折后价格 23.10.29
public class fla {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);//创建键盘输入对象
        System.out.println("请输入机票原价");
        double Price = (byte) sc.nextInt();//获取键盘输入
        System.out.println("请输入当前月份");
        int month= sc.nextInt();
        System.out.println("请输入您购买的舱位类型 头等舱/经济舱");
        String Accommodation =sc.next();
               /* //test
                double Price=1000;
                int month= 12;
                String Accommodation="经济舱";*/
        Airfare_money(Price,month,Accommodation);
    }
    public static void Airfare_money(double Price, int month, String Accommodation){

      if (data_processing(Price, month, Accommodation)) {

          double b = Price * Accommodation(discount(month), Accommodation);//将淡季或旺季 结果上传 返回打几折
          System.out.println("机票折后价为"+b+"元");
      }else {return;}
    }
    public static boolean discount(int month)//用于判断淡季 旺季
    {
        if (month>=5&&month<=10){

            return true;//旺季

        }else{
            return false;//淡季
        }
    }

    public static double Accommodation(boolean month, String Accommodation){//用于返回需要打几折
        if(month){
            if (Objects.equals(Accommodation, "头等舱")){
                return 0.9;
            }else {
                return 0.85;
            }
        }else {
            if (Objects.equals(Accommodation, "头等舱")){
                return 0.7;
            }else {
                return 0.65;
            }
        }

    }
    public static boolean data_processing(double Price, int month, String Accommodation){
        if (Price>=0){
        if (month>0&&month<12){//处理月份输入是否正确
            if(Objects.equals(Accommodation, "头等舱") || Objects.equals(Accommodation, "经济舱")){
                return true;
            }else {
                System.out.println("请输入正确的舱位 头等舱或者经济舱");
                return false;
            }
        }
        else {
            System.out.println("请输入正确的月份:1~12");
            return false;}
    }else {
            System.out.println("请输入一个正常的价钱");
            return false;
        }
    }

}
