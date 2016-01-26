package major.jaikisaan.services;

import com.google.appengine.api.datastore.Entity;
import major.appengine.connector.AppEngineConnector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Anurag Ambuj on 1/25/2016.
 */
public class ServletDataEntryHandler extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random=new Random();
        String cropname = request.getParameter("cropname");
        String pest1 = request.getParameter("pest1");
        String pest2 = request.getParameter("pest2");
        String pest3 = request.getParameter("pest3");
        String pesticide1 = request.getParameter("pesticide1");
        String pesticide2 = request.getParameter("pesticide2");
        String pesticide3 = request.getParameter("pesticide3");
        String pesticidedose1=request.getParameter("pesticidedose1");
        String pesticidedose2=request.getParameter("pesticidedose2");
        String pesticidedose3=request.getParameter("pesticidedose3");
        int cropId=Math.abs(random.nextInt());
        Entity entity=new Entity("Crops",cropId);
        entity.setProperty("cropId",cropId);
        entity.setProperty("cropname",cropname);
        entity.setProperty("pest1",pest1);
        entity.setProperty("pest2",pest2);
        entity.setProperty("pest3",pest3);
        entity.setProperty("pesticide1",pesticide1);
        entity.setProperty("pesticide2",pesticide2);
        entity.setProperty("pesticide3",pesticide3);
        entity.setProperty("pesticidedose1",pesticidedose1);
        entity.setProperty("pesticidedose2",pesticidedose2);
        entity.setProperty("pesticidedose3",pesticidedose3);
        AppEngineConnector.getDatastoreService().put(entity);
        RequestDispatcher requestDispatcher=getServletConfig().getServletContext().getRequestDispatcher("/admindataentrypoint.jsp");
        request.setAttribute("status","Successfully Updated");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("admindataentrypoint.jsp");
    }
}
