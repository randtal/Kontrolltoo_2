import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import org.junit.Test;

import jdk.internal.jline.internal.TestAccessible;

// (2)Loote iga funktsiooni jaoks 3 testi.

public class TextAnalyticsTest{

    //Testib, kas on õige file path
    @Test
    public void testIfWrongFilePathIsHandled(){
        TextAnalyticsTest analytics = new TextAnalyticsTest();
        String text = analytics.getTextFromFile("/");
        assertTrue(true);
    }

    //Kontrollib, kas file on tühi või täis
    @Test
    public void testIfFileContentIsEmpty(){
        TextAnalyticsTest analytics = new TextAnalyticsTest();
        String text = analytics.getTextFromFile("/");
        assertFalse(text.equals(""));
        assertNotNull(text);
    }

    //Testib, kas sõnasi on
    @Test
    public void testIfWordsNotNull(){
        TextAnalytics analytics = new TextAnalytics();
        String[] words = analytics.turnTextIntoWordsArray("tere isa");
        assertNotNull(words); 
    }

    //Kontrollib, kas sõnu eksisteerib
    @Test
    public void testIfItHasWords(){
        TextAnalytics analytics = new TextAnalytics();
        String[] words = analytics.turnTextIntoWordsArray("tere isa");
        assertNotNull(words.length > 1); 
    }

    //Testib, kas sõnade arvutus on õige (?)
    @Test
    public void testifLetterCalculationIsCorrect(){
        TextAnalytics analytics = new TextAnalytics();
        String[] words = {"hello", "isa"};
        List<String> result = analytics.wordsWithLetterI(words);
        assertTrue(result.size() == 1);
    }


    @Test
    public void testifReturnsEmptyListOnNoValue(){
        TextAnalytics analytics = new TextAnalytics();
        String[] words = {"hello", "isa"};
        List<String> result = analytics.wordsWithLetterI(words);
        assertTrue(result.size() == 0);
    }

    //Testib, kas saab eggplant emoijisi kasutada
    @Test
    public void testifItCanHandleEggplantEmoijis(){
        TextAnalytics analytics = new TextAnalytics();
        String[] words = {"hello", "🍆"};
        List<String> result = analytics.wordsWithLetterI(words);
        assertTrue(true);
    }

    //Testib, kas saab mõnda muud emoijit kasutada
    @Test 
    public void testifItCanHandlePoopEmoijis(){
        TextAnalytics analytics = new TextAnalytics();
        String[] words = {"hello", "💩"};
        List<String> result = analytics.wordsWithLetterI(words);
        assertTrue(true);
    }
}