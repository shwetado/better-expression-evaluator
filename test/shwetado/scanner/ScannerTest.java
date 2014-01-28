package shwetado.scanner;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ScannerTest {
    @Test
    public void testToScanNextLetterOfAWord() throws Exception {
        Scanner scanner = new Scanner("ja");
        assertEquals('j',scanner.getNext());
        assertEquals('a',scanner.getNext());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testToScanNextLetterOfAWordForEmptyString() throws Exception {
        Scanner scanner = new Scanner("");
        scanner.getNext();
    }

    @Test
    public void testToScanNextLetterOfAWordWhen1BlankPresent() throws Exception {
        Scanner scanner = new Scanner("j a");
        assertEquals('j',scanner.getNext());
        assertEquals('a',scanner.getNext());
    }

    @Test
    public void testToScanNextLetterOfAWordWhenMultipleBlanksPresent() throws Exception {
        Scanner scanner = new Scanner("b   a");
        assertEquals('b',scanner.getNext());
        assertEquals('a',scanner.getNext());
    }

}