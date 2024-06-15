/*
package homework.One;
import java.sql.SQLOutput;
import java.util.Scanner;//获取键盘 导包
*/
/*
项目需求
* 开发一个”网上订餐管理系统“，实现”我要订餐“、”查看订单“、”签收订单“、”删除订单“、”我要评价“和“退出系统”6个功能。
*   1.我要订餐
*       该功能为用户显示系统中提供的菜品信息，获得订餐人信息，形成订单。每条订单包含以下信息：
*      （1）订餐人姓名：用户输入。
*      （2）选择菜品及份数：显示3个供选择菜品的序号（也可以更多）、名称、单价、评价数，提示用户输入要选择的菜品序号及份数。
*      （3）送餐时间：当天9：00——22：00间整点送餐，要求用户输入9——22之间的整数，输入错误，可重新输入。
*      （4）送餐地址：用户输入。
*      （5）状态：订单的当前状态。订单有两种状态，0为已预订（默认状态），1为已完成（订单已签收）。
*      （6）总金额：订单总金额。总金额=菜品单价*份数+送餐费。其中，单笔定餐金额达到50元时，免收送餐费；否则，需加收5元送餐费。
*            各数组中相同下标的数据组成一条订单信息，因此对每个数组中下标相同的位置各增加一条数据并保存。
*   2.查看订单
*   3.签收订单
*   4.删除订单
*   5.我要评价
*//*



public class OrderingSystem {
    public static void main(String[] args) {

        int num = -1;//定义用户输入编号
        boolean isExit =false; //定义用户是否退出系统的标志，为真退出系统
        Scanner in =new Scanner(System.in);//创建键盘输入对象
        System.out.println("欢迎使用网上订单管理系统");
        do{
            //菜单界面
            System.out.println("******************************************");
            System.out.println("1.我要订餐");
            System.out.println("2.查看订单");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要评价");
            System.out.println("6.退出系统");
            System.out.println("******************************************");
            System.out.println("请选择：");
            int choose =in.nextInt();//记录用户所选择功能号

            //根据用户输入 执行功能
        switch (choose){
            case   1://我要订餐
                System.out.println("***我要订餐***");
                Boolean isAdd = false;//定义是否可以订餐
                for (int i=0;i<names.length;i++){   //找到第一个空位置，添加订单信息
                    if (names[i]==null){
                    isAdd=true;  // 标志位置真，可以订餐
                    System.out.println("请输入订餐人姓名：");
                    String name =in.next();

                    //显示供选择的菜品信息
                        System.out.println("序号"+"\t"+"菜品"+"\t\t"+"单价"+"\t\t"+"评价语");
                        for (int j=0;j<dishNames.length;j++){
                            String price=prices[j]+"元";
                            String judgeNum=(judgeNums[j]>0)?judgeNums[j]+"条":"0";
                            System.out.println((j+1)+"\t"+dishNames[j]+"\t\t"+price+"\t\t"+judgeNum);
                        }
                        //客户点菜
                        System.out.println("请选择您要点的菜品编号：");
                        int chooseDish = in.nextInt();
                        System.out.println("请选择您需要的份数：");
                        int number = in.nextInt();
                        String dishMeg = dishNames[chooseDish-1]+" "+number+ "份";
                        double sumprice=prices[chooseDish-1]*number;
                        double delicharge=(sumPrice>=50)?0:5;//餐费满50元，免配送费5元


                        }
                }

                break;
            case   2://查看订单
                System.out.println("***查看订单***");
                break;
            case   3://签收订单
                System.out.println("***签收订单***");
                break;
            case   4://删除订单
                System.out.println("***删除订单***");
                break;
            case   5://我要评价
                System.out.println("***我要评价***");
                break;
            case   6://退出系统
            default://用户输入了无效的值，退出系统
                isExit =true;//赋为真
                break;
        }
        if (!isExit) {//判断isExit是否为真，为假执行
            System.out.println("输入0返回");
            num = in.nextInt();//输入一个编号
        }else {
            break;
        }
        }while (num==0 );











    }
}
*/
