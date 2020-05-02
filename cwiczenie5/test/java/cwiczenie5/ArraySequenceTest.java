package cwiczenie5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraySequenceTest {
    private ArraySequence arraySequence = new ArraySequence();

    @Test
    void test() {
        assertEquals(true,arraySequence.find(1,2,3));
    }
}