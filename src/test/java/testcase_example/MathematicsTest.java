package testcase_example;

import static org.junit.Assert.*;

import org.junit.*;

import junit.framework.TestCase;

public class MathematicsTest extends TestCase{
    public String fileContent;

    @Override
    public void setUp() throws Exception {
        this.fileContent = "jadadadaa";
    }

    @Override
    public void tearDown() throws Exception {
        this.fileContent = null;
    }

    @Before
    public void printBeforeEveryTestFunction(){
        System.out.println("Triggers before test");
    }

    @After
    public void printAfterEveryTestFunction(){
        System.out.println("Triggers after test");
    }

    @Test
    public void testIfOnePlusOneEqualsTwo(){
        System.out.println("Triggered test of sum function");
        System.out.println(this.fileContent);
        // Given
        Mathematics math = new Mathematics();

        // When
        int a = 1;
        int b = 2;

        // Then
        assertTrue(math.sum(a, b) == 3);
    } 
    @Test(expected = ArithmeticException.class)
    public void testDivisionWithZero(){
        Mathematics math = new Mathematics();

        int a = 1;
        int b = 0;

        double answer = math.division(a, b);
    }
}
