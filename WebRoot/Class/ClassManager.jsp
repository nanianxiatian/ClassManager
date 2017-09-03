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
    
    <title>班级信息管理界面</title>
    
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
	<h1 align="center">班级信息管理</h1>
	<hr>
	<center><a href="Class/ClassAdd.jsp">添加班级</a>  <a href="Manager/LoginSuccess.jsp">返回上一级</a></center>
	<table border="1" bordercolor="#D1D1D1" align="center" cellspacing="0">
		<tr>
		<th>班级id</th>
		<th>班级名称</th>
		<th>编辑</th>
		</tr>
		<s:iterator value="tclasses">
		<tr>
			<td><s:property value="classId" /></td>
			<td><s:property value="className" /></td>
			<td><a href="classDelete?classId=<s:property value="classId" />" onclick="delete_confirm();">删除</a> <a href="classUpdateload?classId=<s:property value="classId" />">修改</a></td>
		</tr>
		</s:iterator>
	</table>
	<hr class="hr1">
	<footer align="right">班级信息管理系统</footer>
	<s:debug></s:debug>

	<script language="JavaScript">
		function delete_confirm() {
			var k = window.confirm("你确定要删除该记录");
			if (k) {
				event.returnValue = true;
			} else {
				event.returnValue = false;
			}
		}
	</script>

</body>
</html>
