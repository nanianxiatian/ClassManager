<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录成功界面</title>
    
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
		font-size: 6;
		font-family: 仿宋
		
	}
</style>
  </head>
  
  <body>
     <h1 align="center">信息管理界面</h1>
   	 <div class="a1"><a href="Login.jsp"  onclick="exit_confirm()" style='text-decoration:none;'>退出系统</a></div>  
     <hr>
     <table align="center">
     <tr><td><a href="classLoad">班级信息管理</a></td></tr>
     <tr><td><a href="studentLoad">学生信息管理</a></td></tr>
     <tr><td><a href="courseLoad">课程信息管理</a></td></tr>
     <tr><td><a href="Grade/GradeManager.jsp">学生成绩录入</a></td></tr>
     <tr align="center"><td><a href="Statistics/InfoStatistics.jsp">信息统计</a></td></tr>
     </table>
      <hr class="hr1">
    <footer align="right">班级信息管理系统</footer>
    <script type="text/javascript">
    function exit_confirm() {
			var k = window.confirm("你确定要退出系统吗");
			if (k) {
				event.returnValue = true;
			} else {
				event.returnValue = false;
			}
		}
    </script>
  </body>
</html>
