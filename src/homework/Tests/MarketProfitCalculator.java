package homework.Tests;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

class Product {
    String name;
    double steamPrice;
    double uuPrice;
    double profit;

    public Product(String name, double steamPrice, double uuPrice) {
        this.name = name;
        this.steamPrice = steamPrice;
        this.uuPrice = uuPrice;
        this.profit = (500 / steamPrice) * uuPrice - 500;
    }
}

public class MarketProfitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        while (true) {
            // 输入商品名称
            System.out.println("请输入商品名称: ");
            String name = scanner.next();

            // 输入Steam市场的商品价格
            System.out.println("请输入Steam市场的商品价格: ");
            double steamPrice = scanner.nextDouble();

            // 输入UU市场的商品价格
            System.out.println("请输入UU市场的商品价格: ");
            double uuPrice = scanner.nextDouble();

            // 创建商品对象并添加到列表中
            products.add(new Product(name, steamPrice, uuPrice));

            // 询问用户是否继续
            System.out.println("是否继续输入商品？(yes/no): ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }
        }

        // 按收益排序商品
        products.sort(Comparator.comparingDouble(p -> -p.profit));

        // 输出商品收益排行
        System.out.println("商品收益排行:");
        for (Product product : products) {
            System.out.println(product.name + "  Steam市场价格: " + product.steamPrice + "元  UU市场价格: " + product.uuPrice + "元  收益: " + product.profit + "元");
        }
    }
}
