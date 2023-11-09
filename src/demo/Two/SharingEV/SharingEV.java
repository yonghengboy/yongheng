//2023.10.30  请根据实地调研的共享电动车数据，以下为得分要求项
// 1.封装一个共享电动车类SharingEV。                 10行
// 2.要求类中不少于5项属性、                         11行
// 3.重载2次构造方法、                              22行
// 4.定义所有属性的setter()和getter()方法、          37行
// 5.一个骑行信息显示方法showRiding()，              78行
// 6.并在main()方法中创建3种品牌电动车对象，           85行
// 7.并调用showRiding()方法显示三个品牌电动车骑行信息。 90行
/*//2023.11.4 重构 优化
请继续根据实地调研的共享电动车数据，继续修改上一周课后作业代码，
一.在父类SharingEV中
   1.增加定义骑行管理费计算方法CalManagePrice()，
   2.增加骑行总费用计算方法CalTotalPrice()方法，
   3.任选2个品牌电动车子类中去重写这两个方法（根据实际调研计费数据重写），
二 .在测试类SharingEVTest类中，
   1.利用类的多态性，向上转型调用骑行信息显示方法printInfo()分别显示不同品牌电动车骑行信息。*/
package demo.Two.SharingEV;
public class SharingEV { //1.封装一个共享电动车类SharingEV。
    //  2.要求类中不少于5项属性
    private String brand;     // 品牌--01
    private String Color;     // 颜色---02
    private int electricity;  // 剩余电量---03
    private double price;     // 起步价格---04
    private boolean isRented; // 是否被租赁---05
    private float distance; //可行驶距离
    // 默认构造方法
    public SharingEV() {
    }
    public void CalManagePrice(){//1.增加定义骑行管理费计算方法CalManagePrice()，
        //分析
    }

    //  3.重载2次构造方法，接收品牌和颜色作为参数---01
    public SharingEV(String brand, String color) {
        this.brand = brand;
        this.Color = color;
    }
    // 重载构造方法，接收所有属性作为参数----02
    public SharingEV(String brand, String color, int electricity, double price, boolean isRented) {
        this.brand = brand;
        this.Color = color;
        this.electricity = electricity;
        this.price = price;
        this.isRented = isRented;
        this.distance = distance;
    }

    public SharingEV(String 昆明公交, String 蓝色, int i, double v, boolean b, int i1) {
    }

    //获取可行驶距离
    public float getDistance() {
        return distance;
    }

    public SharingEV(String brand, String color, float distance, int time) {
        this.brand = brand;
        this.Color = color;
        this.distance=distance;
        //this.time=time;
        // 这里你可能还需要为其他属性赋值，比如distance和time
    }

    // 4.定义所有属性的setter()和getter()方法、
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return Color;
    }
    public int getElectricity() {
        return electricity;
    }
    public double getPrice() {
        return price;
    }
    public boolean getisRented() {
        return isRented;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.Color = color;
    }
    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setRented(boolean rented) {
        isRented = rented;
    }


    // 5.一个骑行信息显示方法showRiding()，
    public void showRiding() {
        System.out.println("品牌: " + getBrand() + ", 颜色: " + getColor() + ", 剩余电量: " + getElectricity() + ", 起步价格: " + getPrice() + ", 是否被租赁: " + getisRented());
    }
    public void printInfo(){

    }

    // main方法
    public static void main(String[] args) {
        // 6.创建三种品牌电动车对象
        //SharingEV ev1 = new SharingEV("昆明公交", "蓝色", 30, 2.5, false, 100);
       SharingEV ev1 = new SharingEV("昆明公交", "蓝色", 30, 2.5, false);
        SharingEV ev2 = new SharingEV("美团", "黄色", 40, 1.75, true);
        SharingEV ev3 = new SharingEV("轻柠出行", "绿色", 50, 1.75, false);

        // 7.并调用showRiding()方法显示三个品牌电动车骑行信息。
        ev1.showRiding();
        ev2.showRiding();
        ev3.showRiding();
    }
}
/*//2023.11.4
请继续根据实地调研的共享电动车数据，继续修改上一周课后作业代码，
一.在父类SharingEV中
   1.增加定义骑行管理费计算方法CalManagePrice()，
   2.增加骑行总费用计算方法CalTotalPrice()方法，
   3.任选2个品牌电动车子类中去重写这两个方法（根据实际调研计费数据重写），
二 .在测试类SharingEVTest类中，
   1.利用类的多态性，向上转型调用骑行信息显示方法printInfo()分别显示不同品牌电动车骑行信息。*/