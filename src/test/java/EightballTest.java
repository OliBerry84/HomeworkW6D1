import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class EightballTest {

    private Eightball myPhrases;

    @Before
    public void before(){
        ArrayList<String> testStrings = new ArrayList<>();
        testStrings.add("Maybe");
        testStrings.add("Definitely Maybe");
        testStrings.add("Perhaps");
        this.myPhrases =new Eightball(testStrings);
        }

    @Test
    public void canGetRandom(){
        ArrayList<String> copy = myPhrases.getPhrase();
        String randomPhrase = myPhrases.getRandomPhrase();
        assertTrue(copy.contains(randomPhrase));
    }
}