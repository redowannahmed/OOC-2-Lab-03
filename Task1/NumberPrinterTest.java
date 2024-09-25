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
    public void testEvenUppercase() {
        assertEquals("EVEN", printer.printWord(8, true));
    }

    @Test
    public void testPrimeEleven() {
        assertEquals("PrimeEleven", printer.printWord(22, false));
    }

    @Test
    public void testPrimeElevenUppercase() {
        assertEquals("PRIMEELEVEN", printer.printWord(22, true));
    }

    @Test
    public void testLuckyThirteen() {
        assertEquals("LuckyThirteen", printer.printWord(13, false));
    }

    @Test
    public void testEvenPrimeLucky() {
        assertEquals("EvenPrimeLucky", printer.printWord(286, false)); 
    }

    @Test
    public void testOddOneOut() {
        assertEquals("OddOneOut", printer.printWord(7, false));
    }

    @Test
    public void testOddOneOutUppercase() {
        assertEquals("ODDONEOUT", printer.printWord(7, true));
    }
}
