package Util;


/**
 * Hjælpefunktioner til BMI web
 */
public class BmiHelper {

    /**
     *
     * @param height in cm
     * @param weight in kg
     * @return bmi calculated
     * @author jon
     */
    public static Double calcBMI(Double height, Double weight){
        return weight / (height * height) * 100 * 100;
    }

    /**
     *
     * @param bmi value
     * @return A bmi category text
     */
    public static String getCategory(Double bmi){
        if (bmi > 30){
            return "Svært overvægtig";
        } else if (bmi < 18.5) {
            return "Undervægtig";
        } else if (bmi < 25.0) {
            return "Normalvægtig";
        } else {
            return "Overvægtig";
        }
    }
}
