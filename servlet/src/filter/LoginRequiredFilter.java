package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/GroupListServlet", filterName = "LoginRequiredFilter")
public class LoginRequiredFilter implements Filter {
    public void destroy() {
    }
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException
    {javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) req;
        if ("admin".equals(request.getSession().getAttribute("name"))) {
            chain.doFilter(req, resp);
        } else {
            request.getRequestDispatcher("loginServlet").forward(req, resp);
        }

    }
    public void init(FilterConfig config) throws ServletException {
    }
}