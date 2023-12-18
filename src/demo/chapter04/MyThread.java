package demo.chapter04;
//2023.12.18
public class MyThread extends Thread{
    int count =0;
    @Override
    //显示1~100以内数
    public void run(){
        while (count<100){
            count++;
            System.out.println("1~100以内的数："+count);
        }
    }
    //定义主线程
    public static void main(String[] args) {
        //执行用户线程
        MyThread thread =new MyThread();
        thread.start();//执行用户线程
        //执行主线程
        for(int i =0;i<100;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
