package homework.Two;
//2023.11.2  #多态性的好处
//定义交通工具父类
class Vehicle{
    void fire(){
        System.out.println("交通工具启动");
    }
}


//轿车子类
class Car extends Vehicle{
    @Override
    void fire(){
        System.out.println("轿车在启动");
    }
    void service(){
        System.out.println("轿车在维修");
    }
}

//客车子类
class Bus extends Vehicle{
    @Override
    void fire(){
        System.out.println("客车在启动");
    }
    void run(){
        System.out.println("客车在行驶");
    }
}

//吉普车子类
class Jeep extends Vehicle{
    @Override
    void fire(){
        System.out.println("吉普车在启动");
    }
    void stop(){
        System.out.println("吉普车在停车");
    }
}

//高铁子类
class Railway extends Vehicle{
    @Override
    void fire(){
        System.out.println("高铁在启动");
    }
     void run(){
        System.out.println("高铁在停车");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
       /* //创建父类对象
        Vehicle v;//声明一个变量V*/

        //向上转型  轿车
        Vehicle v=new Car();//声明一个变量V
        v.fire();//调用重写的方法
        //向下转型
        System.out.println();
        Car car=(Car)v;
        car.service();//调用新增的方法

        //向上转型 客车
         v=new Bus();//声明一个变量V
        v.fire();//调用重写的方法
        //向下转型
        System.out.println();
        Bus Bus=(Bus)v;
        Bus.run();//调用新增的方法

        //向上转型 吉普车
        v=new Jeep();//声明一个变量V
        v.fire();//调用重写的方法
        //向下转型
        System.out.println();
        Jeep Jeep=(Jeep)v;
        Jeep.stop();//调用新增的方法

        //向上转型 高铁
        v=new Railway();//声明一个变量V
        v.fire();//调用重写的方法
        //向下转型
        System.out.println();
        Railway Railway=(Railway)v;
        Railway.run();//调用新增的方法

    }
}
