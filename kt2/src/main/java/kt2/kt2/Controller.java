package kt2.kt2;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller{

    @GetMapping("/analyze")
    public List<String> analizeILetters(String text){
        TextAnalytics analytics = new TextAnalytics();
        String[] words = analytics.turnTextIntoWordsArray(text);
        return analytics.wordsWithLetterI(words);
    }
}