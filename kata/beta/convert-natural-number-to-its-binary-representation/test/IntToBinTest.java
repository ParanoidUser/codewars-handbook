import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntToBinTest {
    @Test
    public void shouldWorkWith0() {
        assertEquals("Should work with 0", "0", Kata.IntToBin(0));
    }

    @Test
    public void shouldWorkWith8() {
        assertEquals("Should work with 8", "1000", Kata.IntToBin(8));
    }

    @Test
    public void shouldWorkWith7() {
        assertEquals("Should work with 7", "111", Kata.IntToBin(7));
    }
}