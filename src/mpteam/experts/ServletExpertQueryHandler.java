package mpteam.experts;

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
public class ServletExpertQueryHandler extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String crop= request.getParameter("cropselector");
        String stage = request.getParameter("stage");
        String slist = request.getParameter("slist");
        String query = request.getParameter("query");
        String answer = "NA";
        AppEngineConnector.insertQueryData(name,email,crop,stage,slist,query,answer);
        RequestDispatcher requestDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/experts-page/querform.jsp");
        request.setAttribute("status","Query submitted successfully. Thank you for asking.");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendError(404);
    }
}
