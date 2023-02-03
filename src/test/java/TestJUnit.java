import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.example.Tester;

public class TestJUnit {
    @Test
    void testSum() {
        System.out.println("======TEST TWO EXECUTED=======");
        Tester tester = new Tester();
        Assertions.assertEquals(4, tester.testFunc(2, 2),
                "testFunc(2,2) Test passed");
        Assertions.assertEquals(6, tester.testFunc(4, 2),
                "testFunc(2,2) Test passed");
        Assertions.assertEquals(-10, tester.testFunc(0, -10),
                "testFunc(2,2) Test passed");
        Assertions.assertEquals(30, tester.testFunc(20, 10),
                "testFunc(2,2) Test passed");
    }

    @Test
    void testDifference() {
        System.out.println("======TEST TWO EXECUTED=======");
        Tester tester = new Tester();
        Assertions.assertEquals(4, tester.secondTestFunc(5, 1),
                "testFunc(2,2) Test passed");
        Assertions.assertEquals(6, tester.secondTestFunc(10, 4),
                "testFunc(2,2) Test passed");
        Assertions.assertEquals(-10, tester.secondTestFunc(0, 10),
                "testFunc(2,2) Test passed");
        Assertions.assertEquals(30, tester.secondTestFunc(40, 10),
                "testFunc(2,2) Test passed");
    }
}

