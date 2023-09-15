package third.coverage;

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


}
