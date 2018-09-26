package com.test.current;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description:
 * @author: yinc.luo
 * @date: 2018-07-02 18:28
 */
public class Current2 implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        return 1;
    }

    public static void main(String[] args) {
        Current2 sur= new Current2();
        FutureTask<Integer> result = new FutureTask<Integer>(sur);
        new Thread(result).start();

        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

