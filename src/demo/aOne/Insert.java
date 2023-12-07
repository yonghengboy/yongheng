package demo.aOne;
//2023-10-16  有序插入
public class Insert {
    public static void main(String[] args) {
        int[] arry={22,30,38,49,55,60};
        int n=arry.length;
        int num=48;
        int i=0;
        int index=-1;//数组索引位置
        for ( i = 0; i < n;i++) {
            if (arry[i] > num) {
                index = i;
                break;
            }
        }
        if (index==-1){
            System.out.println("未找到");
        }else {
            for ( i = n-1; i > index; i--) {
                arry[i]=arry[i-1];
            }
        }
        for (int i1 = 0; i1 < n; i1++) {
            System.out.println(arry[i1]);
        }
    }
}