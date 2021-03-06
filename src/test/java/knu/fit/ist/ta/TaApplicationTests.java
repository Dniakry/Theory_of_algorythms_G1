package knu.fit.ist.ta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import knu.fit.ist.ta.laba_3.Lab3;
import knu.fit.ist.ta.Lab4.Lab4;
import knu.fit.ist.ta.Lab5.Lab5_2;
import knu.fit.ist.ta.Lab6_7.Lab6_7_1;

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
    @Test
    void Laba4Test()
    {
        Lab4 lab4 = new Lab4("The Nissan GT-R is a high-performance sports car "
            + "and grand tourer produced by Nissan that was unveiled in 2007");
        
        assertEquals(19, lab4.GetWordsNumber());
        assertEquals(3, lab4.GetNumberOfWordsThatContainLetters(2));
        assertEquals(14, lab4.GetNumberOfWordsThatNotContain('s'));
        assertEquals(18, lab4.GetUniqueWordsNumber());
        assertEquals("[nis=2, iss=2, ssa=2]", lab4.MostPopularSequences(3, 3));
    }
    @Test
    void Laba5Test()
    {
        Lab5_2 lab5 = new Lab5_2(20);
        lab5.InitList();
        
        assertEquals(-1, lab5.IndexOf("test"));
        lab5.SortByStringField();
        assertEquals(4, lab5.IndexOf("model #12"));
    }
    @Test
    void Laba6_7Test()
    {
        Lab6_7_1 lab6_7 = new Lab6_7_1(8);
        assertEquals("10", lab6_7.Calculate());
    }

}