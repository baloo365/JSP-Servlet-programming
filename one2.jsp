<%@page import="multi.bbsVO3"%>
<%@page import="multi.bbsDAO3"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    	// Car car = new Car();
    	//HttpServletRequest request = new HttpServletRequest(); 
    	//car.run();
    	String no = request.getParameter("no"); //String, "100" 
    	String title = request.getParameter("title"); //String, "100" 
    	String content = request.getParameter("content"); //String, "100" 
    	String writer = request.getParameter("writer"); //String, "100" 
    	
    	bbsDAO3 dao = new bbsDAO3();
    	bbsVO3 bag2 = dao.one(Integer.parseInt(no));
    	//JSP안에 만들어진 변수는 서버의 RAM에 저장되는 지역변수!
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
검색한 제목: <%= bag2.getTitle() %><br>
검색한 내용: <%= bag2.getContent() %><br>
검색한 글쓴이: <%= bag2.getWriter() %><br>
</body>
</html>