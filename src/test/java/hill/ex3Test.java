import org.junit.Test;
import static org.junit.Assert.*;

import hill.ex3;

public class ex3Test {

    @Test
    public void testTriangle0() {
	assertEquals(ex3.triangle(0), 0);
    }

    
    @Test
    public void testTriangle1() {
	assertEquals(ex3.triangle(1), 1);
    }

    @Test
    public void testTriangle12() {
	assertEquals(ex3.triangle(12), 78);
    }


    @Test
    public void testLazy0() {
	assertEquals(ex3.lazy(0), 1);
    }

    
    @Test
    public void testLazy1() {
	assertEquals(ex3.lazy(1), 2);
    }

    @Test
    public void testLazy12() {
	assertEquals(ex3.lazy(12), 79);
    }

    
    
}
