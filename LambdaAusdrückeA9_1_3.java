import java.awt.*;
import java.awt.event.ActionListener;

public class LambdaAusdrückeA9_1_3{
    //interface Runnable {void run():}
    //interface ActionListener {void actionPerformed(ActionEvent e);}
    interface Supplier<T> {T get();}
    interface Consumer<T> {void accept(T t);}
    interface Comperator<T> {int compare(T o1, T o2);}


    Runnable runnable =  () -> {};

    ActionListener listener = (e) -> {};

    Supplier<String> supplier = () -> {return "";};

    Consumer<Point> consumer = point -> {};

    Comperator<Rectangle> comperator = (r1, r2) -> {return 0;
    };

}
