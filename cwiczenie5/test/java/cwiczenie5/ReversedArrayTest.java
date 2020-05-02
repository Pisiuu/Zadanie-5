package cwiczenie5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReversedArrayTest {
    private ReversedArray reversedArray = new ReversedArray();

    @Test
    void test() {
        assertEquals(321,reversedArray.reverseArray(1,2,3));
    }
}
