import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Eightball {

    private ArrayList<String> phrases;


    public Eightball(ArrayList<String> phrases){
        this.phrases = phrases;
    }

    public String getPhraseAtIndex(String index){
        return this.phrases.get(0);
    }

    public ArrayList<String> getPhrase(){
        ArrayList<String> copyOfPhrases = new ArrayList<>(this.phrases);
        return copyOfPhrases;
    }

    public String getRandomPhrase(){
        Collections.shuffle(this.phrases);
        return getPhraseAtIndex(toString());
    }

    public void getAnswer(){
        System.out.println(getRandomPhrase());
    }
}

