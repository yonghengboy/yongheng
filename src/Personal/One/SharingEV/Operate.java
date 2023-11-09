/*
package Personal.One.SharingEV;

import demo.Two.SharingEV.SharingEV;

import java.util.Scanner;

//操作 用于处理数据
public class Operate extends SharingEV{//继承主程序的全局变量
    private Operate(){};//
}
class Kmgj extends homework.Two.SharingEV.SharingEV {//昆明公交
    double startPrice; // 起步价
    public Kmgj(String brand, String color, float distance, float times, String park) {
        super(brand, color, distance, times, park);
    }
    @Override//重写父类的printInFo()显示骑行信息
    public void printInfo(String park) {
        super.printInfo(park);//调用父类成员方法
        System.out.println("骑行费用为：" + CalTotalPrice(this.park) + "元");
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
class MeiTuan extends homework.Two.SharingEV.SharingEV {//美团
    double startPrice; // 起步价
    public MeiTuan(String brand, String color, float distance, float times, String park) {
        super(brand, color, distance, times, park);
        this.startPrice = startPrice;
    }
    @Override//重写父类的printInFo()显示骑行信息
    public void printInfo(String park) {
        super.printInfo(park);//调用父类成员方法
        System.out.println("骑行费用为：" + CalTotalPrice(this.park) + "元\n");
    }
    @Override//重构
    public double CalManagePrice(String park) {//调度费
        return switch (park) {
            case "停车点" -> 0;
            case "非停车点" -> 10;
            default -> 40;
        };
    }
    @Override////重构总费用计算
    public double CalTotalPrice(String park) {//需要停车位置
        double basePrice = 2;//起步价
        int baseTime = 20;//最低收费时间
        double ridePrice = 0;
        int times;
        if (times <= baseTime) {//baseTime为最低收费时间
            ridePrice = basePrice;//收费最低价
        } else {
            int additionalMinutes = (int) Math.ceil((getTimes() - baseTime) / 10); // 计算超过起步时间的额外分钟数
            ridePrice = basePrice + additionalMinutes; // 每10分钟收费1元
        }
        double managePrice = CalManagePrice(park);//调度费
        return ridePrice + managePrice;//调度费加其他钱
    }
}
class QinNingChuXing extends homework.Two.SharingEV.SharingEV {//青柠出行
    public QinNingChuXing(String brand, String color, float distance, float times, String park) {
        super(brand, color, distance, times, park);
    }
    @Override//重写父类的printInFo()显示骑行信息
    public void printInfo(String park) {
        super.printInfo(park);//调用父类成员方法
        System.out.println("骑行费用为：" + CalTotalPrice(this.park) + "元\n");
    }
    @Override
    public double CalManagePrice(String park) {
        return switch (park) {
            case "停车点" -> 0;
            case "非停车点" -> 5;
            default -> 20;
        };
    }
    @Override////重构总费用计算
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
        */
/* //创建父类对象*//*

        homework.Two.SharingEV.SharingEV v;//声明一个变量V
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
        //向上转型 昆明公交
        homework.Two.SharingEV.SharingEV k = new homework.Two.SharingEV.Kmgj("昆明公交", "白色", 50.1f, 60, park);
        k.printInfo(park);
        System.out.println();
        //向上转型 美团
        homework.Two.SharingEV.SharingEV m = new homework.Two.SharingEV.MeiTuan("美团", "黄色", 60.2f, 60, park);
        m.printInfo(park);
        //向上转型 青柠出行
        homework.Two.SharingEV.SharingEV C = new homework.Two.SharingEV.QinNingChuXing("青柠出行", "蓝色", 80.2f, 60, park);
        C.printInfo(park);
    }
}

*/
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
