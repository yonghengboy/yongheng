package homework.chapter04;

import java.util.ArrayList;
import java.util.List;

public class SharedResourceFailureExample {
    static List<Integer> sharedList = new ArrayList<>();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ListModifier(), "ModifierThread");
        Thread thread2 = new Thread(new ListReader(), "ReaderThread");

        thread1.start();
        thread2.start();


        //合2为一  写法
        new Thread(new ListModifier(),"线程1").start();
        new Thread(new ListReader(),"线程二").start();
    }

    static class ListModifier implements Runnable {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    sharedList.add(i);
                    Thread.sleep(100);
                }
                // 模拟崩溃
                throw new RuntimeException("Crash!");
            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName() + " crashed.");
            }
        }
    }

    static class ListReader implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println(sharedList);
                    Thread.sleep(100);
                }
            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName() + " encountered an error.");
            }
        }
    }
}
