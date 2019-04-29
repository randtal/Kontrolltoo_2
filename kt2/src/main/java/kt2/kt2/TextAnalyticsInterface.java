package kt2.kt2;

import java.util.List;

interface TextAnalyticsInterface {
    public String getTextFromFile(String path);
    public String[] turnTextIntoWordsArray(String text);
    public List<String> wordsWithLetterI(String[] words);
}