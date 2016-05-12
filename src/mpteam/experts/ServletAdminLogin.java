package mpteam.experts;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Thread.sleep;

/**
 * Created by Avinash on 3/28/2016.
 */
public class ServletExpertLigin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DatastoreAdmin.insertData("Avinash","12345");
        DatastoreAdmin.insertData("Anurag","123456");
        String usernaame=request.getParameter("username");
        String password = request.getParameter("password");
        String status;
        String status1=DatastoreAdmin.ckdata(usernaame,password);

        boolean b= DatastoreAdmin.checkLogin(usernaame,password);
        if(b)
        {
            status = "Loggin Successfully!";


        }
        else
        {
            status = "Invalid Login Credentials";
        }
        RequestDispatcher rd= getServletConfig().getServletContext().getRequestDispatcher("/index.jsp");
        request.setAttribute("status",status);
        rd.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter p=response.getWriter();
        p.println("");
    }
}

