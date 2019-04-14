import by.yasevich.dao.UserDao;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/loginServlet", name="loginServlet")
public class loginServlet extends javax.servlet.http.HttpServlet {
//public boolean checkLogin (String name, String pass){
 //       return name.equalsIgnoreCase("admin");}

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


        request.setCharacterEncoding("UTF-8");
       String name=request.getParameter("name");
       String pass=request.getParameter("password");
       /* request.setAttribute("name", request.getParameter("name"));*/

        UserDao daoUser = new UserDao();

        if (daoUser.isValidUser(name,pass))
        {
            request.getSession().setAttribute("name", name);
           // request.getRequestDispatcher("/GroupListServlet").forward(request, response);

            request
                    .getRequestDispatcher("/GroupListServlet")
                    .forward(request, response);

                /*(checkLogin(name,pass)){
            request.setAttribute("group", ListService.retrieveList());
            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp")
                    .forward(request,response);*/
        }
        else
        {
            request.setAttribute("error","invalid password and/or login");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp")
                    .forward(request,response);
                    }


     /*   request.getRequestDispatcher("/WEB-INF/views/welcome.jsp")
        .forward(request,response);*/

}

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

       request.getRequestDispatcher("/WEB-INF/views/login.jsp")
               .forward(request,response);

    }
}
