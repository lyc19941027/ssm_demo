<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>My JSP 'index.jsp' starting page</title>
</head>
<body>
<h1>---SessionID:<%=session.getId()%>---</h1>
<a href="userController/addPage">新增数据</a>
<a href="userController/getAll">查看全部数据</a>
</body>
</html>