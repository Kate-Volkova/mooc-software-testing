package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;

public class GHappyTest {
    @ParameterizedTest(name = "{0}: ({1}) = {2}")
    @CsvSource({
            // A string without G but with another double character.
            "'withoutG','xxyyxx',false",
            // One G in different positions in the string.
            "'1g','gxxyyxx',false", "'1g','xxyyxxg',false", "'1g','xxgyyxx',false",
            // Two G in different positions, together and separate.
            "'2gg','xxyggyxx',true", "'2gg','ggxxyyxx',true", "'2gg','xxyyxxgg',true", "'2gg','xxygagyxx',false",
            // Three G in different positions, together and separate.
            "'3ggg','xxygggyxx',true", "'3ggg','xxygyxxgg',false", "'3ggg','xggxygyxx',false"
    })
    public void testAlgorithm(String partition, String str, Boolean expectedResult) {
        Boolean result = new GHappy().gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }

}
