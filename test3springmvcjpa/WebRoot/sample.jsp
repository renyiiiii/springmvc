<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'sample.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript">
	function update(id){
	var idid="#"+id+"id";
	var nameid="#"+id+"name";
	var ageid="#"+id+"age";
	 var nid=$(idid).val();
	 var nname=$(nameid).val();
	 var nage=$(ageid).val();
	 window.location.href="sample.do?whitchMethod=update&id="+nid+"&name="+nname+"&age="+nage;
	}
	
	</script>

  </head>
  
  <body>
    This is my sample JSP page. <br>
    <h3 align="center">test table show <a href="index.jsp">(add)</a></h3>
    <table align="center" border="solid" style="border: 1px ;border-color: red;border-bottom-style: solid;">
    <tr><th>id</th><th>name</th><th>age</th> <th>delete</th> <th>update</th>   </tr>
    <c:if test="${testlist!=null }">
    <c:forEach items="${testlist}" var="test">
    <tr>
       <td><input id="${test.id }id" value="${test.id }"> </td>
       <td> <input id="${test.id }name" value="${test.name }"></td>   
       <td> <input id="${test.id }age" value="${test.age }"></td>
       <td><button onclick="window.location.href='sample.do?whitchMethod=delete&id=${test.id }&name=${test.name }&age=${test.age }'">delete</button></td>
       <td><button onclick="update(${test.id });">update</button></td>
    </tr>
    
    </c:forEach>
    
    </c:if>
    </table>
  </body>
</html>
