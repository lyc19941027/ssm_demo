package com.test.current;

/**
 * @description:
 * @author: yinc.luo
 * @date: 2018-07-03 23:50
 */
public class Demo implements Runnable{
    @Override
    public void run() {
        SingeTon2 s=SingeTon2.getInstance();
        System.out.println(s.hashCode());
    }

    public static void main(String[] args) {

        Demo demo=new Demo();
        new Thread(demo).start();
        new Thread(demo).start();new Thread(demo).start();new Thread(demo).start();
        new Thread(demo).start();
        new Thread(demo).start();


    }
}
