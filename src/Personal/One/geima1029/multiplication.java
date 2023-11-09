package Personal.One.geima1029;
//2023.10.30 九九乘法表
//记住程序只能逐行输出 计算机本质只能打印行
public class multiplication {
    public static void main(String[] args) {
        for (int i = 1; i <=9; i++) {//行
            for (int j = 1; j <= i; j++) {//列
                System.out.print(j+"x"+i+"="+(j*i)+"\t");
            }

            System.out.println();
        }
    }
}
