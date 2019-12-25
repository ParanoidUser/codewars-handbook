import org.junit.Test;
import org.junit.Assert;
import org.junit.runners.JUnit4;


public class WordSearchTest {
    @Test
    public void test() {
        String[] test1 = {"lemonade", "limeade", "Yoo-Hoo", "root beer", "grapeade ", "water", "Mr. Pibb"};
        String[] test1results = {"lemonade", "limeade", "grapeade "};
        String[] test2results = {"Tin + Oxygen", "lox"};
        String[] test3results = {"Empty"};
        Assert.assertArrayEquals(test1results, WordSearch.findWord("ade", test1));
        String[] test2 = new String[320];
        for (int i = 0; i < 320; i++){ test2[i] = "o x"; }
        test2[303] = "lox";
        test2[70] = "Tin + Oxygen";
        Assert.assertArrayEquals(test2results, WordSearch.findWord("ox", test2));
        Assert.assertArrayEquals(test3results, WordSearch.findWord("   ", test1));
    }
}