package pl;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "/InitFilter", urlPatterns = {"/Start"})
public class InitFilter implements Filter {
    public void destroy() {
        System.out.println("Destroy filter");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(request, response);
        if (request != null){
            if (request.getParameterMap().containsKey("email") && !request.getParameter("email").isEmpty()) {
                ((HttpServletRequest) request).getSession().setAttribute("email", request.getParameter("email"));
                ((HttpServletResponse) response).sendRedirect(((HttpServletRequest) request).getContextPath() + "/InfoServlet");
            }
        }
        chain.doFilter(request, response);
    }
        } //if1
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
