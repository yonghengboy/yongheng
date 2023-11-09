package Personal.One.SharingEV;
import java.util.Scanner;
public class SharingEV {
    String brand,color,park;;//品牌 颜色 停车位置
    float distance,times;//可骑行距离 骑行时间
    public SharingEV(String brand, String color, float distance, float times, String park) {
        this.brand = brand;
        this.color = color;
        this.distance = distance;
        this.times = times;
        this.park = park;
    }
    public SharingEV() {}//无参构造器
    public String getBrand() {return brand;}
    public String getColor() {return color;}
    public float getDistance() {return distance;}
    public float getTimes() {return times;}
    public void printInfo(String park) {
        System.out.println("品牌：" + getBrand() + "\n颜色：" + getColor() + "\n可骑行距离：" +
                getDistance() + "公里，" + "\n骑行时间：" + getTimes() + "分钟。");
    }
    public double CalManagePrice(String park) {//定义骑行管理费计算方法CalManagePrice()，
        return switch (park) {
            case "停车点" -> 10;
            case "非停车点" -> 20;
            default -> 30;
        };
    }
    public double CalTotalPrice(String park) {//
        double ridePrice = 0;
        double basePrice = 1.75;//起步价
        int baseTime = 12;//最低收费时间
        if (times <= baseTime) {//小于最低收费时间
            ridePrice = basePrice;//收费最低价
        } else {
            int additionalMinutes = (int) Math.ceil((times - baseTime) / 12); // 计算超过起步时间的额外分钟数
            ridePrice = basePrice + additionalMinutes * basePrice; // 每12分钟收费1.75元
        }
        double managePrice = CalManagePrice(park);//调度费
        return ridePrice + managePrice;//调度费加其他钱
    }
}



