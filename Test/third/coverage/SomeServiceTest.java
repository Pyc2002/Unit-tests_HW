package third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp(){
        someService = new SomeService();
    }

    @Test
    void returnsFizz() {
        // assertEquals...

        assertEquals(someService.fizzBuzz(3), "Fizz");
    }

    @Test
    void returnsBuzz() {
        // assertEquals...

        assertEquals(someService.fizzBuzz(5), "Buzz");
    }

    @Test
    void returnsFizzBuzz() {
        // assertEquals...

        assertEquals(someService.fizzBuzz(15), "FizzBuzz");
    }

    @Test
    void returnsNumberBuzz() {
        // assertEquals...

        assertEquals(someService.fizzBuzz(23), "23");
    }


    @Test
    void firstElementSix(){
        assertTrue(someService.firstLast6(new int[]{6,1,2,3}));
    }

    @Test
    void lastElementSix(){
        assertTrue(someService.firstLast6(new int[]{3,1,2,3,6}));
    }

    @Test
    void lastAndFirstElementNotSix(){
        assertFalse(someService.firstLast6(new int[]{3,1,2,3,7}));
    }


//class CalculationDiscontTest {
//    private CalculationDiscont calculationDiscont;
//
//    @BeforeEach
//    void setUp() {
//        calculationDiscont = new CalculationDiscont();
//    }

//    @Test
//    void correctSummAndDiscont() {
//        assertEquals(calculationDiscont.calculatingDiscount(100, 10), 90);
//    }
//
//    @Test
//    void summAndZeroDiscont() {
//        assertEquals(calculationDiscont.calculatingDiscount(100, 0), 100);
//    }
//
//    @Test
//    void summAndFullDiscont() {
//        assertEquals(calculationDiscont.calculatingDiscount(100, 100), 0);
//    }
//
//    @Test
//    void summZeroAndDiscont() {
//        assertEquals(calculationDiscont.calculatingDiscount(0, 10), 0);
//    }
//
//    @Test
//    void summAndOutDiscont() {
//        assertThatThrownBy(() -> calculationDiscont.calculatingDiscount(2000.0, 101))
//                .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
//    }
//
//    @Test
//    void summSubZeroAndDiscont() {
//        assertThatThrownBy(() -> calculationDiscont.calculatingDiscount(-1, 10))
//                .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Сумма покупки не может быть отрицательной");
//    }
//
//}
@Test
void luckyABC() {
    assertEquals(someService.luckySum(3, 2, 2), 7);
}

    @Test
    void luckyBC() {
        assertEquals(someService.luckySum(13, 2, 2), 4);
    }

    @Test
    void luckyAC() {
        assertEquals(someService.luckySum(3, 13, 2), 5);
    }

    @Test
    void luckyAB() {
        assertEquals(someService.luckySum(3, 3, 13), 6);
    }
}