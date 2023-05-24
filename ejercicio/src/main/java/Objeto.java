import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Objeto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String url = req.getParameter("url");
      System.out.println(url);

      switch (url) {
          case "instagram":
              RequestDispatcher ins =req.getRequestDispatcher("insta.jsp");
              ins.forward(req, resp);
          break;
        case "facebook":
            RequestDispatcher fac =req.getRequestDispatcher("face.jsp");
            fac.forward(req, resp);
              break;
        case "servicios":
            RequestDispatcher ser =req.getRequestDispatcher("servicios.jsp");
            ser.forward(req, resp);
        break;
        case "contactenos":
        RequestDispatcher con =req.getRequestDispatcher("contactenos.jsp");
        con.forward(req, resp);
      break;
      case "cerrar":
      RequestDispatcher ce =req.getRequestDispatcher("index.jsp");
      ce.forward(req, resp);
  break;
        case "redflex":
        RequestDispatcher re =req.getRequestDispatcher("index.jsp");
        re.forward(req, resp);
    break;
    case "agregarh1":
    RequestDispatcher ah1 =req.getRequestDispatcher("Agregar_Historias.jsp");
    ah1.forward(req, resp);
break;
case "agregara1":
RequestDispatcher a1 =req.getRequestDispatcher("Agregar_Amigos.jsp");
a1.forward(req, resp);
break;
case "chatear1":
RequestDispatcher c1 =req.getRequestDispatcher("chatear.jsp");
c1.forward(req, resp);
break;
case "agregarh2":
RequestDispatcher ah2 =req.getRequestDispatcher("Agregar_Historias2.jsp");
ah2.forward(req, resp);
break;
case "agregara2":
RequestDispatcher a2 =req.getRequestDispatcher("Agregar_Amigos2.jsp");
a2.forward(req, resp);
break;
case "chatear2":
RequestDispatcher c2 =req.getRequestDispatcher("chatear2.jsp");
c2.forward(req, resp);
break;
case "cuenta":
RequestDispatcher cu2 =req.getRequestDispatcher("menu.jsp");
cu2.forward(req, resp);
break;
case "cuenta2":
RequestDispatcher cl2 =req.getRequestDispatcher("menu2.jsp");
cl2.forward(req, resp);
break;
case "crear1":
RequestDispatcher cr1 =req.getRequestDispatcher("crear_cuenta.jsp");
cr1.forward(req, resp);
break;
case "crear2":
RequestDispatcher cr2 =req.getRequestDispatcher("crear_cuenta2.jsp");
cr2.forward(req, resp);
break;
    
    
      }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPost(req, resp);
    }

}
