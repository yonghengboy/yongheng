package demo.chapter04;
//23.12.21
public class YieldThread {
    public static void main(String[] args) {
        new Thread(new MyYield(),"线程A").start();
        new Thread(new MyYield(),"线程B").start();
    }
}
//定义用户线程
class MyYield implements Runnable{
    public void run(){
        for(int i = 1;i<=6;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            if (i==3){
                System.out.println("进程让步：");
                Thread.yield();//当前线程让步
            }
        }
    }

}
