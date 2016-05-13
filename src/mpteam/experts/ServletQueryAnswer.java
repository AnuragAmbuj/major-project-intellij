package mpteam.experts;

import com.google.appengine.api.datastore.Entity;
import major.appengine.connector.GQLResultSetFetcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Anurag Ambuj on 4/16/2016.
 */
public class ServletQueryAnswer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query=request.getParameter("query");
        Entity entity = GQLResultSetFetcher.getEntityFromQuery(query);
        request.setAttribute("entity",entity);
        RequestDispatcher rd=getServletConfig().getServletContext().getRequestDispatcher("/experts-page/answerform.jsp");
        rd.forward(request,response);
    }
}
