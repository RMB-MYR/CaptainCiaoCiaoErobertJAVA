import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class WhoIsSittingNextToA15_2_5 {
    public static void main(String[] args) {


        List <String> circleAnonymousPirates = new ArrayList<>();
        circleAnonymousPirates.add("Alexandre");
        circleAnonymousPirates.add("Henry");
        circleAnonymousPirates.add("Anne");
        circleAnonymousPirates.add("JackSparrow");
        circleAnonymousPirates.add("Charles");
        System.out.println(circleAnonymousPirates);

        List <String> names1 = new ArrayList<>();
        names1.add("Henry");
        names1.add("Anne");
        names1.add("JackSparrow");
        names1.add("Charles");
        names1.add("Alexandre");

        List <String> names2 = new ArrayList<>();
        names2.add("JackSparrow");
        names2.add("Charles");
        names2.add("Alexandre");
        names2.add("Henry");
        names2.add("Anne");


        //System.out.println("Calling isSameCirle");
        isSameCircle(names1, names2);


    }

    public static void isSameCircle(List<String> names1, List<String> names2){

        List<String> newNames1 = new ArrayList<>(names1);
        newNames1.addAll(names1);
        //System.out.println("Hello");
        System.out.println(newNames1);

        int index = Collections.indexOfSubList(newNames1, names2);
        if (index >= 0) {
            System.out.println("names2 is a sublist of names1, starting at index " + index);
        } else {
            System.out.println("names2 is NOT a sublist of names1.");
        }

    }
}
