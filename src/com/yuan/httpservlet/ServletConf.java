package com.yuan.httpservlet;

import com.yuan.thread.ThreadDemo1;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/*
   @author  yuan
   @time    2018/11/10 13:18
*/
@WebServlet(name = "ServletConf")
public class ServletConf extends HttpServlet {
    public void init(ServletConfig conf)
            throws ServletException {

        System.out.println("ServletConf");
        ThreadDemo1 thread1 = new ThreadDemo1();
        thread1.start();
    }
    public void destroy(){

    }
}
