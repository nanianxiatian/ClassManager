<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>统计选项</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	table{
		margin-top:100px 
	}
	.hr1{
		margin-top:250px
	}
	footer{
		text-align: right
	}
	.a1{
		text-align: right ;
		font-family: 仿宋
		
	}
</style>
  </head>
  
  <body>
     <h1 align="center">选择统计选项</h1>  <div class="a1"><a href="Manager/LoginSuccess.jsp"  style='text-decoration:none;'>返回上一级</a></div>  
     <hr>
     <table align="center">
     <tr><td><a href="Statistics/StudentStatistics.jsp">学生信息统计</a></td></tr>
     <tr><td><a href="Statistics/CourseStatistics.jsp">课程信息统计</a></td></tr>
     </table>
      <hr class="hr1">
    <footer align="right">班级信息管理系统</footer>
 
  </body>
</html>
