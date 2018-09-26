package com.test.current;

/**
 * @description:
 * @author: yinc.luo
 * @date: 2018-07-03 23:47
 */
public class SingeTon2 {
    private static SingeTon2 st =null;
    private SingeTon2(){};

    public static SingeTon2 getInstance(){
        if(st != null){

        }else{
            synchronized (SingeTon2.class){
                st=new SingeTon2();
            }
        }
        return st;
    }

}
