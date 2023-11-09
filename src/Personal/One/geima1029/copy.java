package Personal.One.geima1029;
import java.util.Arrays;
//2023-10-16 拷贝数组
public class copy {
    public static void main(String[] args) {
        int[] arr0={21,32,41};
        int[] arr1=number_copy(arr0);
        output(arr1);

    }
    public static  void output(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i<arr.length-1?arr[i]+",":arr[i]+"]"));
        }
    }
    public static int[] number_copy(int[] arr){
        int[] arr1=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
        }
        return arr1;
    }
}
