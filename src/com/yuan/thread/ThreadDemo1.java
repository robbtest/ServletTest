package com.yuan.thread;

/*
   @author  yuan
   @time    2018/11/10 13:20
*/
public class ThreadDemo1 extends Thread {
    public void run(){
        int i = 0;
        try {
            while (true){
                Thread.sleep(1000);
                System.out.println("第"+(++i)+"次");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
