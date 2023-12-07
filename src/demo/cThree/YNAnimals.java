package demo.cThree;
import java.util.ArrayList;
//2023-11-27
public class YNAnimals {
    public static void main(String[] args) {
        //#创建list集合对象
        ArrayList list = new ArrayList();
        //添加集合数据
        list.add("亚洲象");
        list.add("绿孔雀");
        list.add("滇金丝猴");
        list.add("玳瑁叶猴");
        //#遍历输出集合数据
        for (int i = 0; i < list.size(); i++) {
            String animals= (String) list.get(i);
            System.out.println(animals+" ");
            System.out.println(list.get(i));
        }//结束for循环

        //对集合数据实现修改和删除操作
        list.set(1,"黑颈鹤");//修改下标为1的数据为黑颈鹤
        list.remove(0);//删除下标为0的数据
        System.out.println( );
        //增强型for循环实现遍历数据
        for (Object o : list) {
            System.out.println((String) o+"test");
        }

        //list集合的其他常用操作
        System.out.println();
        //返回指定数据的索引值
        System.out.println(list.indexOf("玳瑁叶猴"));
        //判断集合是否为空
        System.out.println(list.isEmpty());
        //
    }
}
