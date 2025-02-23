import java.util.ArrayList;
import java.util.List;


public class reduceToCommentsA15_2_2 {
    public static void main(String[] args) {
        List <String> List1 = new ArrayList<>();
        List1.add("A1");
        List1.add("A2");
        List1.add("A3");
        List1.add("A4");
        System.out.println(List1);
        List <String> List2 = new ArrayList<>();
        List2.add("B1");
        List2.add("B2");
        List2.add("B3");
        List2.add("B4");
        System.out.println(List2);
        List <String> List3 = new ArrayList<>();
        List3.add("C1");
        List3.add("C2");
        List3.add("C3");
        List3.add("C4");
        System.out.println(List3);

        reduceToComments(List1);
        System.out.print(List1);
        reduceToComments(List2);
        System.out.print(List2);
        reduceToComments(List3);
        System.out.print(List3);
        
    }
     public static void reduceToComments(List<String> lines){
        if ((lines.size() % 4) != 0){
            throw new IllegalArgumentException( "Illegal size of list, must be devisible by 4");
        }
        else {
            lines.remove(2);
            lines.remove(1);
            lines.remove(0);
        }
     }
}

