<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加学生信息页面</title>
    
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
    <h1 align="center">学生信息添加</h1>
	<hr>
	<center> <a href="studentLoad">返回上一级</a></center>
	<form action="studentAdd" method="post">
	<table border="1" bordercolor="#D1D1D1" align="center" cellspacing="0">
  	<tr>
  		<td>学号:</td>
  		<td><input type="text" value="" name="student.studentId"placeholder="学号"></td>
  	</tr>
  	<tr>
  		<td>姓名:</td>
  		<td><input type="text" value="" name="student.studentName"placeholder="姓名"></td>
  	</tr>
  	<tr>
  		<td>性别:</td>
  		<td><input type="radio" value="男" name="student.studentSex"checked="checked">男
  		<input type="radio" value="女" name="student.studentSex" >女</td>
  	</tr>
  	<tr>
  		<td>生日:</td>
  		<td><input type="date" value="" name="student.studentBirthday"placeholder="生日（年/月/日）"></td>
  	</tr>
  	<tr>
  		<td>密码:</td>
  		<td><input type="password" value="" name="student.studentPass"placeholder="密码"></td>
  	</tr>
  	<tr>
  		<td>电话:</td>
  		<td><input type="text" value="" name="student.studentPhone"placeholder="电话"></td>
  	</tr>
  	<tr>
  		<td>地址:</td>
  		<td><input type="text" value="" name="student.studentAddress"placeholder="地址"></td>
  	</tr>
  	<tr>
  		<td>班级名称:</td>
  		<td><select name="student.tclass.classId" id="tclasses">
  		</select></td>
  	</tr>
  	<tr>
  		<td colspan="2" align="center"><input type="submit" value="添加" ><input type="reset" value="取消">
  		</td>
  	</tr>
  	</table>
  </form>	
 <script src="jquery/jquery2.0.0.min.js"></script> 
<script type="text/javascript" src="JS/StudentAdd.js" charset="utf-8"></script>
  </body>
</html>
