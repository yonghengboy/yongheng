package homework.chapter02;
import java.util.Scanner;
public class LogOn {
    private static final String PROMPT_MESSAGE0 = "请您输入用户名：";//提示信息
    private static final String PROMPT_MESSAGE1 = "请您输入用户密码：";//提示信息
    private static final String PROMPT_MESSAGE2 = "登陆成功!";//提示信息
    private static final String PROMPT_MESSAGE3 = "登录失败，还有";//提示信息
    private static final String PROMPT_MESSAGE30 = "次机会";//提示信息
    private static final String PROMPT_MESSAGE4 = "登陆失败!";//提示信息
    public static void userInterface0() {//提示信息 "请您输入用户名："
        System.out.println(PROMPT_MESSAGE0);
    }
    public static void userInterface1() {//提示信息 "请您输入用户密码："
        System.out.println(PROMPT_MESSAGE1);
    }
    public static void userInterface2() {//提示信息 "登陆成功"
        System.out.println(PROMPT_MESSAGE2);
    }
    public static void userInterface3(int i) {//提示信息 "登录失败，还有几次机会"
        System.out.println(PROMPT_MESSAGE3+i+PROMPT_MESSAGE30);
    }
    public static void userInterface4() {//提示信息 "登录失败"
        System.out.println(PROMPT_MESSAGE4);
    }
    public static void main(String[] args) {
        Operate0 op = new Operate0();
        Operate0.login();
    }
}
class data extends LogOn{//用户数据
    private String username = "admin";
    private String password = "123456";
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
class Operate0 extends LogOn {//操作类
        public static void login(){//输入e
            data data = new data(); // 创建Data对象
            int  times=3;//3次机会
            for (int i = 0; i <  times; i++) {
            Scanner sc= new  Scanner(System.in);
            userInterface0();//请输入用户名
            String username =sc.next();
            userInterface1();//请输入密码
            String password =sc.next();
            //判断是否正确
                if (username.equals(data.getUsername())&&password.equals(data.getPassword())){
                    userInterface2();
                    break;
                }else if (i==2){
                    userInterface4();
                }else {
                    userInterface3( times-i-1);
                }
            }
        }
}

/*
登录一个系统界面时通常都需要填写用户名和密码。用户名和密码输入都正确才会登录成功，否则会提示用户名或密码错误。要求编写程序，模拟用户登录。任务要求如下：
        （1）     用户名和密码正确，提示登录成功。
        （2）     用户名或密码不正确，提示“用户名或密码错误”。
        （3）     总共有3次登录机会，在3次内(包含三次)输入正确的用户名和密码后给出登录成功的相应提示。超过3次用户名或密码输入有误，则提示登录失败，无法再继续登录。
        任务分析：
        （1） 分析任务描述可知，已知用户名密码，定义两个字符串表示即可。
        （2） 键盘录入要登录的用户名密码。用Scanner实现。
        （3） 拿键盘录入的用户名密码和已知的用户名密码进行比较，给出相应的提示，字符串内容比较用equles实现。
        （4） 循环实现多次机会。这里次数明确，用for循环实现。并在登录成功的时候。用break结束循环。
：*/
