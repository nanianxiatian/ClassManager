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
    
    <title>选课成功界面</title>
    
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
</style>
  </head>
  
  <body>
      <h1 align="center">选课成功界面</h1>
     <hr>
     <center>
       恭喜<s:property value="grade.id.studentId"/>，选择<s:property value="grade.id.courseId"/>课程成功！<br>
       <a href="courseChoose">返回继续选课</a> <br>
       <a href="checkSelectCousrse?studentId=<s:property value="grade.id.studentId"/>">查看已选课程</a><br>
       <a href="Grade/GradeManager.jsp">返回管理界面</a><br>
      </center>
      <hr class="hr1">
    <footer align="right">班级信息管理系统</footer>
    <s:debug></s:debug>
  </body>
</html>
