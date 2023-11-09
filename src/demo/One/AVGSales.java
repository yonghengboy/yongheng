package demo.One;
//2023.10.19 统计鲜花平均销量
public class AVGSales {
    public static void main(String[] args) {
        float[] quarter1 = {2,3.3f,4,5,1.9f}; //以万支为单位
        float[] quarter2 = {2.2f,3.1f,3.8f,5.5f,2};
        float[] quarter3 = {2.5f,3,5f,5.7f,2.1f};
        float[] quarter4 = {2.4f,3f,4.3f,5.6f,2.2f};
        System.out.println("第一季度平均销量是："+avg(quarter1)+"万枝");
        System.out.println("第二季度平均销量是："+avg(quarter2)+"万枝");
        System.out.println("第三季度平均销量是："+avg(quarter3)+"万枝");
        System.out.println("第四季度平均销量是："+avg(quarter4)+"万枝");
    }
public static float avg(float[] sellings){
        float sum =0;
    for (int i = 0; i < sellings.length; i++) {
        sum+=sellings[i];
    }
    return sum/sellings.length;
}
}

