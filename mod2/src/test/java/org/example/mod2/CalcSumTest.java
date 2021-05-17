package org.example.mod2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcSumTest {
    @Test
    public void shouldReturnCorrectSum(){
        CalcSum cs = new CalcSum();
        assertEquals(5, cs.sum(3,2));
    }
}
