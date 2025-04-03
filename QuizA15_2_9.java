import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizA15_2_9 {
    //Wie ist die Ausgabe, wenn wir folgendes in einem Java-Programm haben
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3};
        System.out.println(Arrays.asList(numbers1).contains(1));
        Integer[] numbers = {1, 2, 3};
        System.out.println(Arrays.asList(numbers).contains(1));
        System.out.println(Arrays.asList(1, 2, 3).contains(1));
    }

}
