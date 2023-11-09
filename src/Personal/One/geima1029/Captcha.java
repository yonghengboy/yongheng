package Personal.One.geima1029;
import java.util.Random;
import java.util.Scanner;
//验证码系统
public class Captcha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Go_on=0;
        while (true){
switch (Go_on){
    case 0:
        System.out.println("请输入需要生成验证码的长度");
        int length = sc.nextInt();
        System.out.println("验证码为"+captcha(length));
        System.out.println("是否继续 0/1 0.继续  1/退出");
        Go_on = sc.nextInt();
        break;
    case 1:
        System.out.println("正在退出");
        System.out.println("... ... ...");
        System.out.println("... ... ...");
        System.out.println("... ... ...");
        System.out.println("退出成功");
        return;
    default:
        System.out.println("无效输入 请重试");
            }
                    }
    }
    public  static  String  captcha(int length){
        String code="";
        Random r =new Random();
        for (int i = 0; i < length; i++) {
            int type = r.nextInt(3);
            switch (type){
                case 0://生成一个个位数字
                    code+=r.nextInt(10);
                    break;
                case 1://生成随机大写字母
                    char ch01=(char) (r.nextInt(26)+65);//大写A从 65位开始
                        code+=ch01;
                        break;
                case 2://生成小写字母
                    char ch02=(char) (r.nextInt(26)+97);
                    code+=ch02;
            }
        }
        return code;
    }
}
