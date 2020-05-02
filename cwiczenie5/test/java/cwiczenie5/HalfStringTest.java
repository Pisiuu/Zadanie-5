package cwiczenie5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HalfStringTest {
    private HalfString halfString = new HalfString();

    @Test
    void test() {
        assertEquals("Ja",halfString.returnHalfString("Jakub"));
    }
}
