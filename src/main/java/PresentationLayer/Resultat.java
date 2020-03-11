package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static Util.BmiHelper.calcBMI;
import static Util.BmiHelper.getCategory;

public class Resultat extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        Double height = 0.0;
        Double weight = 0.0;
        try {
            height = Double.parseDouble(request.getParameter("height"));
            weight = Double.parseDouble(request.getParameter("weight"));
        } catch (NumberFormatException e){
            throw new LoginSampleException("Du skal indtaste et tal");
        }

        request.setAttribute("height", height);
        request.setAttribute("weight", weight);

        Double bmi = calcBMI(height, weight);
        request.setAttribute("bmi", String.format("%.2f",bmi));

        String kategori = getCategory(bmi);
        request.setAttribute("kategori", kategori);

        return "resultat";

    }
}
