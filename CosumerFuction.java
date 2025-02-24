import java.util.List;
import java.util.function.Consumer;

public class CosumerFuction {
    public static void main(String[] args) {
        List<String> students = List.of("Peter", "Max", "Paula");

        //SysOutWithEM("Moinmoin");
        Consumer<String> swem =  s -> System.out.println(s + " !!!!");
        for (String student : students){
            SysOutWithEM(student);
        }
        // oder dies auch möglich
        students.forEach(swem);
    }
    public static void SysOutWithEM(String s){
        System.out.println(s + " !!!!");
    }
}
