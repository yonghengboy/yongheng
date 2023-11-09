package Personal.One.geima1029;
import java.util.Scanner;
import java.util.Objects;
//评委打分 求分系统 23.10.29
public class grade {
    static Scanner sc =new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入评委人数");
        int number = sc.nextInt();
        System.out.println("当前选手得分为"+ grade(number));
    }
    public static double grade(int number){
            int[] scores =new int[number];
        for (int i = 0; i < number; i++) {//录入评委分数
            System.out.println("请输入第"+(i+1)+"个的分数");
            int score =sc.nextInt();
            scores[i]=score;
        }
            int sum = 0;
            int max = scores[0];
            int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
             max=Math.max(max,scores[i]);
             min=Math.min(min,scores[i]);
        }
        return 1.0* (sum - max - min) /(number - 2);//去除最高分与最低分
    }
}
