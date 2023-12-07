package demo.dcollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stu_CRUD {
    //定义集合数据初始化方法init()
    static List<Students> init(){//返回一个集合
        //（1）创建泛型集合
        List<Students> list =new ArrayList<Students>();
        //(2)创建学生对象
        Students stu1 = new Students("2023001","张三","计算机网络技术2301");
        Students stu2 = new Students("2023002","李四","计算机网络技术2302");
        Students stu3 = new Students("2023003","王五","计算机网络技术2303");
        //(3)添加集合数据
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        return list;//返回集合
    }

    public static void enquiry(List<Students> list){
        //迭代器 用于数据查询
        Iterator<Students> it =list.iterator();//创建迭代对象
        while (it.hasNext()){ //控制迭代的条件，判断是否还有下一条数据
            Students stu=it.next();//取出一条数据
            System.out.println(stu.getNumber()+" "+stu.getName()+" "+stu.getClasses());
        }

    }


    public static void main(String[] args) {
        //修改数据
        Students stu4 = new Students("2023004","赵六","计算机网络技术2304");
        init().set(0,stu4);
        enquiry(init());//查询修改后的集合

        //删除数据
        init().remove(0);
        enquiry(init());//查询删除后的集合

    }
}
