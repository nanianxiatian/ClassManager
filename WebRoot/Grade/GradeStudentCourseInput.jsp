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
    
    <title>学生成绩录入界面</title>
    
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
  <h1 align="center">已选课程信息</h1><hr>
    <center><a href="studentCourse">返回上一级</a>  <a href="Grade/GradeManager.jsp">返回管理界面</a></center><br>
    <form action="scoreInput" method="post">
    <table border="1" bordercolor="#D1D1D1" align="center" cellspacing="0">
		<tr>
		<th>学号</th>
		<th>姓名</th>
		<th>性别</th>
		<th>成绩</th>
		</tr>
		
		<% int i=0; %>
		<s:iterator value="grades">
			<tr>
				<td><s:property value="student.studentId" />
				</td>
				<td><s:property value="student.studentName" />
				</td>
				<td><s:property value="student.studentSex" />
				</td>
				<td> <input type="text" name="grades1[<%=i %>].gradeNumber" value=""/>
				 <input type="hidden" name="grades1[<%=i %>].id.studentId" value='<s:property value="student.studentId" />'/>
				 <input type="hidden" name="grades1[<%=i %>].id.courseId" value='<s:property value="id.courseId" />'/>
				</td>
			</tr>
		<% i=i+1; 
		System.out.println("qwe"+i);
		%>
		</s:iterator>
		<tr>
			<td colspan="4" align="center"><br><input type="submit"  value="提交"/></td>
		</tr>
	</table>
	<hr class="hr1">
	<footer align="right">班级信息管理系统</footer>
    <s:debug></s:debug>
 </form>
  </body>
</html>
