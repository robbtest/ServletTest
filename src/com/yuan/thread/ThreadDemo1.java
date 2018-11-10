package com.yuan.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
                DateFormat df = new SimpleDateFormat("yy/MM/dd kk:mm:ss");
                System.out.println("第"+(++i)+"次 "+ df.format(new Date()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
