import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void sampleTests() {
        assertEquals("4547-9-3", Solution.insertDash(454793));
        assertEquals("123456", Solution.insertDash(123456));
        assertEquals("1003-567", Solution.insertDash(1003567));
    }
}