package js.bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMI_Calculator_Test {

    private static final double DELTA = 1E-02;

    @Test
    public void test_underweight_bmi() {
        BMI_Calculator bm1 = new BMI_Calculator(180, 40);
        assertEquals(12.34, bm1.calculate(), DELTA);
        assertEquals("underweight", bm1.interpret());
    }

    @Test
    public void test_normal_bmi() {
        BMI_Calculator bm1 = new BMI_Calculator(180, 70);
        assertEquals(21.6, bm1.calculate(), DELTA);
        assertEquals("normal", bm1.interpret());
    }

    @Test
    public void test_obesity_bmi() {
        BMI_Calculator bm1 = new BMI_Calculator(180, 100);
        assertEquals(30.86, bm1.calculate(), DELTA);
        assertEquals("overweight", bm1.interpret());
    }
}
