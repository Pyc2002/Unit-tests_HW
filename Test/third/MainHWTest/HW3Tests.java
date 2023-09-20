package third.MainHWTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import third.hw.MainHW;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HW3Tests {
    private MainHW number;

    @BeforeEach
    void setUp(){
        number = new MainHW();
    }


    @Test
    void evenNumbersTest(){
        assertEquals(number.evenOddNumber(2), true);
    }
    @Test
    void oddNumbersTest(){
        assertEquals(number.evenOddNumber(5), false);
    }


    @Test
    void numberInIntervalTest(){
        assertEquals(number.numberInInterval(30), true);
    }
    @Test
    void numberNOTInIntervalTest(){
        assertEquals(number.numberInInterval(105), false);
    }
    @Test
    void numberNOTInIntervalBorderTest(){
        assertEquals(number.numberInInterval(24), false);
    }
    @Test
    void numberInIntervalBorderTest(){
        assertEquals(number.numberInInterval(99), true);
    }

}
