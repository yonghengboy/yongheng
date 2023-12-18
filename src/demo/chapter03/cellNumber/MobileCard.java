package demo.chapter03.cellNumber;
//23.12.11
public class MobileCard {
    //封装手机卡消费记录类
    //1.定义属性
    String number;//卡号
    String servicePackage;//套餐类型
    int realFlow;//上网流量
    int talkTime;//通话时长
    double consumAmount;//消费金额
    double money;

    //2.定义构造方法
    public MobileCard(String number,String servicePackage,
                      int realFlow,int talkTime,double consumAmount,double money){
        this.number=number;
        this.servicePackage=servicePackage;
        this.realFlow=realFlow;
        this.talkTime=talkTime;
        this.consumAmount=consumAmount;
        this.money=money;

    }
    //3.封装属性的get和set方法

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    @Override
    public String toString(){
        String message = "手机号："+number+"\n"+"本月上网流量："+realFlow+"\n"+"本月通话时长："+talkTime+"分钟"+"\n"+
                "消费金额："+consumAmount+"元"+"\n"
                +"余额"+money+"元";
        return message;
    }

    public static void main(String[] args) {

    }
}
