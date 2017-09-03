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
    
    <title>查看课程的页面</title>
    
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
   
    <h1 align="center">已选课程信息</h1><hr>
    <center><a href="courseChoose">返回继续选课</a>  <a href="Grade/GradeManager.jsp">返回管理界面</a></center><br>
    <table border="1" bordercolor="#D1D1D1" align="center" cellspacing="0">
		<tr>
		<th>课程编号</th>
		<th>课程名称</th>
		<th>课程性质</th>
		<th>学分</th>
		</tr>
		<s:iterator value="grades">
			<tr>
				<td><s:property value="course.courseId" />
				</td>
				<td><s:property value="course.courseName" />
				</td>
				<td><s:property value="course.courseProperty" />
				</td>
				<td><s:property value="course.courseScore" />
				</td>
			</tr>
		</s:iterator>
	</table>
	<hr class="hr1">
	<footer align="right">班级信息管理系统</footer>
    <s:debug></s:debug>
  </body>
</html>
