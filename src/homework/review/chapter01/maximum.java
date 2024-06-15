package homework.review.chapter01;
//数组元素求最值
public class maximum {
    public static void main(String[] args) {
        int[] arr={1,23,456,64,32,21,22};
        //方法一  Max min
        MaxMin(arr);
        //方法二   最大值 最小值 可用 Math
        MaxMin_Math(arr);
    }
    //方法一  Max min
    public static void MaxMin(int[] a){
        int Max=a[0];
        for(int i=0;i<a.length;i++){
            if (Max<a[i]){//if > Max 则更新
                Max=a[i];
            }
        }
        int Min=a[0];
        for (int i=0;i<a.length;i++){
            if (Min>a[i]){//if i<min 则更新
                Min=a[i];
            }
        }
    }

    //方法二 使用Math
    public static void MaxMin_Math(int[] arr){
        int max=arr[0];
        for (int i = 0;i<arr.length;i++){
            max=Math.max(max,arr[i]);//使用Math.max来比较并获取最大值
        }
        int min=arr[0];
        for (int i =0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
    }
}
