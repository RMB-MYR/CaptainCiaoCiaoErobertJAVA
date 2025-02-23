import java.math.BigDecimal;

public class QuizA2_2_3 {
    public static void main(String[] args) {
        Double v= 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1-1.0;
        System.out.println(v);
        /*
        In Java, the double data type follows the IEEE 754 standard for floating-point arithmetic.
	    The number 0.1 (like many other decimal fractions) cannot be exactly represented in binary.
	    When you add 0.1 ten times, the accumulated small inaccuracies cause the final result to be slightly different from 1.0.
	    When you subtract 1.0, the result is a very small nonzero value, not exactly 0.0.
         */
        BigDecimal b = new BigDecimal("0.1").multiply(new BigDecimal("10")).subtract(new BigDecimal("1.0"));
        System.out.println(b);
    }
}
