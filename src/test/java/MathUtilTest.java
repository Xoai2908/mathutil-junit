
import com.mycompany.mathutil.junit.MathutilJunit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class MathUtilTest {

    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0;
        long expected = 1; // kỳ vọng 0 != 1
        long actual = MathutilJunit.getFactorial(n);
//so sanh expected vs. actual
        assertEquals(expected, actual); // 
        assertEquals(1, MathutilJunit.getFactorial(1));
        assertEquals(2, MathutilJunit.getFactorial(2));
        assertEquals(6, MathutilJunit.getFactorial(3));
        assertEquals(24, MathutilJunit.getFactorial(4));
        assertEquals(120, MathutilJunit.getFactorial(5));
        assertEquals(720, MathutilJunit.getFactorial(6));
    }

    @Test
    void testGetFactorialGivenWrongArgumentThrowException() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> MathutilJunit.getFactorial(-5)
        );

        assertEquals(
                "Invalid argument. n must be between 0 and 20.",
                exception.getMessage()
        );
    }
}
