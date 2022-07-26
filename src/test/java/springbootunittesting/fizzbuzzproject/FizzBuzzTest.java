package springbootunittesting.fizzbuzzproject;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Rules:
 * If number is divisible by 3 print, Fizz
 * If number is divisible by 5 print, Buzz
 * If number is divisible by 3 and 5, print FizzBuzz
 * If number is Not divisible by 3 or 5, print the number
 */
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FizzBuzzTest {
    FizzBuzz fizzbuzz;
    @BeforeAll
    void beforeAll(){
        fizzbuzz = new FizzBuzz();
    }


    @DisplayName("Divisible By Three")
    @Test
    @Order(1)
    void testForDivisibleByThree(){
        fizzbuzz.setNumber(9);
        String expected = "Fizz";
        assertEquals(expected, fizzbuzz.compute());

    }
    @DisplayName("Divisible By Five")
    @Test
    @Order(2)
    void testForDivisibleByFive(){
        fizzbuzz.setNumber(10);
        String expected = "Buzz";
        assertEquals(expected, fizzbuzz.compute());

    }

    @DisplayName("Divisible By Three and Five")
    @Test
    @Order(3)
    void testForDivisibleByThreeAndFive(){
        fizzbuzz.setNumber(15);
        String expected = "FizzBuzz";
        assertEquals(expected, fizzbuzz.compute());

    }

    @DisplayName("Non Divisible Value")
    @Test
    @Order(4)
    void testForNonDivisible(){
        fizzbuzz.setNumber(16);
        String expected ="" + 16;
        assertEquals(expected, fizzbuzz.compute());

    }
    @DisplayName("Test For Small Data")
    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @Order(5)
    void testForSmallDataFile(int value,String expected){
        fizzbuzz.setNumber(value);
        assertEquals(expected, fizzbuzz.compute());

    }
}
