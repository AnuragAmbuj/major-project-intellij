package major.jaikisaan.services;

import major.appengine.connector.GQLResultSetFetcher;
import major.jaikisaan.datamodel.QAModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Anurag Ambuj on 4/16/2016.
 */
public class ServletSearchResult extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<QAModel> arrayList = GQLResultSetFetcher.getAllSearchedAndAnsweredQueries(request.getParameter("searchkey"));
        request.setAttribute("key",request.getParameter("searchkey"));
        request.setAttribute("searchlist",arrayList);
        RequestDispatcher requestDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/searchresult.jsp");
        requestDispatcher.forward(request,response);
    }
}
