package major.listeners;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by Anurag Ambuj on 2/22/2016.
 */
public class JKSessionListener implements HttpSessionListener {
    private static int sessionCount =0;

    public static int getSessionCount()
    {
        return sessionCount;
    }

    @Override

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        //HttpSession httpSession = httpSessionEvent.getSession();
        sessionCount++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        HttpSession httpSession = httpSessionEvent.getSession();
        httpSession.removeAttribute("email");
        httpSession.removeAttribute("firstname");
        httpSession.removeAttribute("secondname");
        sessionCount--;
    }
}
