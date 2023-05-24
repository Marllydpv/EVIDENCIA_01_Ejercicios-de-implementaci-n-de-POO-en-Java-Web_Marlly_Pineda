import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AgregarHistoriaServlet extends HistoriaServlet {

    @Override
    protected void procesarRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String titulo = request.getParameter("titulo");
        String contenido = request.getParameter("contenido");

       
        response.sendRedirect("../webapp/agregarHistoria.jsp");
    }
}
