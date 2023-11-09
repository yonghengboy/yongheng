package demo.One;
//2023.10.19 编写方法实现求X的n次方（n为正整数）
public class Square {
    public static void main(String[] args) {
      double a= power(10,20);
        System.out.println(a);
    }
    public static double power(double x, double n){
        double t=1;//累加器
        for (int i = 0; i <=n; i++) {//n为指数
            t=t*x;//X为底数 T初始值为1 1*x再累加
        }
        return t;
    }
}
