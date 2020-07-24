package util;


import org.junit.jupiter.api.Test;

import java.util.Map;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    /**
     * The purpose of this method is to test the StringUtils.longestWord
     */
    @Test
    public void testLongestWord(){

        String str="The cow jumped over the moon.";
        StringUtils strs=new StringUtils();
        Map<Integer, String> emry= strs.longestWord(str);
        assertTrue(emry.containsKey(6), "length did not match");
        assertTrue(emry.containsValue("jumped"), "Word not found");

    }
}
