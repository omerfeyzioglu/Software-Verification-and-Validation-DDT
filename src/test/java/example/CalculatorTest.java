/*
* B211202015
* Ömer Feyzioğlu
* SOFTWARE VERIFICATION AND VALIDATION HOMEWORK 1
*https://github.com/omerfeyzioglu/Software-Verification-and-Validation-DDT
*/

package example;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    static Calculator calculator;

    /*
    * @BeforeAll and @Afterall annotation are used cause of same Calculator object
    * is used for all test steps.
    * */
    @BeforeAll
    static  void setUp() {
        calculator = new Calculator();
        System.out.println("setup called");
    }

    @AfterAll
    static void cleanUp(){
        calculator = null;
        System.out.println("cleanup called");
    }

        @ParameterizedTest
        @CsvSource({
                "5, 10, 2",
                "2.5, 10, 4",
                "5, 12.5, 2.5",
                "4, 10, 2.5",
                "2.5, 12.5, 5"
        })
        @DisplayName("Calculator Test")
        void testDivide (float expected,float dividend, float divisor ){
            assertEquals( Calculator.divide(dividend, divisor), expected);

        }





        //SECOND WAY
//    @ParameterizedTest
//    @MethodSource("divisionValues")
//    @DisplayName("Test Division")
//    void testDivision(float dividend, float divisor, float expected) {
//        assertEquals(expected, calculator.divide(dividend, divisor));
//    }
//
//    private static Stream<Arguments> divisionValues() {
//        return Stream.of(
//                Arguments.of(10, 2, 5),
//                Arguments.of(10, 4, 2.5),
//                Arguments.of(12.5f, 2.5f, 5),
//                Arguments.of(10, 2.5f, 4),
//                Arguments.of(12.5f, 5, 2.5f)
//        );
//    }
}
