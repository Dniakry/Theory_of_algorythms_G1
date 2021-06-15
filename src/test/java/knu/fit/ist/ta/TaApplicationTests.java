package knu.fit.ist.ta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import knu.fit.ist.ta.laba_3.Lab3;


@SpringBootTest
class TaApplicationTests {

	@Test
	void contextLoads() {
	}
        
        @Test
        void test1(){
        
        assertEquals(0.02f, 0.025f, 0.01f);
        }

        @Test
    void Laba3Test()
    {
        Lab3 lab3 = new Lab3(-5);
        assertEquals(20, lab3.GetArrayLength());
        lab3 = new Lab3(10);
        lab3.InitArray();
        assertEquals(10, lab3.GetArrayLength());
    }
}
