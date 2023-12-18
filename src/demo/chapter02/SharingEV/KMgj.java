package demo.chapter02.SharingEV;

public class KMgj extends SharingEV {
    double startPrice;//起步价
    double totalPrice;//总金额

    //定义构造方法
    public KMgj(String brand, String color, float distance, int time, double startPrice) {
        super(brand, color, distance, time);//调用父类构造方法
        this.startPrice = startPrice;
    }
    public void showRiding() {
        super.showRiding();
        System.out.println("可骑行距离: " + getDistance() + "km, 起步价: " + getStartPrice());
    }

    //定义成员方法
    public double getStartPrice(){//取值方法
        return startPrice;
    }

    public void setStartPrice(double startPrice){//赋值方法
        this.startPrice = startPrice;
    }

        public float getDistance() {
            return getElectricity() * 1.0f; // 假设电量1%对应1公里
        }


    public static void main(String[] args) {
        // 创建KMgj对象
       KMgj ev1 = new KMgj("昆明公交", "蓝色", 30, 2, 20);
        ev1.setElectricity(80);
        ev1.setRented(true);
        ev1.showRiding();

        // 创建另一个KMgj对象
        KMgj ev2 = new KMgj("美团", "红色", 20, 1, 15);
        ev2.setElectricity(60);
        ev2.setRented(false);
        ev2.showRiding();
    }
    @Override//重写父类的printInfo()骑行信息
    public void printInfo(){
        super.printInfo();//调用父类成员方法
        System.out.println("起步价为："+getStartPrice()+"元");
    }
}


