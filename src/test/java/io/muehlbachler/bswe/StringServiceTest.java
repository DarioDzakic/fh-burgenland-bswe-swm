package io.muehlbachler.bswe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringServiceTest {
    private StringService stringService = new StringService();

    @Test
    public void testToUpperCase() {
        assertEquals("ABC", stringService.toUpperCase("abc"), "abc toUpperCase should be ABC");
    }

    @Test
    public void testToUpperCaseEmptyString() {
        assertEquals("", stringService.toUpperCase(""), "'' toUpperCase should be ''");
    }


    @Test
    public void testToUpperCaseNull() {
        assertEquals(null, stringService.toUpperCase(null), "null toUpperCase should be null");
    }
    // FIXME: implement more tests
}
