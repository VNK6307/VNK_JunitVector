import junit.vector.Vector;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class VectorTest {
    @BeforeEach
    public void initTest() {
        System.out.println("Starting new test.");
    }

    @AfterEach
    public void endTest() {
        System.out.println("Test completed.");
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        Vector vector = new Vector();
        double x = 0;
        double y = 0;
        Assertions.assertEquals(0, vector.length(x, y), 1e-5);
    }

    @ParameterizedTest
    @MethodSource("vectorLengthCalculateProperlySource")
    public void vectorLengthShouldCalculateProperly(double x, double y, double expected) {
        Vector vector = new Vector();
        double actual = vector.length(x, y);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> vectorLengthCalculateProperlySource() {
        return Stream.of(Arguments.of(3, 4, 5));
    }
}// class
