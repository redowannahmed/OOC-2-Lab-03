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

    @Test
    public void testEVEN ()
    {
        assertEquals("EVEN", printer.printWord(8, true));
    }

    @Test
    public void testPrimeEleven ()
    {
        assertEquals("EvenPrimeEleven", printer.printWord(22, false));
    }

    @Test
    public void testPrimeELEVEN ()
    {
        assertEquals("EVENPRIMEELEVEN", printer.printWord(22, true));
    }
}
