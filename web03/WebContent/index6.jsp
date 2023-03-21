<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    String first = request.getParameter("first");
    String second = request.getParameter("second");
    
    //가방을 만들어서 값들을 넣고(set)!
    thingsVO bag = new thingsVO();
    bag.setFirst(first);
	bag.setSecond(second);
	
	
	//dao에게 가방을 전달하자.!
	thingsDAO dao = new thingsDAO();
	dao.update(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>