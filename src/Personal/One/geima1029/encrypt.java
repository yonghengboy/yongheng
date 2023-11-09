package Personal.One.geima1029;
import java.util.Scanner;
import java.util.Objects;
//23.10.29 数字加密系统
public class encrypt {
    public static void main(String[] args) {
        System.out.println("请输入需要加密的数字密码");
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int After_encryption=encrypt0(digit);//加密后
        System.out.println("加密后为"+After_encryption);
    }
    public static int encrypt0(int digit){
        int[] digit1  =split(digit);//数字拆分
        int[] Encrypt_arrays =encrypt0(digit1);//加密
return digit(Encrypt_arrays);

    }
    public static int[] encrypt0(int[] digit){//用于加密
        int count=digit.length-1;
        for (int i = 0; i < count; i++,count--) {//加5 对10取余，再反转
            int deposit;//寄存
            deposit=(digit[i]+5)%10;
            digit[i]=(digit[count]+5)%10;
            digit[count]=deposit;
        }
        return digit;
    }
    public static int[] split(int number){//将数字分开
            int[] digit= new int[4];
            digit[0]=number/1000;//求第一位
            digit[1]=(number/100)%10;//第二位
            digit[2]=(number/10)%10;//第三位
            digit[3]=(number%10);//第四位
        return digit;
    }
    public static  int digit(int[] Encrypt_arrays){//将数字合并
        int digit=0;
        int a=Encrypt_arrays.length-1;
        for (int encryptArray : Encrypt_arrays) {
            //用于求乘方 例如 数组1 2 3 4 要装位1234 需要1*1000+2*100 等
            int divisor= (int) Math.pow(10, a);
            digit += encryptArray * divisor;
            a--;
        }
        return digit;
    }
}
