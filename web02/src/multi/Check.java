package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check.do")
public class Check extends HttpServlet {

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String today = request.getParameter("today");
		String result = "그냥 있자";
		if (today.equals("맑음")) {
			result = "나가자";
		} else if (today.equals("흐림")) {
			result = "코딩";
		} else {
			result = "쇼핑";
		}
		response.setContentType("text/html;charset=utf-8"); //contenttype은 out 만들기 전에 설정
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String pass = request.getParameter("pass");
		
		if (pass.equals("나는 왕이다")) {
			out.print("들어오세요 <img src='shoes1.jpg'>");
		} else {
			out.print("들어올 수 없습니다 <img src='shoes2.jpg'>");
		}
		out.close();
	}

}
