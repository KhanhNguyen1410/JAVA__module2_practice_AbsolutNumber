import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberTest {

    @Test
    @DisplayName("testing 0")
    public void testAbsolute0(){
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumber.absoluteNumber(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing 1")
    public void testAbsolute1(){
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumber.absoluteNumber(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing -1")
    public void testAbsolute2(){
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumber.absoluteNumber(number);
        assertEquals(expected, result);
    }


}