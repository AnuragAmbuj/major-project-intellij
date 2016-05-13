package mpteam.experts;

import major.jaikisaan.datamodel.QAModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Anurag Ambuj on 4/16/2016.
 */
public class ServletQueryAnswerSubmitter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String query = request.getParameter("query");
        String answer = request.getParameter("answer");
        System.out.println(query+answer);
        QAModel.setAnswerToAQuery(query, answer);
        request.setAttribute("status", "Answer Submitted");
        RequestDispatcher requestDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/experts-page/queslist.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query = request.getParameter("query");
        String answer = request.getParameter("answer");
        QAModel.setAnswerToAQuery(query, answer);
        request.setAttribute("status", "Answer Submitted");
        RequestDispatcher requestDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/experts-page/queslist.jsp");
        requestDispatcher.forward(request, response);
    }
}
