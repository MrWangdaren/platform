<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户登录</title>
</head>
<body>
	<form action="/platform/sys/login.do" method="post">
		用户：<input type="text" name="username" />
		密码：<input type="text" name="password" />
		<input type="submit" value="提交" />
	</form>
</body>
</html>