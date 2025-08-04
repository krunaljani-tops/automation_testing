package selenium.selenium.demo.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class SampleTest {
	 
	@Test
	void additionTest() {
	        //assertEquals(2, 1 + 1);
		System.out.println("hello");
	    }
	 @Test
	    void testAssertions() {
	       assertEquals(4, 2 + 2);
	        assertTrue("hello".startsWith("h"));
	        assertFalse("hello".isEmpty());
	        assertNotNull("hello");
	    }

	    @Test
	    void testException() {
	        Exception exception = assertThrows(ArithmeticException.class, () -> {
	            int x = 1 / 0;
	        });
	        assertEquals("/ by zero", exception.getMessage());
	    }
}
