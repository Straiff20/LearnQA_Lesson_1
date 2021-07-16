import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int localNumber = getLocalNumber();
        assertEquals("Error: getLocalNumber return not \"14\"", 14, localNumber);
    }

    @Test
    public void testGetClassNumber() {
        int classNumber = getClassNumber();
        assertEquals("Error: classNumber not more \"45\". ClassNumber = " + classNumber, classNumber > 45, classNumber);
    }
}