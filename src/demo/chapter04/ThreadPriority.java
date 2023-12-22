package demo.chapter04;
//2023.12.21
//线程优先级
public class ThreadPriority {

    public static void main(String[] args) {
        Thread minPriority = new Thread(new Task(),"优先级较低的线程");
        Thread maxPriority = new Thread(new Task(),"优先级较高的线程");

        //设置线程的优先级
        minPriority.setPriority(Thread.MIN_PRIORITY);
        maxPriority.setPriority(Thread.MAX_PRIORITY);

        //启动线程
        minPriority.start();
        maxPriority.start();
    }
}

//用户线程类
class Task implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"正在输出："+i);//当前线程的名字
        }
    }
}