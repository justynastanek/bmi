package js.bmi;

public class BMI_Calculator implements Calculator<Double> {

    private double height;
    private double weight;

    public BMI_Calculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Double calculate() {
        return weight/(Math.pow(height/100,2));
    }

    public String interpret() {

        if(this.calculate() < 18.5){
            return "underweight";
        }else if(this.calculate() >= 18.5 && this.calculate() <= 24.99){
            return "normal";
        }

        return "overweight";
    }

}
