package demo.bTwo;

import demo.bTwo.SharingEV.SharingEV;

//定义昆明公交
public class KMgj extends SharingEV {
    double startPrice;//起步价
    double totalPrice;//总金额

    //定义构造方法
    public KMgj(String brand, String Color, float distance, int time, double startPrice) {
        super(brand, Color, distance, time);//调用父类构造方法
        this.startPrice = startPrice;
    }
    //定义成员方法
    public double getStartPrice(){//取值方法
        return startPrice;
    }
    public void setStartPrice(){//赋值方法
        this.startPrice=startPrice;
    }
    public void showRiding() {
        System.out.println("品牌: " + getBrand() + ", 颜色: " + getColor() + ", 剩余电量: " + getElectricity() + ", 起步价格: " + getPrice() + ", 是否被租赁: " + getisRented());
    }
}
