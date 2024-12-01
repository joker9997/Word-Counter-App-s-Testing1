import org.junit.Test;
import static org.junit.Assert.*;

public class TextCounterTest {
    private TextCounter textCounter = new TextCounter();
    @Test
    public void testCountWords_normalInput() {
        String input = "Hello world this is a test";
        assertEquals(6, textCounter.countWords(input));
    }
    @Test
    public void testCountWords_emptyInput() {
        String input = "";
        assertEquals(0, textCounter.countWords(input));
    }
    @Test
    public void testCountWords_nullInput() {
        String input = null;
        assertEquals(0, textCounter.countWords(input));
    }
    @Test
    public void testCountWords_multipleSpaces() {
        String input = "Hello   world  test";
        assertEquals(3, textCounter.countWords(input));
    }
    @Test
    public void testCountCharacters_normalInput() {
        String input = "Hello World";
        assertEquals(11, textCounter.countCharacters(input));
    }
    @Test
    public void testCountCharacters_emptyInput() {
        String input = "";
        assertEquals(0, textCounter.countCharacters(input));
    }

    @Test
    public void testCountCharacters_nullInput() {
        String input = null;
        assertEquals(0, textCounter.countCharacters(input));
    }
}