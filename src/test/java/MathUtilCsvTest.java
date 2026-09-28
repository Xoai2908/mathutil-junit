
import com.mycompany.mathutil.junit.MathutilJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class MathUtilCsvTest {

    @ParameterizedTest
    @CsvFileSource(
        resources = "/data/factorial_test_data.csv",
        numLinesToSkip = 1
    )
    void testGetFactorialValidInputFromCsv(
            int input, long expected) {

        assertEquals(
            expected,
            MathutilJunit.getFactorial(input)
        );
    }

    @ParameterizedTest
    @CsvSource({
        "0, 1",
        "1, 1",
        "20, 2432902008176640000"
    })
    void testGetFactorialBoundaryValues(
            int input, long expected) {

        assertEquals(
            expected,
            MathutilJunit.getFactorial(input)
        );
    }

    @ParameterizedTest
    @CsvSource({
        "-1",
        "21"
    })
    void testGetFactorialInvalidInputThrowsException(
            int input) {

        assertThrows(
            IllegalArgumentException.class,
            () -> MathutilJunit.getFactorial(input)
        );
    }
}