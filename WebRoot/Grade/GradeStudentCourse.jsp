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
    
    <title>My JSP 'GradeStudentCourse.jsp' starting page</title>
    
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
     <h1 align="center">按课程进行成绩录入</h1>
	<hr>
	<center><a href="Grade/GradeManager.jsp">返回上一级</a></center>
	<table border="1" bordercolor="#D1D1D1" align="center" cellspacing="0">
		<tr>
		<th>课程编号</th>
		<th>课程名称</th>
		<th>课程性质</th>
		<th>学分</th>
		<th>录入成绩</th>
		</tr>
		<s:iterator value="courses">
		<tr>
			<td><s:property value="courseId" /></td>
			<td><s:property value="courseName" /></td>
			<td><s:property value="courseProperty" /></td>
			<td><s:property value="courseScore" /></td>
			<td><a href="studentGradeInput?courseId=<s:property value="courseId" />">录入</a></td>
		</tr>
		</s:iterator>
	</table>
	<hr class="hr1">
	<footer align="right">班级信息管理系统</footer>
	<s:debug></s:debug>
  </body>
</html>
