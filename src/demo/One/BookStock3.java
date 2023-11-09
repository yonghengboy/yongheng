package demo.One;
//书库
public class BookStock3 {
    public static void main(String[] args) {

            //第一部分订单信息
            String name1 = "手造麻薯";
            int Number1 = 1;
            float price1 = 4.5f;
            String producer1 = "东莞市沣西食品有限公司";
            String OrderId1 = "6 954491300085";
            //第二部份商品信息
            String name2 = "夹心曲奇";
            int Number2 = 1;
            int price2 = 6;
            String producer2= "漳州市吉祥食品有限公司";
            String OrderId2= "6 954491300068";
            float foodsprice = price1*Number1+price2*Number2;

            System.out.println("---------------------------------");
            System.out.println(name1+"\t\t"+Number1+"份"+"\t"+"￥"+price1+"元");
            System.out.println("生产商"+"\t"+producer1+"\t\t"+"商品编号"+OrderId1);
    }
}
