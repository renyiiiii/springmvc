<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	function findall(){
	  window.location.href="sample.do?whitchMethod=findall";
	}
	
	</script>
	
	
  </head>
  
  <body>
    This is my JSP page. <br>
    <hr>
     <form action="sample.do?whitchMethod=add" method="post">
    <table align="center">
   <tr>
      <td>name:</td>
      <td><input type="text" name="name"></td>
   </tr>
   <tr>
      <td>age:</td>
      <td><input type="text" name="age"></td>
   </tr>
   <tr>
     <td colspan="2" align="center">
     <input type="submit" value="add">
     
     </td>
   </tr>
    
   
    </table>
     </form>
     <input type="button" onclick="findall();" value="findall"">
    <hr>
         
    
    
  </body>
</html>
