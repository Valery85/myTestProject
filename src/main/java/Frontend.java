import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Frontend extends HttpServlet {
    private String login = "";

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        System.out.println("MyServlet is opened");  // print in console
        response.getWriter().println("MyServlet say to you Hello!");    //print on the page
        response.getWriter().println("You typed such name =" + request.getParameter("name")+ "\n" +
                                    "URL : " + request.getRequestURL());


    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response){

    }
}
