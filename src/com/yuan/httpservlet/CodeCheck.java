package com.yuan.httpservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
   @author  yuan
   @time    2018/11/26 23:00
*/
@WebServlet(name = "CodeCheck")
public class CodeCheck extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String clientCode = request.getParameter("validateCode");
        String serverCode = (String)request.getSession().getAttribute("CheckCode");

        response.setHeader("content-type","text/html;charset=utf-8");
        if(serverCode.equals(clientCode)){
            response.getWriter().println("<h1>验证成功</h1>");
        }else{
            response.getWriter().println("<h1>验证失败</h1>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
