package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWordsS() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastWordWithR() {
        int words = new CountLetters().count("cat|door");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void multipleMatchingWordsSR() {
        int words = new CountLetters().count("door|cats");
        Assertions.assertEquals(2, words);
    }

}