package homework.Two.SharingEV01;
import homework.One.test;

import java.util.Scanner;
public abstract class SharingEV {  //abstract 抽象类
    String brand,color,park;;//品牌 颜色 停车位置
    float distance,times;//可骑行距离 骑行时间
    public SharingEV(String brand, String color, float distance, float times, String park) {
        this.brand = brand;//品牌
        this.color = color;//颜色
        this.distance = distance;//可骑行距离
        this.times = times;//骑行时间
        this.park = park;//停车点
    }
    public SharingEV() {}//无参构造器
    public String getBrand() {return brand;}
    public String getColor() {return color;}
    public float getDistance() {return distance;}
    public float getTimes() {return times;}

    //骑行信息显示
    //public abstract void printInfo(String park);//定义抽象方法printInfo（）
  /*  public void printInfo(String park) {
        System.out.println("品牌：" + getBrand() + "\n颜色：" + getColor() + "\n可骑行距离：" +
                getDistance() + "公里，" + "\n骑行时间：" + getTimes() + "分钟。");
    }*/
   // public abstract double CalManagePrice(String park);//定义骑行管理费计算方法CalManagePrice()，

//骑行费用
    //public abstract double CalTotalPrice(double startPrice,double times);//定义抽象方法CalTotalPrice（）
    //public abstract double CalTotalPrice(String park);

}
class Kmgj extends SharingEV implements SharingDAO{//昆明公交
    double startPrice; // 起步价
    public Kmgj(String brand, String color, float distance, float times, String park) {
        super(brand, color, distance, times, park);
    }
    @Override//重写父类的printInFo()显示骑行信息
    public  void printInfo(String park) {
        System.out.println("品牌：" + getBrand() + "\n颜色：" + getColor() + "\n可骑行距离：" +
                getDistance() + "公里，" + "\n骑行时间：" + getTimes() + "分钟。\n骑行费用为：" + CalTotalPrice(this.park) + "元");
        //super.printInfo(park);//调用父类成员方法
    }
    @Override//重构调度费
    public double CalManagePrice(String park) {
        return switch (park) {
            case "停车点" -> 0;
            case "非停车点" -> 5;
            default -> 30;
        };
    }
    @Override////重构总费用计算
    public double CalTotalPrice(String park) {//需要停车位置
        double basePrice = 2.5;//起步价
        int baseTime = 20;//最低收费时间
        double ridePrice = 0;
        if (times <= baseTime) {//20为最低收费时间
            ridePrice = basePrice;//收费最低价
        } else {
            int additionalMinutes = (int) Math.ceil((times - baseTime) / 10); // 计算超过起步时间的额外分钟数
            ridePrice = basePrice + additionalMinutes; // 每10分钟收费1元
        }
        double managePrice = CalManagePrice(park);//调度费
        return ridePrice + managePrice;//调度费加其他钱
    }
}
class MeiTuan extends SharingEV {//美团

