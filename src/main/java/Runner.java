import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List phrases = new ArrayList();
        phrases.add("Maybe");
        phrases.add("Definitely Maybe");
        phrases.add("Probably");


        Collections.shuffle(phrases);
        System.out.println(phrases);

//        eightball.getAnswer();

    }
}