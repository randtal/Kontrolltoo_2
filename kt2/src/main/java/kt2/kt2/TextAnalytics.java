import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

// (1)Loote interface antud 4. ülessande klassi implemeerimiseks.

interface Text {
    public void TextAnalytics();
    public void read_my_file();
    public void split_words_into_pieces();
    public void turn_words_to_lowercase();
    public void count_words();
}

class TextAnalytics implements Text {

    String path;
    String file_content;
    String[] array_of_words;
    HashMap<String, Integer> counter;

    public TextAnalytics(String path) {
        this.path = path;
        this.read_my_file();
        this.split_words_into_pieces();
        this.turn_words_to_lowercase();
    }

    public void read_my_file() {
        Path file_path = Paths.get(this.path);
        try {
            byte[] file_content_in_bytes = Files.readAllBytes(file_path);
            String file_content = new String(file_content_in_bytes, StandardCharsets.UTF_8);
            this.file_content = file_content;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void split_words_into_pieces() {
        String[] array_of_words = this.file_content.split(" ");
        this.array_of_words = array_of_words;
    }

    public void turn_words_to_lowercase() {
        for (int i = 0; i < this.array_of_words.length; i++) {
            String word = this.array_of_words[i];
            this.array_of_words[i] = word.toLowerCase();
        }
    }

    public void count_words() {
        // Tsüklis käid läbi sõnad.
            // Vaatad kas HashMap's on võti selle sõna jaoks olemas.
            // Kui ei ole, lood HashMap'i sisse kirje selle võtmega ja annad
            // annad talle väärtuseks 0.
            // Kui eelnevalt on juba olemas, võtad sealt väärtuse, suurendad ühe võrra ja paned tagasi.
        for (String word : this.array_of_words) {
            
        }
    }

    @Override
    public void TextAnalytics() {

    }   
}

//(3)Looge klass mis suudab lugeda failist teksti, muudab nad lowercase, 
//tükeldab sõnad ja loendab ära kõik sõnad mis on pikemad kui 4 tähte.

class TextCounter {
    
    private Object text;
    private String path;

    public void TextAnalytics(String path) {
        this.path = path;
        this.read_my_file();
        this.turn_words_to_lowercase();
        this.split_words_into_pieces();
    }

    int count_words(char words) {
        int counter = 0;
        for (int i = 0; i < ((String) this.text).length(); i++) {
            char c = ((String) this.text).charAt(i);
            if (c != words) {
                counter++;
            }
        }
        return counter;

    }
}