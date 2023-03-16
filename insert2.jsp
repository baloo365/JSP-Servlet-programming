<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. 전달된 값 받아주세요. -->
    <!-- 2. dao에게 값 전달.(DAO이용) 생략-->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요. -->
    <% //스크립트릿
    //자바코드 넣는 부분!!
    //HttpServletRequest request = new HttpServletRequest();
    //tomcat은 미리 request를 만들어서 내장시켜놨어요!
    String no = request.getParameter("no"); //"apple"
    String title = request.getParameter("title"); //"1234"
    String name = request.getParameter("name"); //"apple"
    String content = request.getParameter("content"); //"010"
    %>
    <!-- 3. 브라우저에게 결과를 알려주기 위한 html 코드가 미리 들어가있음. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	background: lime;
}

</style>
</head>
<body>
게시물 요청되었음.
<hr color="red">
작성한 no : <%= no %> <br>
작성한 title : <%= title %> <br>
작성한 name : <%= name %> <br>
작성한 content : <%= content %> <br>
</body>
</html>