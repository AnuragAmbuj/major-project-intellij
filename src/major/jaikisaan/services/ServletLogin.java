package major.jaikisaan.services;

import major.appengine.connector.GQLResultSetFetcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Anurag Ambuj on 1/24/2016.
 */
public class ServletLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        GQLResultSetFetcher gqlResultSetFetcher = new GQLResultSetFetcher();
        if (gqlResultSetFetcher.validateUserRegistration(email, password)) {
            request.setAttribute("email", email);
            String firstname = gqlResultSetFetcher.getFirstNameFromEmail(email);
            String secondname = gqlResultSetFetcher.getLastNameFromEmail(email);
            request.setAttribute("firstname", firstname);
            request.setAttribute("secondname", secondname);
            HttpSession httpSession = request.getSession(true);
            Date createTime = new Date(httpSession.getCreationTime());
            Date lastAccessTime = new Date(httpSession.getLastAccessedTime());
            //Tracking Session Attributes
            httpSession.setAttribute("email", email);
            httpSession.setAttribute("firstname", firstname);
            httpSession.setAttribute("secondname", secondname);
            System.out.println(httpSession.getAttribute("email"));

            RequestDispatcher requestDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/dashboard.jsp");
            requestDispatcher.forward(request, response);
        } else {

            request.setAttribute("status", "Invalid Login");
            RequestDispatcher requestDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/login.jsp");
            requestDispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
