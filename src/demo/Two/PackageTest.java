package demo.Two;

public class PackageTest {
    public static void main(String[] args) {
        int num1 = 15;
        Integer num2=new Integer(num1);//装箱
        System.out.println(num2.toString());

        int num3=num2.intValue();//拆箱，将包装类型转换回基本类型
        int num4 =num3+num1;
    }
}
