package demo.One;
import java.util.Scanner;//获取键盘


public class GoodsStock {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);//获取键盘


        //录入商品
//商品1
        String name1 = "老母鸡汤面";//商品名字
        String number1 = "6937962132187";//货号
        String vendor1 = "康师傅方便面投资有限公司";//供应商
        float price1 = 2.0f;//价钱 使用float类型
        String Product_type1 = "快餐类面制食品";//商品类型
        System.out.println("请输入"+name1+"的库存数：");//输入库存
        int inventory1 = in.nextInt();//获取商品数量
        float Inventory_Amount1 = inventory1*price1;//用于计算总价格
        System.out.println("库存"+name1+"的金额为："+Inventory_Amount1);//输出库存的金额


//商品2
        String name2 = "伊利牛奶";//商品名字
        String number2 = "6907992500133";//货号
        String vendor2 = "内蒙古伊利实业集团股份有限公司";//供应商
        float price2 = 2.5f;//价钱 使用float类型
        String Product_type2 = "高钙低脂奶";//商品类型
        System.out.println("请输入"+name1+"的库存数：");//输入库存
        int inventory2 = in.nextInt();//获取商品数量
        float Inventory_Amount2 = inventory2*price2;//用于计算总价格
        System.out.println("库存"+name2+"的金额为："+Inventory_Amount2);//输出库存的金额

        //输出清单
        System.out.println("---------------------------------库存清单---------------------------------"+"\n");

        System.out.println("商品名\t\t货号\t\t\t\t\t单价\t\t商品类型\t\t\t库存数\t库存金额");

        System.out.println(name1+"\t"+number1+"\t\t"+price1+"\t\t"+Product_type1+"\t\t"+inventory1+"\t\t"+Inventory_Amount1);

        System.out.println(name2+" \t\t"+number2+"\t\t"+price2+"\t\t"+Product_type2+"\t\t"+inventory2+"\t\t"+Inventory_Amount2);

    }
}