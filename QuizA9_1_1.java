import org.junit.jupiter.api.Test;

public class QuizA9_1_1 {


    @FunctionalInterface
    interface Distance {
        abstract public int distance(int a, int b);
    }
    // Ist eine funktionale Schnittstelle

    interface MoreDistance extends Distance{
        double distance ( double a, double b);
    }
    // durch das Extends hat diese Funktionelle Schnittstelle zwei Methoden was unzulässig ist.

    @FunctionalInterface
    interface MoreDistance2 extends  Distance {
        default double distance(double a, double b) {
            return distance((int) a, (int) b);
        }
    }
    //diese funktionelle Schnittstelle hat nur eine Methode, und zwar diese von Distance


    @FunctionalInterface
    interface DistanceImpl{
        default int distance(int a, int b) {return a+b;
        }
    }
    // diese funktionale Schnittstelle hat innerhalb der Schnittstelle keine
    // Methode definiert > erbit nur aus einer anderen.
    // Eine funtionale sShcnittstelle muss eine Methode besitzen

    @FunctionalInterface
    interface DistanceEquals{
        int distance( int a, int b);
        boolean equals (Object other);
    }

    // die equals Methode ist speiziell und immer im Objekt vorhanden.


}
