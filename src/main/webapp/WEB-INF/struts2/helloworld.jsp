<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!-- taglib指令告诉Servlet容器该页面将使用Struts 2标记，并且这些标记前面会有一个s。 -->
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>sturst2 view,controller,model</title>
</head>
<body>
<!-- 注意 注释中不能 写标签符号,它不会被忽略!!!  -->
<!-- 	s:property 标签显示 value 返回的值, -->
<!-- 	value 调用HelloworldAction 控制器类 中的getMessageStore方法. -->
<!-- 		这个方法返回 MessageStore 存储类.-->
<!-- 		然后通过  .message  返回messageStore 中的 message值..-->
<!-- 		以上,都是让Sturst2 框架来调用 MessageStore 类的 getMessage 方法,这个方法返回的是String.-->
<!-- 		这个String 就是 s:property 展示的内容  -->

	<h2><s:property value="messageStore.message" /></h2>
</body>
</html>