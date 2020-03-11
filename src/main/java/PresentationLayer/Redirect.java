package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Redirect extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        String destination = request.getParameter("destination");

        HttpSession session = request.getSession();

        switch (destination){

            case "index":
                String role;
                if (session.getAttribute("role") != null) {
                    role = (String) session.getAttribute("role");
                    request.setAttribute("user_status", "Du er logget på: Rolle: " + role);
                } else
                {
                    request.setAttribute("user_status","Du er ikke logget på makker" );
                }
                return destination;
            case "betingelser": return destination;
            default: return "index";
        }
    }
}
