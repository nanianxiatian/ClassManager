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
    
    <title>课程信息统计界面</title>
    
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
		margin-top:10px;
		border-bottom-color: #D1D1D1 ;
		text-align: center 
	}
	.hr1{
		margin-top:350px
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
   <h1 align="center">课程信息统计</h1>  <div class="a1"><a href="Statistics/InfoStatistics.jsp"  style='text-decoration:none;'>返回上一级</a></div>  
     <hr>
    <center> 课程号：<input type="text" name="" id ="CourseId"value="" /><input type="button" value="查询" onclick="CourseInfoQuery();"/></center>
     <table border ='1' cellspacing = '0' align="center" id="gradeInfo">
		<thead>
			<tr>
				<th>课程编号</th>
				<th>课程名称</th>
				<th>最高分</th>
				<th>最低分</th>
				<th>平均分</th>
			</tr>
		</thead>
		<tbody></tbody>
	</table>
      <hr class="hr1">
    <footer align="right">班级信息管理系统</footer>
    <script src="jquery/jquery2.0.0.min.js"></script> 
<script type="text/javascript" src="JS/CourseQuery.js" charset="gbk"></script>
  </body>
</html>
