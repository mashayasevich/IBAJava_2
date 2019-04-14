/*package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;

@WebFilter(urlPatterns = "/GroupListServlet", filterName = "LogFilter")
public class LogFilter implements Filter {
    public void destroy() {
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("LogFilter init");
    }
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) req;
        String servletPath=((HttpServletRequest) req).getServletPath();
        System.out.println ("#info"+new Date() +"-ServletPath:"+servletPath+" , url= "+((HttpServletRequest) req).getRequestURI());

        chain.doFilter(req, resp);

    }
}
*/
