<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>gradle-webapp</title>
</head>
<body>

<jsp:useBean id="dbInfo" class="cn.home.modules.beans.entity.DbInfo"/>

<h3>数据库配置</h3>
	环境：${dbInfo.env},
	用户名：${dbInfo.username},
	密码：${dbInfo.password},
	驱动名：${dbInfo.driverClassName},
	URL：${dbInfo.url}
</body>
</html>