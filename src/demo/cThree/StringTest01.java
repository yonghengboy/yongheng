package demo.cThree;
import java.util.Scanner;
public class StringTest01 {
    public static void main(String[] args) {
/*        //利用构造方法创造一个空字符串
        String emptyString = new String(); // 这将创建一个空的字符串对象
        //创建一个"你的家乡"字符串对象
        String s1 = new String("云南"); // 使用构造方法初始化字符串对象
        //创建study字符串数组，再用该数组创建一个字符串对象
        // 创建一个字符串数组
        String[] s2= {"s", "t", "u","d", "y"}; // 定义一个字符串数组

        // 使用字符串数组创建一个字符串对象
        String s3 = new String("sdc"); // 利用构造方法将字符串数组转换为字符串对象*/

        //23.11.23
        //直接赋初值
        String s1 = "532539200301143015";
        //使用无参的构造方法初始化
        String s2 = new String();
        //使用一个字符串参数的构造方法初始化
        String s3 = new String("Hello");
        //定义一个字符数组c
        char[] c ={'s','t','u','d','y'};
        //使用字符串数组初始化
        String s4 =new String(c);

        //获取字符串长度
        System.out.println(s1.length());
        //返回指定位置处的字符
        System.out.println(s3.charAt(1));
        //返回指定字符位置索引
        System.out.println(s3.indexOf('o'));
        //返回指定字符最后一次出现的位置索引
        System.out.println(s3.lastIndexOf('l'));

        //截取身份证中的出生日期
        System.out.println("我的出生日期是："+s1.substring(6,14));


        //调用用户身份合法性验证的方法
        //userLogin();

        //字符串转数组
        char[] c1=s3.toCharArray();
        //遍历显示该字符数组
        for (int i = 0; i < c1.length; i++) {
            System.out.println(c1[i]);
        }

        //数值数据转字符串
        String s5= new String();
        s5 = String.valueOf(12345.23);
        System.out.println(s5);

        //转为大写字母
        System.out.println(s3.toUpperCase());
        //转为小写字母
        System.out.println(s3.toLowerCase());

        //替换字符串
        String s6 =new String("今天是星期四");
        System.out.println(s6.replace("今天","昨天"));

        //去空格
        String s7 =new String("  我在 学习 ");
        System.out.println(s7.trim());//去除首尾空格
        System.out.println(s7.replace(" ",""));//去除所有空格

        //判断字符串是否以某个字串开头
        System.out.println("是否是云南的身份证号"+s1.startsWith("53"));//云南的身份证
        System.out.println(s3.startsWith("h"));
        //判断字符串是否以某个字符串结尾
        String s8 =new String("9527114@qq.com");
        System.out.println("是否是qq邮箱"+s8.endsWith("qq.com"));
        //判断是否包含某个字符串
        System.out.println("是否是邮箱地址"+s8.contains("@"));
        //判断字符串是否为空
        System.out.println(s8.isEmpty());

        String line = new String("昆明-磨憨-万象");
        //截取子串
        System.out.println("中老铁路的终点站"+line.substring(6));
        System.out.println("中老铁路的终点站"+line.substring(0,2));
        //分割字符串
        String[] station =line.split("-");
            //遍历各个站点
            for(String st:station){
                System.out.print(st+" ");
            }
/*        #判断字符
            #判断大写字母
        Character.isUpperCase(ch)：
        这个方法检查传入的字符ch是否为大写字母。
        如果ch是大写字母（如'A'到'Z'），它会返回true；否则返回false。

            #判断小写字母
        Character.isLowerCase(ch)：
        这个方法检查传入的字符ch是否为小写字母。
        如果ch是小写字母（如'a'到'z'），它会返回true；否则返回false。

            #判断数字
        Character.isDigit(ch)：
        这个方法检查传入的字符ch是否为数字。
        如果ch是数字（如'0'到'9'），它会返回true；否则返回false。*/

    }
    //定义userLogin()方法
    public static void userLogin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name =sc.next();
        System.out.println("请输入密码：");
        String pw =sc.next();
        if (name.equals("admin")&&pw.equals("123456")){
            System.out.println("登陆成功");
        }else {
            System.out.println("用户名或密码不匹配，登陆失败！");
        }

    }
}
