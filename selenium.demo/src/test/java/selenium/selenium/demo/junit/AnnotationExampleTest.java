package selenium.selenium.demo.junit;
import org.junit.jupiter.api.*;

public class AnnotationExampleTest {

    @BeforeAll
    static void initAll() {
        System.out.println("Before All Tests");
    }

    @BeforeEach
    void init() {
        System.out.println("Before Each Test");
    }

    @Test
    void testOne() {
        System.out.println("Running Test One");
    }

    
    @Test
    @Disabled
    void testTwo() {
        System.out.println("This test is disabled");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each Test");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("After All Tests");
    }
}
