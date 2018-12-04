<%--
  Created by IntelliJ IDEA.
  User: yuan
  Date: 2018/11/10
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <title>验证码</title>
  <script type="text/javascript">
      //刷新验证码
      function changeImg(){
          document.getElementById("validateCodeImg").src="${pageContext.request.contextPath}/InputCodeCheck?"+Math.random();
      }
  </script>
</head>

<body>
<form action="${pageContext.request.contextPath}/CodeCheck" method="get">
  验证码：<input type="text" name="validateCode"/>
  <a href="javascript:void(0)" onclick="changeImg()">看不清，换一张</a>
  <br/>
  <img alt="验证码看不清，换一张" src="${pageContext.request.contextPath}/InputCodeCheck" id="validateCodeImg" onclick="changeImg()">
  <br/>
  <input type="submit" value="提交">
</form>
</body>
</html>
