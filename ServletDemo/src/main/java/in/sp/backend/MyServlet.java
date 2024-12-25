package in.sp.backend;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/submitForm")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // getting the data from the servlet
        String name = req.getParameter("name1");
        String email = req.getParameter("email");

        // printing onto the console
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);

        // sending data onto the page
        PrintWriter writer = resp.getWriter();
        writer.println("Name: " + name);
        writer.println("Email: " + email);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Setting a response header
        response.addHeader("Custom-Header", "This is a custom header");

        // Setting a status code
        response.setStatus(HttpServletResponse.SC_OK);

        // Adding a cookie
        Cookie userCookie = new Cookie("user", "john_doe");
        userCookie.setMaxAge(60 * 60); // 1 hour
        response.addCookie(userCookie);

        // Writing response content
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>HttpServletResponse Example</h1>");
        out.println("<p>This response demonstrates the use of HttpServletResponse methods.</p>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Example of sending a redirect
        String redirectUrl = request.getContextPath() + "/anotherpage";
        response.sendRedirect(redirectUrl);
    }
}
