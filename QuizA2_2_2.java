public class QuizA2_2_2 {
    public static void main(String[] args) {
        int v = 1000000* 1000000;
        System.out.println(v);
        //int is not big enough for this calculation

        long l =1000000L*1000000L;
        System.out.println(l);
        // I have to add a letter to the calculation so it doesnt calculate as an int
    }
}
