package homework.chapter01;
import java.util.Random;

public class test {
    public static void main(String[] args) {
    Random r =new Random();//#生成随机
    r.nextInt();//#生成随机数
  /*      Scanner in =new Scanner(System.in);//创建键盘输入对象
        byte a = (byte) in.nextInt();//获取键盘输入
    //    System.out.println((5>3)?10:20);
        int a = 200;
        String chagedeli = ((a>100)?"真厉害":"好棒");
        System.out.println(chagedeli);
        Random r = new Random();
        int number3 = r.nextInt(89)+10;
        System.out.println(number3);*/

        //数组的使用
        //数组的定义
        int[] a1 =new int[5];
        //数组的赋值
        int[] a2 ={5,54,54,35,35};
        //数组的长度属性：length 获取数组的长度（就是数组元素的个数）
        int[] a ={99,123,123,42,42,244,32,5322,212};
        //数组遍历循环技巧  a.fori 回车 a为数组名 i为创建名i的计数器
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //以上for可替换为以下增强型for
       /* 在增强的 'for' 循环中，我们直接声明一个临时变量 j，
       它会依次取得数组 a 中的每个元素的值。
       然后，我们可以在循环体中使用这个 element 变量来操作数组元素。
        这种增强的 'for' 循环语法适用于遍历数组或实现了 Iterable 接口的集合类对象。
        它提供了一种更简洁、易读的方式来遍历数组元素，并且无需手动管理索引变量。 */
        for (int j : a) {
            System.out.println(j);
        }
    }
/*  #空数组  未定义数组
  int[] arr = new int[0];
    int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
    arr = newArr;*/
}

/*  #调用其他类
// 其他类
public class OtherClass {
    public void sayHello() {
        System.out.println("Hello from OtherClass!");
    }

    public int add(int a, int b) {
        return a + b;
    }
}

// 主类
public class MainClass {
    public static void main(String[] args) {
        // 创建 OtherClass 对象
        OtherClass otherObj = new OtherClass();

        // 调用 OtherClass 中的方法
        otherObj.sayHello();

        int result = otherObj.add(5, 3);
        System.out.println("Addition result: " + result);
    }
}*/
