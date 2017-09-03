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
    
    <title>学生信息修改页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
.hr1 {
	margin-top: 400px
}

footer {
	text-align: right
}
</style>
</head>
  
  <body>
   <h1 align="center">学生信息修改</h1>
	<hr>
	<center> <a href="studentLoad">返回上一级</a></center>
	<form action="studentUpdate" method="post">
	<table border="1" bordercolor="#D1D1D1" align="center" cellspacing="0">
  	<tr>
  		<td>学号:</td>
  		<td><input type="text" value="<s:property value="student.studentId" />" name="student.studentId" readonly="readonly"/>(学号不可修改)</td>
  	</tr>
  	<tr>
  		<td>姓名:</td>
  		<td><input type="text" value="<s:property value="student.studentName" />" name="student.studentName"/></td>
  	</tr>
  	<tr>
  		<td>性别:</td>
  		<s:if test="student.studentSex=='男'.toString()">
  		<td>
  		<input type="radio" value="男" name="student.studentSex"checked="checked">男
  		<input type="radio" value="女" name="student.studentSex" >女
  		</td>
  		</s:if>
  		<s:else>
  		<td>
  		<input type="radio" value="男" name="student.studentSex">男
  		<input type="radio" value="女" name="student.studentSex"checked="checked" >女
  		</td>
  		</s:else>
  	</tr>
  	<tr>
  		<td>生日:</td>
  		<td><input type="text" value=" <s:property value="student.studentBirthday" />"  name="student.studentBirthday"/></td>
  	</tr>
  	<tr>
  		<td>密码:</td>
  		<td><input type="text" value="<s:property value="student.studentPass" />" name="student.studentPass"/></td>
  	</tr>
  	<tr>
  		<td>电话:</td>
  		<td><input type="text" value="<s:property value="student.studentPhone" />" name="student.studentPhone"/></td>
  	</tr>
  	<tr>
  		<td>地址:</td>
  		<td><input type="text" value="<s:property value="student.studentAddress" />" name="student.studentAddress"/></td>
  	</tr>
  	<tr>
  		<td>班级:</td>
  		<td><select name="student.tclass.classId" id="tclasses">
  		<option value="<s:property value="student.tclass.classId" />" selected="selected"><s:property value="student.tclass.className" /></option>
  		</select>
  		</td>
  	</tr>
  	<tr>
  		<td colspan="2" align="center"><input type="submit" value="修改" ><input type="reset" value="取消">
  		</td>
  	</tr>
  	</table>
  </form>	
 	<hr class="hr1">
	<footer align="right">班级信息管理系统</footer>
    <s:debug></s:debug>
  <script src="jquery/jquery2.0.0.min.js"></script> 
<script type="text/javascript" src="JS/StudentUpdate.js" charset="utf-8"></script>
  </body>
</html>
