package demo.chapter01;
//2023.10.19
public class OutputRectangle {
    public static void main(String[] args) {
        //调用矩形的方法
        printRctangle(2,5);
        printRctangle(10,10);
    }
    public static void printRctangle(int height,int width){
    for (int i = 0; i < height; i++) {//用一重循环表示矩形行高
        for (int i1 = 0; i1 < width; i1++) {
            System.out.print("*");
        }
        System.out.println();//结束一行，换行继续输出第二行
        }
        System.out.println();
    }
}