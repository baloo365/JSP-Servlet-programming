<%@page import="multi.MovieVO"%>
<%@page import="multi.MovieDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	  	
    	MovieDAO dao = new MovieDAO();
    //5,6)dao가 리턴한 BbsVO가 들어간 ArrayList를 받는다. 
    	ArrayList<MovieVO> list = dao.list();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h3>리스트 개수는 <%=list.size() %></h3>

<%if(list.size() == 0) {%>
<h3>등록된 영화가 없습니다.</h3>
<img src="img/shoes1.jpg" width=250 height="250">
<%} else{ %>

<% 
//7번
	for(MovieVO bag2: list){
%>
<% //8번 값들을 넣음. bag2.getN0() %>
당신이 검색을 원하는 ID는 <%= bag2.getId() %>  
<hr color="red">
 <table class="table table-dark table-striped">
 	<tr>
 		<td>검색한 제목</td>
 		<td><%= bag2.getTitle() %></td>
 	</tr>
 	<tr>
 		<td>검색한 내용</td>
 		<td><%= bag2.getContent() %></td>
 	</tr>
 	<tr>
 		<td>검색한 위치</td>
 		<td><%= bag2.getLocation() %></td>
 	</tr>
 	<tr>
 		<td>검색한 감독</td>
 		<td><%= bag2.getDirector() %></td>
 	</tr>
 </table>
 	<% } // for문 %>
 <% } //else%>
</body>
</html>