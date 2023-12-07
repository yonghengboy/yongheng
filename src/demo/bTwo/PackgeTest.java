package demo.bTwo;

//2023.11.13
public class PackgeTest {
    public static void main(String[] args) {
        //装箱
        int num1=10;
        Integer num2=new Integer(num1);
        int num4 =num1+num2;
        //拆箱
        int num3 =num2.intValue();

        //test
        //System.out.print(num1.toString());
        System.out.print(num2.toString());

        //基本数据类型转字符串数据
        float f = 5.5f;
        String str1 = String.valueOf(f);

        //基本数据类型转包装类
        double d = 10.2;
        Double D =Double.valueOf(d);

        //字符串转基本数据类型
        byte b =Byte.parseByte("20");
        float f1 =Float.parseFloat("11.5f");
    }
}
