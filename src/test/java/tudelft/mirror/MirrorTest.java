package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {
    @Test
    void oneLoop() {
        Mirror string = new Mirror();
        String mirror = string.mirrorEnds("t");
        Assertions.assertEquals("t", mirror);
    }

    @Test
    void noMirrorLetters() {
        Mirror string = new Mirror();
        String mirror = string.mirrorEnds("tffa");
        Assertions.assertEquals("", mirror);
    }

    @Test
    void emptyStringZeroLoop() {
        Mirror string = new Mirror();
        String mirror = string.mirrorEnds("");
        Assertions.assertEquals("", mirror);
    }

    @Test
    void severalLoops() {
        Mirror string = new Mirror();
        String mirror = string.mirrorEnds("daghad");
        Assertions.assertEquals("da", mirror);
    }

    @Test
    void totalMirror() {
        Mirror string = new Mirror();
        String mirror = string.mirrorEnds("dagad");
        Assertions.assertEquals("dagad", mirror);
    }

    @Test
    void lettersWithSpaces() {
        Mirror string = new Mirror();
        String mirror = string.mirrorEnds("d dhd");
        Assertions.assertEquals("d", mirror);
    }

}
