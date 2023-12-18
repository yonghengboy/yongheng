package demo.chapter01;
//2023.10.19 对2022年鲜花商城四个季度的鲜切花销量，统计每个季度最高销量、平均销量及未达标销量。
public class StatisticsSales {
    public static void main(String[] args) {
        float[] quarter1 = {2,3.3f,4,5,1.9f};
        float[] quarter2 = {2.2f,3.1f,3.8f,5.5f,2};
        float[] quarter3 = {2.5f,3,5f,5.7f,2.1f};
        float[] quarter4 = {2.4f,3f,4.3f,5.6f,2.2f};

        //调用统计最高销量的方法
        System.out.println("第一季度鲜花最高销量为："+max(quarter1)+"万支");
        System.out.println("第二季度鲜花最高销量为："+max(quarter2)+"万支");
        System.out.println("第三季度鲜花最高销量为："+max(quarter3)+"万支");
        System.out.println("第四季度鲜花最高销量为："+max(quarter4)+"万支");
    }
    public static  float max(float[] sellings){
        int k=0;//用K位去比较
        for (int i = 1; i < sellings.length; i++) {//求sellings的最大值
            if(sellings[i]>sellings[k]){//如果i为大于k，那么就用K去记录i 记录最大元素下标
                    k=i;//K去记录i
            }
        }
        return sellings[k];//最后返回最大的第K位
    }
}
