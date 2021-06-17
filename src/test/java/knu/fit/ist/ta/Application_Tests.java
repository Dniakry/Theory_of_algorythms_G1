package knu.fit.ist.ta;

import havrylenko.exam.exam_1.Calculate;
import havrylenko.exam.exam_1.Formul;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Application_Tests {

    @Test
    void contextLoads() {
    }

    @Test
    void testFormula()
    {
        assertEquals(0.1, Calculate.Calculate(2));
    }
    
    @Test
    void testFormulaWithManyArgs()
    {
        Formul fr = new Formul();
        double[] args = new double[]{0d, 2d, 4d, -2d};
        fr.SetArgs(args);
        assertEquals("[0.25, 0.1, 0.0625, -0.5]", fr.Calculate());
    }
    
    
}
