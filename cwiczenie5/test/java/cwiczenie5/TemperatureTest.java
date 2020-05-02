package cwiczenie5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest {
    private Temperature temperature = new Temperature();

    @Test
    void test() {
        assertEquals(true,temperature.under100(100,150));
    }
}
