package mpteam.experts;

import major.appengine.connector.GQLResultSetFetcher;
import major.jaikisaan.datamodel.QAModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Anurag Ambuj on 4/21/2016.
 */
public class ServletMultipleAnswerHandler extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query=request.getParameter("query");
        String answer = request.getParameter("multipleanswer");
        System.out.println(query+":"+answer);
        if(answer !=null) {
            if(!answer.trim().equals(" ")) {
                System.out.println("Servlet Set Answer to Query working");
                QAModel.setAnswersToAQuery(query, answer);
            }
        }
        RequestDispatcher requestDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/answeredqueries.jsp");
        requestDispatcher.forward(request,response);
    }
}
