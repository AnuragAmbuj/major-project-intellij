package major.jaikisaan.services;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Anurag Ambuj on 1/24/2016.
 */
public class ServletJKReg extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("This is being printed");
        boolean flag = true;
        String firstname = request.getParameter("firstname");
        System.out.println("THE REQUIRED:" + firstname + "");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmpass = request.getParameter("confpassword");
        String cropselector = request.getParameter("cropselector");
        String date = request.getParameter("date");
        String location = request.getParameter("slist");
        System.out.println(email);
        String statusmessage=new String();
        if (firstname.trim().equals("") || lastname.trim().equals("") || email.trim().equals("") || password.trim().equals("") || confirmpass.trim().equals("") || cropselector.trim().equals("none") || date.trim().equals("") || location.trim().equals("none"))
        {
            flag = false;
            statusmessage="Fields are empty";
        }
        if(!password.equals(confirmpass))
        {
            flag=false;
            statusmessage="Passwords do not match";
        }
        if (flag == true) {
            Random random = new Random();
            long genRandomKey = Math.abs(random.nextLong());
            Entity entity = new Entity("User", genRandomKey);
            entity.setProperty("UserID", genRandomKey);
            entity.setProperty("firstname", firstname);
            entity.setProperty("lastname", lastname);
            entity.setProperty("email",email);
            entity.setProperty("password", password);
            entity.setProperty("cropselector", cropselector);
            entity.setProperty("date", date);
            entity.setProperty("location", location);
            DatastoreService datastoreService = DatastoreServiceFactory.getDatastoreService();
            datastoreService.put(entity);
            statusmessage="Registered Successfully";
            request.setAttribute("status", statusmessage);
            RequestDispatcher dispatcher=getServletConfig().getServletContext().getRequestDispatcher("/register.jsp");
            dispatcher.forward(request,response);
        } else {
            request.setAttribute("status", statusmessage);
            RequestDispatcher dispatcher=getServletConfig().getServletContext().getRequestDispatcher("/register.jsp");
            dispatcher.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                //response.sendRedirect("login.jsp");
    }
}
