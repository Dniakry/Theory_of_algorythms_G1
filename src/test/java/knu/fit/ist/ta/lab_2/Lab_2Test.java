/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab_2;

/**
 *
 * @author Юра
 */
import static java.lang.Math.log;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Lab_2Test {

    @Test
    void test1() {
        EquationSample equationSample = new EquationSample();
        assertEquals(Integer.MAX_VALUE, equationSample.solve(0));
        assertEquals((log(5)/(6*(5*5)+2*5-5)),equationSample.solve(5),0.001f);
    }
}
