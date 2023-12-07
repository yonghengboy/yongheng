package demo.bTwo.SharingEV;

public class Qingning extends SharingEV {
    private double startPrice; // 起步价

    public Qingning(String brand, String color, float distance, int time, double startPrice) {
        super(brand, color, distance, time);
        this.startPrice = startPrice;
    }

    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
        this.startPrice = startPrice;
    }

    @Override
    public void showRiding() {
        super.showRiding();
        System.out.println("可骑行距离: " + getDistance() + "km, 起步价: " + getStartPrice());
    }
}