package Task1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberPrinterTest {
    NumWordPrinter printer = new NumWordPrinter();

    @Test
    public void testEven ()
    {
        assertEquals("Even", printer.printWord(8, false));
    }
}
