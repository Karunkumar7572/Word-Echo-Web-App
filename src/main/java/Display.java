import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("textInput");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>You Entered:</h2>");
        out.println("<p>" + name + "</p>");
   
    }
}
