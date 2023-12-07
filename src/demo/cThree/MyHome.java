package demo.cThree;

import java.util.HashMap;
import java.util.Map;

public class MyHome {
    String scene;//家乡风景
    String speciality;//特产
    String location; //位置
    String name;//名人

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //定义构造方法
    public MyHome(String scene, String speciality, String location, String name){
        this.scene =scene;
        this.speciality =speciality;
        this.location=location;
        this.name=name;
    }

    public static void main(String[] args) {
        //创建家乡风貌对象
        MyHome Home1 =new MyHome("老阴山","过桥米线","个旧","龙济光");
        MyHome Home2 =new MyHome("滇池大坝","小锅米线","滇中","岩龙");
        MyHome Home3 =new MyHome("和顺古镇","大救驾","滇西","李珍国");
        //创建map泛型集合
        Map<String,MyHome> map =new HashMap<String,MyHome>();

        //添加键值对数据
        map.put("红河州",Home1);
        map.put("昆明",Home2);
        map.put("西双版纳",Home3);

        //对map数据进行各项操作
        System.out.println("添加了" + map.size() + "个家乡信息");//以上代码是用于显示家乡信息数量的程序 。
        //增强型for循环遍历键集数据（家乡名）
        System.out.println();
        System.out.println("我们的家乡有：");
        for(String home:map.keySet()){
            System.out.print(home+" ");
        }
        for (String home:map.keySet()){
            System.out.print(home+" ");
            System.out.println();

            //获取键值
            MyHome homeInfo =map.get(home);
            System.out.print(home+"风貌"+homeInfo.getScene()+","+homeInfo.getSpeciality()+","+homeInfo.getLocation()+"," +
                    homeInfo.getName());
        }

    }
}
