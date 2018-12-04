package com.yuan.httpservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
   @author  yuan
   @time    2018/11/10 13:06
*/
@WebServlet(name = "HttpServletDemo1")
public class HttpServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("<h1>HttpServletDemo1</h1>");
        response.getWriter().println("<hr>");
        response.getWriter().println(" Local:<br/>");
        response.getWriter().println(" LocalName:"+request.getLocalName());
        response.getWriter().println(" LocalAddr:"+request.getLocalName());
        response.getWriter().println(" LocalPort:"+request.getLocalName());
        response.getWriter().println(" <br/>");
        response.getWriter().println("Remote:<br/>");
        response.getWriter().println(" RemoteHost:"+request.getRemoteHost());
        response.getWriter().println(" RemoteAddr:"+request.getRemoteAddr());
        response.getWriter().println(" RemotePort:"+request.getRemotePort());
        response.getWriter().println("<br/>");
        response.getWriter().println(" Schema:"+request.getScheme());
        response.getWriter().println(" Protocal:"+request.getProtocol());
        response.getWriter().println(" ContextPath:"+request.getContextPath());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
