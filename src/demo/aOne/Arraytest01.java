package demo.aOne;

public class Arraytest01 {

    public static void main(String[] args) {
        int[] scores =new int[5];
        //System.out.println(scores[4]);

        float[] temps = new float[10];
        //表示第9天的气温
        float a =temps[8];
        //定义temps数组的长度t
        int t=temps.length;

        String[] cities =new String[6];
        //表示第三个旅游城市
        String t1 = cities[2];
        //定义 cities数组的长度c
        int c = cities.length;
        //初始化3个学生姓名数组 names
        //初始化3件商品的价格  price
        String[] names ={"小明","小红","小绿"};
        double[] price ={9.9,19,88,};
        for (String name : names) {
            System.out.println(name);
        }
        int[] a1=new int[3];
        float[] a2 =new float[3];
        double[] a3 =new double[5];
        long[] a4 =new long[1];

        //多维数组
//int[][] duo1={89,32,};{};
    }
}
