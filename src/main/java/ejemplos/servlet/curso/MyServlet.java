package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title>");
		out.println("<style>");
		out.println("body {\n" +
				"  display: flex;\n" +
				"  justify-content: center;\n" +
				"  align-items: center;\n" +
				"  min-height: 100vh;\n" +
				"  background: #eceffc;\n" +
				"}\n" +
				"\n" +
				".btn {\n" +
				"  padding: 8px 20px;\n" +
				"  border-radius: 0;\n" +
				"  overflow: hidden;\n" +
				"\n" +
				"  &::before {\n" +
				"    position: absolute;\n" +
				"    content: \"\";\n" +
				"    top: 0;\n" +
				"    left: 0;\n" +
				"    width: 100%;\n" +
				"    height: 100%;\n" +
				"    background: linear-gradient(\n" +
				"      120deg,\n" +
				"      transparent,\n" +
				"      var(--primary-color),\n" +
				"      transparent\n" +
				"    );\n" +
				"    transform: translateX(-100%);\n" +
				"    transition: 0.6s;\n" +
				"  }\n" +
				"\n" +
				"  &:hover {\n" +
				"    background: transparent;\n" +
				"    box-shadow: 0 0 20px 10px hsla(204, 70%, 53%, 0.5);\n" +
				"\n" +
				"    &::before {\n" +
				"      transform: translateX(100%);\n" +
				"    }\n" +
				"  }\n" +
				"}\n" +
				"\n" +
				".form-input-material {\n" +
				"  --input-default-border-color: white;\n" +
				"  --input-border-bottom-color: white;\n" +
				"  \n" +
				"  input {\n" +
				"    color: white;\n" +
				"  }\n" +
				"}\n" +
				"\n" +
				".login-form {\n" +
				"  display: flex;\n" +
				"  flex-direction: column;\n" +
				"  align-items: center;\n" +
				"  padding: 50px 40px;\n" +
				"  color: white;\n" +
				"  background: rgba(0, 0, 0, 0.8);\n" +
				"  border-radius: 10px;\n" +
				"  box-shadow: 0 0.4px 0.4px rgba(128, 128, 128, 0.109),\n" +
				"    0 1px 1px rgba(128, 128, 128, 0.155),\n" +
				"    0 2.1px 2.1px rgba(128, 128, 128, 0.195),\n" +
				"    0 4.4px 4.4px rgba(128, 128, 128, 0.241),\n" +
				"    0 12px 12px rgba(128, 128, 128, 0.35);\n" +
				"\n" +
				"  h1 {\n" +
				"    margin: 0 0 24px 0;\n" +
				"  }\n" +
				"\n" +
				"  .form-input-material {\n" +
				"    margin: 12px 0;\n" +
				"  }\n" +
				"\n" +
				"  .btn {\n" +
				"    width: 100%;\n" +
				"    margin: 18px 0 9px 0;\n" +
				"  }\n" +
				"}\n");
		out.println("</style>");
		out.println("</head");
		out.println("<body>");
		out.println("<h1>Ejemplo Servlet</h1>");
		out.println("<form action=\"/myServlet2\">\n" +
				"  <label for=\"fname\">Nombre:</label><br>\n" +
				"  <input type=\"text\" id=\"fname\" name=\"fname\" value=\"John\"><br>\n" +
				"  <input type=\"submit\" value=\"Submit\">\n" +
				"</form> ");
		out.println("</body></html>");
	}

}