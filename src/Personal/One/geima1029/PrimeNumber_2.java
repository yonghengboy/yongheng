package Personal.One.geima1029;
//2023.10.30 找素数2
public class PrimeNumber_2 {
    public static void main(String[] args) {
        System.out.println("为素数的有：");
        int count=0;
        for (int i = 101; i <=200 ; i++) {
            if (check(i)){//返回真执行 假跳过
                System.out.println(i);
                count++;
            }
        }
        System.out.println("素数一共有"+count);
    }
    public static boolean check(int a){//判断是否为素数
        for (int i = 2; i <=Math.sqrt(a) ; i++) {//使用Math 注释见PrimeNumber_2 末尾
            if (a%i==0){//余数为0表示能被整除 不为素数
                return false;//返回假
            }
        }
        return true;//返回真
    }
}
