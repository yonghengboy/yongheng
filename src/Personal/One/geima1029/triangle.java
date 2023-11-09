package Personal.One.geima1029;
//2023.10.31 输出三角形
/*分析需求
 行i   星号n  空格k  总行数sum
 1     1      3      4
 2     3      2
 3     5      1
 4     7      0
 3=sum-i
 n=2*i-1 /等差数列
 */
public class triangle {
    public static void main(String[] args) {
            int sum =14;
        for (int i = 1; i <=sum; i++) {//确定输出行数
            for (int j = 1; j <= (sum-i);j++) {//控制输出空格数量
                System.out.print(" ");
            }
            //控制星号输出
            for (int j = 1; j <=(2*i-1);j++){
                System.out.print(j%2==0?" ":"*");//列数j 偶数打空格 单数打星号   
            }
            System.out.println();
        }
    }
}