    double startPrice; // 起步价
    public MeiTuan(String brand, String color, float distance, float times, String park) {
        super(brand, color, distance, times, park);
        this.startPrice = startPrice;
    }
    //@Override//重写父类的printInFo()显示骑行信息
    public void printInfo(String park) {
        System.out.println("品牌：" + getBrand() + "\n颜色：" + getColor() + "\n可骑行距离：" +
                getDistance() + "公里，" + "\n骑行时间：" + getTimes() + "分钟。\n骑行费用为：" +
                CalTotalPrice(this.park) + "元");
    }
    //@Override//重构
    public double CalManagePrice(String park) {//调度费
        return switch (park) {
            case "停车点" -> 0;
            case "非停车点" -> 10;
            default -> 40;
        };
    }
    //@Override////重构总费用计算
    public double CalTotalPrice(String park) {//需要停车位置
        double basePrice = 2;//起步价
        int baseTime = 20;//最低收费时间
        double ridePrice = 0;
        if (times <= baseTime) {//baseTime为最低收费时间
            ridePrice = basePrice;//收费最低价
        } else {
            int additionalMinutes = (int) Math.ceil((times - baseTime) / 10); // 计算超过起步时间的额外分钟数
            ridePrice = basePrice + additionalMinutes; // 每10分钟收费1元
        }
        double managePrice = CalManagePrice(park);//调度费
        return ridePrice + managePrice;//调度费加其他钱
    }
}
class QinNingChuXing extends SharingEV {//青柠出行
    public QinNingChuXing(String brand, String color, float distance, float times, String park) {
        super(brand, color, distance, times, park);
    }
    //@Override//重写父类的printInFo()显示骑行信息
    public void printInfo(String park) {
        System.out.println("品牌：" + getBrand() + "\n颜色：" + getColor() + "\n可骑行距离：" +
                getDistance() + "公里，" + "\n骑行时间：" + getTimes() + "分钟。\n骑行费用为：" +
                CalTotalPrice(this.park) + "元");
    }
    //@Override
    public double CalManagePrice(String park) {
        return switch (park) {
            case "停车点" -> 0;
            case "非停车点" -> 5;
            default -> 20;
        };
    }
    //@Override////重构总费用计算
    public double CalTotalPrice(String park) {//需要停车位置
        double basePrice = 1.7;//起步价
        int baseTime = 12;//最低收费时间
        double ridePrice = 0;
        if (times <= baseTime) {//baseTime为最低收费时间
            ridePrice = basePrice;//收费最低价
        } else {
            int additionalMinutes = (int) Math.ceil((times - baseTime) / 12); // 计算超过起步时间的额外分钟数
            ridePrice = basePrice + additionalMinutes * 1.75; // 每12分钟收费1.5元
        }
        double managePrice = CalManagePrice(park);//调度费
        return ridePrice + managePrice;//调度费加其他钱
    }
}
class SharingEVTest {
    public static void main(String[] args) {
        /* //创建父类对象*/
        SharingEV v;//声明一个变量V
        Scanner scanner = new Scanner(System.in);
// 接收用户输入的停车地点
        System.out.print("请输入停车地：运营区外/非停车点/停车点 ？\n");
        String park = scanner.nextLine();
        while (true) {
            //拦截非法输入
            if (!(park.equals("运营区外") || park.equals("非停车点") || park.equals("停车点"))) {
                System.out.println("请输入正确的停车地点！！！");
                park = scanner.nextLine(); // 重新获取用户输入
            }else {break;}
        }


        //test
        //'SharingEV' 为 abstract；无法实例化 因为抽象方法无法实例化
       // SharingEV j=new SharingEV("昆明公交", "白色", 50.1f, 10);
            //向上转型 昆明公交
        SharingEV k = new Kmgj("昆明公交", "白色", 50.1f, 10, park);
        ((Kmgj) k).printInfo(park);
        System.out.println();
            //向上转型 美团
        SharingEV m = new MeiTuan("美团", "黄色", 60.2f, 30, park);
        ((MeiTuan) m).printInfo(park);
            //向上转型 青柠出行
        SharingEV C = new QinNingChuXing("青柠出行", "蓝色", 80.2f, 60, park);
        ((QinNingChuXing) C).printInfo(park);
    }
}

/*封装共享电动车类   注：打分的同学如实打分便可 得分点见下
2023.11.4 重构 优化
项目解析：
一.在父类SharingEV中
   1.增加定义骑行管理费计算方法CalManagePrice()，         22行
   2.增加骑行总费用计算方法CalTotalPrice()方法，          29行
   3.任选2个品牌电动车子类中去重写这两个方法（根据实际调研计费数据重写）， 53行 61行 87行 95行 120行 127行
二 .在测试类SharingEVTest类中，
   1.利用类的多态性，向上转型调用骑行信息显示方法printInfo()分别显示不同品牌电动车骑行信息 见142行至166行
   */
