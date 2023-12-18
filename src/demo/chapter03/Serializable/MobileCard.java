package demo.chapter03.Serializable;
//23.12.14
public class MobileCard implements java.io.Serializable{
//封装手机卡信息类
//1.定义属性
    String number;//卡号
    String name;//用户名
    String password;//密码
    String servicePackage;//套餐类型
    int realFlow;//上网流量
    int talkTime;//通话时长
    double consumAmount;//消费金额
    double money;//余额

    //2.定义构造方法
    public MobileCard(String number,String name,String password,String servicePackage,
                      int realFlow,int talkTime,double consumAmount,double money){
        this.number=number;//卡号
        this.name=name;//用户名
        this.password=password;//密码
        this.servicePackage=servicePackage;//套餐类型
        this.realFlow=realFlow;//上网流量
        this.talkTime=talkTime;//通话时长
        this.consumAmount=consumAmount;//消费金额
        this.money=money;//余额

    }

    //3.封装属性的get和set方法
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getServicePackage() {
        return servicePackage;
    }
    public void setServicePackage(String servicePackage) {
        this.servicePackage = servicePackage;
    }
    public int getRealFlow() {
        return realFlow;
    }
    public void setRealFlow(int realFlow) {
        this.realFlow = realFlow;
    }
    public int getTalkTime() {
        return talkTime;
    }
    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }
    public double getConsumAmount() {
        return consumAmount;
    }
    public void setConsumAmount(double consumAmount) {
        this.consumAmount = consumAmount;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    public static void main(String[] args) {

    }
}
