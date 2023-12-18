package demo.chapter01;
//2023-10-16
import java.util.Scanner;//获取键盘 导包
public class BegMax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);//创建键盘输入对象
       // int a =  sc.nextInt();//获取键盘输入
        int[] nums = new int[5];
        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("请输入第"+(i+1)+"个整数");
            nums[i]= sc.nextInt();
        }
        max =nums[0];
        //求最值
        for (int i = 1; i < nums.length; i++) {
        if(nums[i]>max){
            max =nums[i];
           index =i;
        }
        }
        System.out.println("该数值中最大值是："+max+"，其位置是第"+(index+1)+"个元素");
    }
}
