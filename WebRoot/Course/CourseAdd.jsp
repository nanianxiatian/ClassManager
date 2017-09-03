<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>课程信息添加</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 <style type="text/css">
	.hr1{
		margin-top:400px
	}
	footer{
		text-align: right
	}
</style>
  </head>
  <body>
  <h1 align="center">课程信息添加</h1>
	<hr>
	<center> <a href="courseLoad">返回上一级</a></center>
	<form action="courseAdd" method="post">
	<table border="1" bordercolor="#D1D1D1" align="center" cellspacing="0">
  	<tr>
  		<td>课程编号:</td>
  		<td><input type="text" value="" name="course.courseId"placeholder="课程编号"></td>
  	</tr>
  	<tr>
  		<td>课程名称:</td>
  		<td><input type="text" value="" name="course.courseName"placeholder="课程名称"></td>
  	</tr>
  	<tr>
  		<td>课程性质:</td>
  		<td><input type="text" value="" name="course.courseProperty"placeholder="课程性质"></td>
  	</tr>
  	<tr>
  		<td>学分:</td>
  		<td><input type="text" value="" name="course.courseScore"placeholder="学分"></td>
  	</tr>
  	<tr>
  		<td colspan="2" align="center"><input type="submit" value="添加" ><input type="reset" value="取消">
  		</td>
  	</tr>
  	</table>
  </form>	
  </body>
</html>
