package homework.cThree;
import java.io.FileWriter;
import java.io.IOException;
//封装手机卡类MobileCard
class MobileCard{
    String number;//手机卡号
    String name;//用户名
    String password;//密码
    String servicePackage;//套餐类型
    double realFlow;//当月流量
    double talkTime;//通话时间
    double consumAmount;//消费金额
    //2.构造方法
    public MobileCard(String number, String name, String password, String servicePackage,
                      double realFlow, double talkTime, double consumAmount) {
        this.number = number;
        this.name = name;
        this.password = password;
        this.servicePackage = servicePackage;
        this.realFlow = realFlow;
        this.talkTime = talkTime;
        this.consumAmount = consumAmount;
    }
    //3.get与set
    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getServicePackage() {return servicePackage;}
    public void setServicePackage(String servicePackage) {this.servicePackage = servicePackage;}
    public double getRealFlow() {return realFlow;}
    public void setRealFlow(double realFlow) {this.realFlow = realFlow;}
    public double getTalkTime() {return talkTime;}
    public void setTalkTime(double talkTime) {this.talkTime = talkTime;}
    public double getConsumAmount() { return consumAmount;}
    public void setConsumAmount(double consumAmount) {this.consumAmount = consumAmount;}
    /*toString方法，用于输出手机卡信息*/
    @Override
    public String toString(){
        return "MobileCard{" +
                "手机卡号='" + number + '\'' +
                ", 用户名='" + name + '\'' +
                ", 密码='" + password + '\'' +
                ", 套餐类型='" + servicePackage + '\'' +
                ", 当月流量=" + realFlow +
                ", 通话时间=" + talkTime +
                ", 消费金额=" + consumAmount +
                '}';
    }
}
/**
 * 定义自己的手机消费记录类（只需要创建自己的手机号数据即可）；
 * */
class ConsumptionInfo {
    //1.定义属性
    private MobileCard mobileCard; // 手机卡对象
    private double flowUsage; // 流量使用量
    private double balance; // 话费余额
    private double remainingTalkTime; // 剩余通话时间
    private double consumAmount; // 消费金额

    // 2.构造方法
    public ConsumptionInfo(MobileCard mobileCard, double flowUsage, double balance,
                           double remainingTalkTime, double consumAmount) {
        this.mobileCard = mobileCard;
        this.flowUsage = flowUsage;
        this.balance = balance;
        this.remainingTalkTime = remainingTalkTime;
        this.consumAmount = consumAmount;
    }

    // 3.getter和setter方法
    public MobileCard getMobileCard() {return mobileCard;}
    public void setMobileCard(MobileCard mobileCard) {this.mobileCard = mobileCard;}
    public double getFlowUsage() {return flowUsage;}
    public void setFlowUsage(double flowUsage) {this.flowUsage = flowUsage;}
    public double getBalance() {return balance;}
    public void setBalance(double balance) {this.balance = balance;}
    public double getRemainingTalkTime() {return remainingTalkTime;}
    public void setRemainingTalkTime(double remainingTalkTime) {this.remainingTalkTime = remainingTalkTime;}
    public double getConsumAmount() {return consumAmount;}
    public void setConsumAmount(double consumAmount) {this.consumAmount = consumAmount;}

    // toString方法，用于输出消费信息
    @Override
    public String toString() {
        return "ConsumptionInfo{" +
                "手机卡对象=" + mobileCard +
                ", 流量使用量=" + flowUsage +
                ", 话费余额=" + balance +
                ", 剩余通话时间=" + remainingTalkTime +
                ", 消费金额=" + consumAmount +
                '}';
    }
}
/**
3、定义存储手机消费记录的工具类*/
class ConsumptionUtil {
    // 将消费信息保存到文本文件的方法
    public static void saveConsumptionInfo(ConsumptionInfo info, String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath, true); // 打开文件用于追加内容
            writer.write(info.toString() + "\\n"); // 写入消费信息
            writer.close(); // 关闭文件
        } catch (IOException e) {
            e.printStackTrace(); // 打印异常信息
        }
    }
}
    /**
     * 主类
     * */
 public  class DataStorage {

        // 清空文本文件内容的方法
        public static void clearFileContent(String filePath) {
            try (FileWriter writer = new FileWriter(filePath, false)) {
                // FileWriter 构造方法的第二个参数为 false，代表不追加内容，直接清空文件
                writer.write(""); // 写入一个空字符串，清空文件内容
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static void main(String[] args) {
            // 创建MobileCard对象
            MobileCard card = new MobileCard("1234567890", "张三", "password123",
                    "经济套餐", 500, 300, 200);

            // 创建ConsumptionInfo对象
            ConsumptionInfo consumptionInfo = new ConsumptionInfo(card, 100, 150, 200,
                    50); // 数据

            // 指定文件路径
            String filePath = "E:/MobileCosum.txt"; // 请确保此路径在您的系统中有效

            // 清空文本文件中的内容  需要时执行
           /* clearFileContent(filePath);
            System.out.println("数据已清空！！！");*/

            //保存数据
            ConsumptionUtil.saveConsumptionInfo(consumptionInfo, filePath);// 使用ConsumptionUtil类保存消费信息到文件
            System.out.println("消费信息已保存到文件: " + filePath);    // 输出到控制台以确认操作
        }

}
/*
网络技术WN2307第15周课后作业
模仿线上课任务5“程序微实践”把自己的手机卡当月消费数据保存到”D:\MobileCosum.txt"文件。
    提示：
1、首先封装手机卡类MobileCard;
2、定义自己的手机消费记录类（只需要创建自己的手机号数据即可）；
3、定义存储手机消费记录的工具类*/
