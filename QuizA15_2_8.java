import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizA15_2_8 {
    public static void main(String[] args) {


        //Array sind in der API häufig, und eine Umwandlung in die komfortable List kommt oft vor
        //Was ist das Ergebnis, wenn wir Folgendes in einem Java_programm schreiben

        //Arrays.asList("Eins", "Zwei",).add("Drei");
        List<String> list = new ArrayList<>(Arrays.asList("Eins", "Zwei"));
        list.add("Drei");

        System.out.println(list);

    }
}
