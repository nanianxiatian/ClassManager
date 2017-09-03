<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>登录</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/static/bootstrap/css/bootstrap.css"/>
<style type="text/css">  
        .code   
        {   
            background-image:url(code.jpg);   
            font-family:Arial;   
            font-style:italic;   
            color:Red;   
            border:0;   
            padding:2px 3px;   
            letter-spacing:3px;   
            font-weight:bolder;   
        }   
        .unchanged   
        {   
            border:0;   
        }   
    </style>

</head>
<body>
	<div class="row-fluid" style="margin-top: 200px;">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<form role="form" class="form-horizontal" action="${pageContext.request.contextPath}/admin/adminServlet?method=login"
				method="post" id="checkForm">
				<div class="form-group">
					<label class="col-md-3 control-label" for="username">用户名</label>
					<div class="col-md-9">
						<input class="form-control" name="username" type="text" id="username"
							placeholder="Username" value="" />
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-3 control-label" for="inputPassword">密码</label>
					<div class="col-md-9">
						<input type="password" name="password" class="form-control"
							id="inputPassword" placeholder="Password">
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-3 control-label" for="checkCode">验证码</label>
					<div class="col-md-4">
						<input type="text" name="codeCheck" class="form-control"
							id="codeCheck" placeholder="Code">
					</div>
					<div class="col-md-4">
						<input type="text" onclick="createCode()" readOnly="true" id="checkCode" class="unchanged" style="width: 80px"  />
					</div>
					<div class="col-md-1"></div>
					
				</div>
				<div class="form-group">
				</div>
				<div class="form-group">
					<div class="col-md-offset-3 col-md-9">
						<button type="submit" class="btn btn-primary btn-block">
							登录</button>
					</div>
				</div>
				
			</form>
		</div>
		<div class="col-md-4"></div>
	</div>
	<script src="${pageContext.request.contextPath}/static/js/jquery-1.12.1.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/static/js/jquery.validate.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/static/js/myValidate.js" type="text/javascript"></script>
	
</body>
</html>