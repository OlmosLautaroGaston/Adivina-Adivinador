import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumGeneratorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void NumGeneratorTest(){
        NumGenerator x = new NumGenerator();
        int[] inicial = x.getUserNumber();
        x.transformNumber(1290);
        int [] result = x.getUserNumber();
        assertEquals(inicial,result);
    }
    @Test
    public void compareNumberTest(){
        NumGenerator numG = new NumGenerator();
        int [] arr= new int[4];
        numG.setUserNumber(arr);


    }
}