import java.util.Random;

public class QuizA2_3_1 {
    public static void main(String[] args) {
        int min = 5;
        int max = 200;
        Random rand = new Random();
        // Obtain a number between [0 - 300].
        int between = rand.nextInt(301);

        boolean isBetween = between > min && between < max;
        System.out.println(isBetween);
        System.out.println(between);

        //boolean isBetween = min < between < max;
        /*
        Java does not allow chained comparisons like min < between < max.
        Unlike Python, where you can write 5 < x < 10, Java requires explicit logical operators to combine conditions.
         */


    }
}
