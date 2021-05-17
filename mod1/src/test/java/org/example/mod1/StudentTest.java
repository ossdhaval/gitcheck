package org.example.mod1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void shouldReturnFullName(){
        Student st = new Student();
        st.lastName = "desai";
        st.firstName = "dhaval";

        String expected = "dhaval desai";
        assertEquals(expected, st.getFullName());

    }

    @Test
    public void shouldHaveSpaceInFullName(){
        Student st = new Student();
        st.lastName = "desai";
        st.firstName = "dhaval";

        String expected = "dhavaldesai";
        assertNotEquals(expected, st.getFullName());

    }
}
