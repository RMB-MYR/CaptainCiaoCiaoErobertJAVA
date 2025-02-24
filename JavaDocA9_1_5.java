import java.util.Locale;
import java.util.function.DoubleSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.UnaryOperator;

public class JavaDocA9_1_5 {
    public static void main(String[] args) {
        DoubleSupplier ds = ()-> Math.random();

        LongToDoubleFunction ltdf = a -> a/2;

        UnaryOperator<String> up = s -> s.toLowerCase(Locale.ROOT);

    }
}
