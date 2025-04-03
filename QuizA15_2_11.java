import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class QuizA15_2_11 {
    public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    Collections.addAll(names, "", "Sonny","Crockett","Burnett","Ricardo","Rico","Tubbs","Ricardo","Cooper","");
    /*for (String name : names)
        if ("".equals(name))
            names.remove(name);*/

        //	•	for-each (enhanced for loop) benutzt intern einen Iterator
        // 	•	Wenn du names.remove(name); verwendest, wird die Liste während der Iteration verändert.
        //	•	Das führt zu einer ConcurrentModificationException.

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            if ("".equals(iterator.next())) {
                iterator.remove();
            }
        }

        System.out.println(names);
    }
}

