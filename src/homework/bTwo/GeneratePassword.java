package homework.bTwo;
import java.util.Scanner;
public class GeneratePassword {
    private static final String PROMPT_MESSAGE = "请您输入用户名：";//将提示信息定义为常量 提高可读性
    public static void userInterface() {//提示信息
        System.out.print(PROMPT_MESSAGE);
    }
    public static void userInterface(String userName, String password) {//传入用户名密码
        System.out.println("恭喜" + userName + "用户注册成功，您的初始密码为：" + password);
    }
}
class Operate {//操作类
    public static String reverseOrder(String userName) {//倒序后传出
        StringBuilder name = new StringBuilder(userName);//创建StringBuilder对象 命名为name
        return name.reverse().toString();//reverse方法反转，toString方法转换为字符串最后返回
    }
}
class Test {//测试
    public static void main(String[] args) {
        GeneratePassword.userInterface();//显示用户提示信息
        try (Scanner sc = new Scanner(System.in)) {//try-with-resources语句/Scanner获取输入
            String userName = sc.next();// 用户输入为用户名
            String password = Operate.reverseOrder(userName);//将其反转赋给密码
            GeneratePassword.userInterface(userName, password);//显示用户界面
        }
    }
}
//2023.11.11/10:1
/*编写程序，模拟默认密码的自动生成策略，键盘上输入用户名，根据用户名自动生成默认密码。在生成密码时，将用户名各个字符反转即为默认的密码。
实现步骤：
   （1）首先需要用Scanner类相关方法实现键盘手动输入一个字符串代表用户名。
    2） 要实现默认密码自动生成，根据任务描述可知默认密码就是手动输入用户名的反转及字符串的反转。
因此需要将字符串用循环倒着遍历，用charAt()方法接收遍历的字符并赋值给空串。
   （3） 在main()方法中调用上面的方法。并定义一个字符串变量接收结果。
   （4） 输出结果，观察控制台的效果*/
