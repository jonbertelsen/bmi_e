package Util;

public class BmiHelper {

    public static Double calcBMI(Double height, Double weight){
        return weight / (height * height) * 100 * 100;
    }

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
