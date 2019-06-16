package js.bmi;

public class BMI_Calculator implements Calculator<Double> {

    private double height;
    private double weight;

    public BMI_Calculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Double calculate() {
        return weight/(Math.pow(height,2));
    }

    public String interpret() {
        return null;
    }

}
