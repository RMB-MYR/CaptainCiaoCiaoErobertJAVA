import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChesseA15_2_10Test {
    @Test
    public void JTest(){
        List<String> testRecept = new ArrayList<>();
        testRecept.add("Gnocchi");
        testRecept.add("Zuchini");
        testRecept.add("Sahne");
        testRecept.add("Brühe");
        testRecept.add("Zwiebel");
        testRecept.add("Tomaten");
        testRecept.add("Pfeffer");
        testRecept.add("Brühe");
        testRecept.add("Zwiebel");
        testRecept.add("Brühe");
        testRecept.add("Penne");
        testRecept.add("Speck");
        testRecept.add("Tomaten");
        Collections.shuffle(testRecept);

        System.out.println("Vorher: " + testRecept);
        CheeseA15_2_10.insertCheeseAroundVegetable(testRecept);
        System.out.println("Nachher: " + testRecept);



    }
}
