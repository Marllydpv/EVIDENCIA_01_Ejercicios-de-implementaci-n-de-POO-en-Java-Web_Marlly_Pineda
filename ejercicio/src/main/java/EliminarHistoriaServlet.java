
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EliminarHistoriaServlet extends HistoriaServlet {

    @Override
    protected void procesarRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String idHistoria = request.getParameter("id");

        
        response.sendRedirect("../webapp/eliminarHistoria.jsp");
    }
}
