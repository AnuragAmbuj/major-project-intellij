package major.jaikisaan.services;

import major.appengine.connector.AppEngineConnector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Anurag Ambuj on 3/21/2016.
 */
public class ServletStageDataHandler extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String stage = request.getParameter("stage");
            String crop = request.getParameter("crop");
            String pest = request.getParameter("pests");
            String pesticides = request.getParameter("pesticides");
            String pdoses = request.getParameter("pdoses");
        AppEngineConnector.insertCropStageData(crop,stage,pest,pesticides,pdoses);
        RequestDispatcher requestDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/adminstagedataentry.jsp");
        request.setAttribute("status","Successfully Submitted");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("adminstagedataentry.jsp");
    }
}
