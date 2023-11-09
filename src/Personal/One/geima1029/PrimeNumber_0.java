package Personal.One.geima1029;
//2023.10.30 找素数0
public class PrimeNumber_0 {
    public static void main(String[] args) {
int[] number=Function(101,200);
        System.out.println("素数有"+number.length+"个"+"\n  "+"分别为:");
        output(number);
    }
    public static int[] Function(int number0, int number1) {
        int[] arr = new int[0];
        int sum = 0;
        for (int i = number0; i <=number1; i++) {
            boolean isPrime = true;//增加一个判断 经过下面for 如果没有被整除 那还是真 可进入20行if (isPrime) { 录入素数
            for (int j = 2; j <= Math.sqrt(i); j++) {//注释见末尾
                if (i % j == 0) {//余数为0 说明不为素数
                    isPrime = false;//能被整除 便为假 这个数不是素数 开始下一个数
                    break;//退出这层循环 开始下一个数
                }
            }
            if (isPrime) {//为真进入  #灵活数组
                int[] newArr = new int[arr.length + 1];
                System.arraycopy(arr, 0, newArr, 0, arr.length);
                newArr[sum] = i;
                sum++;
                arr = newArr;
            }
        }
        return arr;
    }
    public static void output(int[] arr){//遍历输出数组
        for (int j : arr) {
            System.out.print(j+",");
        }
    }
}
/*      关于14行 for (int j = 2; j <= Math.sqrt(i); j++)
在素数判断中，我们想要找到一个数i是否为素数。一个常见的方法是使用一个循环，从2开始逐个除以所有小于i的数，判断是否能够整除。但是，这种方法会导致不必要的计算。

        我们可以做一个优化，只需要在循环中判断j是否小于或等于Math.sqrt(i)，而不是一直循环到i的一半。这是因为如果一个数i不是素数，那么它一定可以被小于或等于它平方根的某个数整除。

        举个例子，假设我们要判断i=16是否为素数。如果我们按照常规方法，从2到i/2=8逐个除以i，我们会发现16可以被2整除，不是素数。但是实际上，我们只需要判断2到Math.sqrt(16)=4之间的数即可。因为如果16不是素数，那么一定存在一个小于或等于4的数能够整除16。

        所以，使用Math.sqrt(i)可以帮助我们减少循环的次数，提高效率。*/
