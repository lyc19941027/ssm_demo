package com.test.current;

/**
 * @description:
 * @author: yinc.luo
 * @date: 2018-07-02 19:26
 */
public class SingeTon {
    private static SingeTon sg =new SingeTon();
    private SingeTon(){
        System.out.println("构造函数私有化");
    }
    public static SingeTon getInstance(){
        return sg;
    }
}

