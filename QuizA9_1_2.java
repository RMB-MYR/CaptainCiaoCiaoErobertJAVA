public class QuizA9_1_2 {

    @FunctionalInterface
    interface Distance {
        int distance(int a, int b);

    }

    class Schmegeggy{
        static void printDistance(Distance distance, int a, int b){
            System.out.println(distance.distance(a,b));
        }

        public static void main(String[] args) {


            class ManhattanDistance implements Distance{
                @Override public int distance(int a,int b){
                    return a + b;

                }
            }
            //printDistance(new ManhattanDistance(), 12, 33);
            // Welche Lambda-Ausdrücke können den Code vereinfachen?
            // Nr.1
            printDistance((a,b) -> a+b,12,33);
            // Nr.2
            printDistance((a,b)-> {return a+b;},12,33);
            // Nr.3
            printDistance((int a, int b)-> a+b,12,33);
            // Nr.4
            //printDistance((int a + b)-> a+b,12,33); // Variable Typ b wird nicht bestimmt
            // Nr. 5
            //printDistance(a,b) -> {return a+b;},12,33); //Klammer nach printDistnce fehlt
            // Nr.6
            //printDistance((a,b)-> return a + b,12,33); // {} um return fehlen
            // Nr.7
            //printDistance((a,b)->{int a; return b +b;},12,33); // nach Lambda wird a definiert und return a fehlt
            // Nr.8
            //printDistance((Integer a, Integer b) -> a+b,12,33); // Integer und Int nicht gleichwertig

        }
    }
}
