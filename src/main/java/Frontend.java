import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Frontend extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        Map<String, Object> message = new HashMap<String, Object>();
        message.put("message", request.getMethod() );
        message.put("URL", request.getRequestURL() );

        response.getWriter().println(PageGenerator.instance().getPage("page.html", message));
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws IOException {
        Map<String, Object> message = new HashMap<String, Object>();
        message.put("message", request.getMethod() );
        message.put("URL", request.getRequestURL() );
        response.getWriter().println(PageGenerator.instance().getPage("page.html", message));
    }
}
