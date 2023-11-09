package demo.Two.SharingEV;

public class Meituan extends SharingEV {
    private double startPrice; // 起步价
    //定义构造方法
    public Meituan(String brand, String color, float distance, int time, double startPrice) {
        super(brand, color, distance, time);
        this.startPrice = startPrice;
    }

    public double getStartPrice() {//取值
        return startPrice;
    }

    public void setStartPrice(double startPrice) {//赋值
        this.startPrice = startPrice;
    }

    @Override
    public void showRiding() {
        super.showRiding();
        System.out.println("可骑行距离: " + getDistance() + "km, 起步价: " + getStartPrice());
    }
    //重写父类的printInfo()骑行信息
    public void printInfo(){
        System.out.println("该共享电动车是"+getBrand()+"可骑行距离是："+getDistance()+"公里");
    }
}