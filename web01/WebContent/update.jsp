<%@page import="multi.MemberDAO8"%>
<%@page import="multi.MemberVO8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    String id = request.getParameter("id"); //"apple"
    String tel = request.getParameter("tel"); //"010"
    
    //가방을 만들어서 값들을 넣고(set)!
    MemberVO8 bag = new MemberVO8();
    bag.setId(id);
	bag.setTel(tel);
	
	
	//dao에게 가방을 전달하자.!
	MemberDAO8 dao = new MemberDAO8();
	dao.update(bag);
    
    
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
당신이 수정을 원하는id는 <%=id %> 
당신이 수정을 원하는 번호은 <%=tel %>입니다.
</body>
</html>