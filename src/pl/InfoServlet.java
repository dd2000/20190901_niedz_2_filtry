package pl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InfoServlet")
public class InfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // gdy nie ma obiektu sesji "email" przekieruj na "/Start", w przeciwnym wyp wydrukuj
        if (request.getSession(true).getAttribute("email")==null){
            response.sendRedirect(request.getContextPath() + "/Start");
        }

        response.getWriter().append("<html><strong>"+ request.getSession(true).getAttribute("email") + "</strong></html>");
    }
}
