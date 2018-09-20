<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
  <body>
    This is my JSP page. <br><br>
    
    <s:iterator value="list" var="current">
    	<li><s:property value="current"/></li>
    </s:iterator>
    
  </body>
</html>