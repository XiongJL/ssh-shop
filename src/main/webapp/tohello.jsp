<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通过超链接来跳转到helloworld</title>
</head>
<body>
			<h1>当用户点击超链接时,就告诉了Struts2框架运行HelloworldAction类的execute方法并渲染
			HelloWorld.jsp
			</h1>
			<!-- 此处 action='hello' 名字 和strust.xml中的 action  name="hello"需要一致 -->
			<p><a href="<s:url action='hello'/>">Hello World</a></p>
</body>
</html>