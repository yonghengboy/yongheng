package demo.chapter03.Serializable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializableTest {
    static MobileCard card1;
    static MobileCard card2;
    static MobileCard card3;

    public static void main(String[] args) {
        //创建手机卡用户对象
        card1=new MobileCard("1234567890","小明","123456","5G冰淇淋98元",100,600,98,67);
        card2=new MobileCard("1222222222","小红","888888","5G全球通128元",200,8000,128,88);
        card3=new MobileCard("1888888888","张三","666666","8元保号套餐",2,100,8,28);

            //调用手机卡用户对象序列号的方法objecToFile()
        objecToFile();
        //调用读取本地文件对象数据的反序列化方法 fileToobject
        fileToobject();

    }
    //实现序列化方法
    static void objecToFile(){
        //声明对象输出流
        ObjectOutputStream oos =null;
        //开始序列化
        try {
            //1.创建对象输出流
            oos =new ObjectOutputStream(new FileOutputStream("E:\\cards.txt"));
            //2.创建集合对象
            List<MobileCard> list =new ArrayList<MobileCard>();
            //3.添加数据对象
            list.add(card1);
            list.add(card2);
            list.add(card3);
            //4.对象序列化，写入输入流
            oos.writeObject(list);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (oos!=null)
                    oos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    //实现反序列化,读取磁盘上的对象数据文件
    static void fileToobject(){
        //声明对象输入流
        ObjectInputStream ois = null;
        try {
            // 1.创建对象输入流，用于读取之前序列化的对象
            ois = new ObjectInputStream(new FileInputStream("E:\\cards.txt"));

            //2.读取集合对象数据（反序列化）
            List<MobileCard> cards = (List<MobileCard>) ois.readObject();
            // 遍历并输出对象信息 遍历泛型集合
            for (MobileCard card : cards) {
                System.out.println("手机号"+card.getNumber()+"\n"+"所属套餐："+card.getServicePackage()
                +"\n当月上网流量："+card.getRealFlow()+"GB"+
                 "\n当月通话时长："+card.getTalkTime()+"分钟"+
                 "\n当月消费金额："+card.getConsumAmount()+"元"+
                 "\n当前余额："+ card.getMoney()+"元\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // 当尝试反序列化一个不存在的类时，会抛出这个异常
            e.printStackTrace();
        } finally {
            // 关闭流
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
