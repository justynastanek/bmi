package js.bmi;

import java.util.Arrays;

public class BMI_Calculator implements Calculator<Double> {

    private double height;
    private double weight;

    private static final String[] bmi_interpretations = {"Very severely underweight",
    "Severely underweight", "Underweight", "Normal", "Overweight", "Moderately obese",
    "Severely obese", "Very severely obese", "Morbidly Obese", "Super Obese", "Hyper Obese"};

    private static final double[] bmi_borders = {15, 16, 18.5, 25, 30, 35, 40,
    45, 50, 60, Double.POSITIVE_INFINITY};

    public BMI_Calculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Double calculate() {
        return weight/(Math.pow(height/100,2));
    }

    public String interpret() {

        int temp = Arrays.binarySearch(bmi_borders, this.calculate());

        if(temp >= 0 ){

            return bmi_interpretations[temp];

        }else{

        return bmi_interpretations[Math.abs(temp)-1];
                }
    }

}
