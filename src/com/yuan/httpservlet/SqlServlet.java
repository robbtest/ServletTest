package com.yuan.httpservlet;

import com.mysql.cj.protocol.Resultset;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

/*
   @author  yuan
   @time    2018/12/4 22:31
*/
@WebServlet(name = "SqlServlet")
public class SqlServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setHeader("content-type","text/html;charset=utf-8");
            response.setCharacterEncoding("utf-8");
            response.getWriter().println("数据库查询：<br/>");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://www.robb.store:3306/dashi","robb","linux");
            String strSql = "select * from websites;";
            PreparedStatement preStm = con.prepareStatement(strSql);
            ResultSet re = preStm.executeQuery();
            while (re.next()){
                response.getWriter().println(re.getString(1)+"="+re.getString(2));
                response.getWriter().println("<br/>");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
