package pl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Start") // w przeglądarce /start uruchomi serwlet
public class Servlet extends HttpServlet {

    public Servlet(){
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // tworzenie HTML-a
        response.getWriter().append("<html>");
        response.getWriter().append("<body>");
        response.getWriter().append("<form>");
        response.getWriter().append("<label for=\"email\">email:</label>");
        response.getWriter().append("<input type=\"email\" name=\"email\" >");
        response.getWriter().append("<input type=\"submit\" name=\"submit\" value=\"Prześlij!\">");
        response.getWriter().append("</form>");
        response.getWriter().append("</body>");
        response.getWriter().append("</html>");
        response.getWriter().append("<html>");

    }
}
