<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>选课界面</title>
    
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
		margin-top:250px
	}
	footer{
		text-align: right
	}
</style>
<script src="jquery/jquery2.0.0.min.js"></script> 
  </head>
  
  <body>
    <h1 align="center">学生进行选课</h1>
	<hr>
	<center> <a href="Grade/GradeManager.jsp">返回上一级</a></center>
	<center>学生学号（要选课的）：<input type="text" id="studentId" value=""/></center><br>
	
	<table border="1" bordercolor="#D1D1D1" align="center" cellspacing="0">
		<tr>
		<th>课程编号</th>
		<th>课程名称</th>
		<th>课程性质</th>
		<th>学分</th>
		<th>选课</th>
		</tr>
		<s:iterator value="courses">
		<tr>
			<td><s:property value="courseId" /></td>
			<td><s:property value="courseName" /></td>
			<td><s:property value="courseProperty" /></td>
			<td><s:property value="courseScore" /></td>
			<td><a href="JavaScript:;" onclick="location ='studentChooseCourse?grade.id.studentId=' + document.getElementById('studentId').value+'&&grade.id.courseId=<s:property value="courseId"/>';">选课</a></td>
		</tr>
		</s:iterator>
	</table>
	<hr class="hr1">
	<footer align="right">班级信息管理系统</footer>
	<s:debug></s:debug>
  </body>
</html>
