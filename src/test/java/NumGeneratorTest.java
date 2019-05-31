import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NumGeneratorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void transformNumberTest(){
        NumGenerator x = new NumGenerator();
        int[] inicial = x.getUserNumber();
        x.transformNumber(9180);
        int [] result = x.getUserNumber();
        assertEquals(inicial,result);
    }
    @Test
    public void transformNumberTestTwo(){
        NumGenerator num = new NumGenerator();
        int[] init=num.getUserNumber();
        num.transformNumber(2341);
        int[] result=num.getUserNumber();
        assertEquals(init,result);
    }
    @Test
    public void toArrayAleatoryNum(){
        NumGenerator num = new NumGenerator();
        int[] init=num.getUserNumber();
        num.toArrayAleatoryNum();
        int[] result=num.getUserNumber();
        assertEquals(init,result);
    }
    @Test
    public void toArrayAleatoryNumTwo(){
    }
    @Test
    public void compareNumberTest(){
        NumGenerator num = new NumGenerator();
        num.toArrayAleatoryNum();
        boolean result = num.compareNumber();
        assertEquals(false,result);
    }
}