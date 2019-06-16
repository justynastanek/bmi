package js.bmi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Double w = null;
            Double h = null;

            Scanner sc = new Scanner(System.in);

            while(w==null){
                try {
                    System.out.println("Provide your weight [in kg]: ");
                    w = sc.nextDouble();
                    sc.nextLine();
                } catch(InputMismatchException ex){
                    System.out.println("Provided value is incorrect.");
                    sc.nextLine();
                }
            }
            while(h==null){
                try{
                    System.out.println("Provide your height [in cm]: ");
                    h = sc.nextDouble();
                    sc.nextLine();
                }catch(InputMismatchException ex){
                    System.out.println("Provided value is incorrect.");
                    sc.nextLine();}
            }

                sc.close();

                BMI_Calculator bm1 = new BMI_Calculator(h, w);
                System.out.println("Your BMI: " + bm1.calculate());
                System.out.println("Interpretation: " + bm1.interpret());

    }
}
