package js.bmi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide you weight: ");
        double w = sc.nextDouble();
        System.out.println("Provide your height: ");
        double h = sc.nextDouble();
        sc.close();

        BMI_Calculator bm1 = new BMI_Calculator(h,w);
        System.out.println("Your BMI: " + bm1.calculate());
        System.out.println("Interpretation: " + bm1.interpret());

    }
}
