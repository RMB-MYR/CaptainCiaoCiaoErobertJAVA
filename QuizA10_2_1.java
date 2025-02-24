import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class QuizA10_2_1 {
    public static void main(String[] args) {

        String[] strings = {"A","B","C"};
        //Arrays.sort(strings);

        Point[] points ={
                new Point(9,3),
                new Point(3,4),
                new Point(4,3),
                new Point(1,2),
        };
        Arrays.sort(points);

        //System.out.println(points);
        System.out.println(strings);
    }
}
