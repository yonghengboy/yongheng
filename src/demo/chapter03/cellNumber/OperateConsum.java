package demo.chapter03.cellNumber;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//操作手机消费记录类
public class OperateConsum {
    //定义存放消费的泛型集合List
  static  List<MobileCard>list= new ArrayList<MobileCard>();

    public static void main(String[] args) {
        init();//消费记录初始化的方法

        //模仿操作界面实现消费记录的查询方法
        while (true){
            Scanner sc =new Scanner(System.in);
            System.out.println("请输入要查询的手机号：");
            String number =sc.next();
            //调用查询手机记录的方法getRecords()
            MobileCard records = getRecords(number);
            if (records!=null){
                System.out.println(number+"的当月消费记录："+"\n"+records);
                //调用保存消费记录的方法saveRecords()
                saveRecords(records);
            }else {
                System.out.println("该手机号未注册！");
            }//结束if
        }
    }
    //实现init()
    static void init(){
        MobileCard card1 =new MobileCard("19888888888","5G冰淇淋套餐",30,500,128,10);
        list.add(card1);//将数据添加到list集合容器中
    }
    //实现getRecord()方法
    static MobileCard getRecords(String number){
        for(MobileCard card:list){
            if(number.equals(card.number)){
                return card;
            }
        }
        return null;
    }
    //定义保存手机消费记录的saveRecords()方法
    static void saveRecords(MobileCard card){
        //声明文件输入流对象
        InputStream in =null;
        BufferedOutputStream bos =null;
        // 使用StringBuilder来构建字符串
        StringBuilder sbf = new StringBuilder();
        try {
            in = new FileInputStream("E:\\MobileConsum.txt");
           sbf.append(card.number);//添加手机号
           sbf.append(card.realFlow);//添加上网流量
           sbf.append(card.talkTime);//添加通话时长
           sbf.append(card.consumAmount);//添加消费金额
           sbf.append(card.money);//添加余额
            //把添加的消费记录显示为字符串
            String str = sbf.toString();
            //把字符串转换为字节数组
            byte[]b =str.getBytes();
            //把字节数组的消费记录写入本地文件
            for(int i = 0;i<b.length;i++){
                bos.write(b[i]);
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(in!=null)
                    in.close();
                if (bos!=null)
                    bos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
