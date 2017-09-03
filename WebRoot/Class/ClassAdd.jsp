<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加班级页面</title>
    
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
  <h1 align="center">班级信息添加</h1>
	<hr>
	<center> <a href="classLoad">返回上一级</a></center>
	<form action="classAdd" method="post">
	<table border="1" bordercolor="#D1D1D1" align="center" cellspacing="0">
  	<tr>
  		<td>班级编号:</td>
  		<td><input type="text" value="" name="tclass.classId"placeholder="班级编号"></td>
  	</tr>
  	<tr>
  		<td>班级名称:</td>
  		<td><input type="text" value="" name="tclass.className"placeholder="班级名称"></td>
  	</tr>
  	<tr>
  		<td colspan="2" align="center"><input type="submit" value="添加" ><input type="reset" value="取消">
  		</td>
  	</tr>
  	</table>
  </form>	
  </body>
</html>
