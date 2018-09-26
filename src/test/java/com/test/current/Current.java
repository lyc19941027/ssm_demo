package com.test.current;

import static java.lang.Thread.sleep;

/**
 * @description:
 * @author: yinc.luo
 * @date: 2018-07-02 16:20
 */
public class Current implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<10;i++){
            System.out.println(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Current cur =new Current();
        Thread thread = new Thread(cur);
        thread.run();
        Thread thread2 = new Thread(cur);
        thread2.run();
        new Thread(cur).start();


    }
}
