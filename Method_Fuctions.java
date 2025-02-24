import java.util.function.Function;

public class Method_Fuctions {

    public static void main(String[] args) {
        //Functional Interfaces in Java
        // So wird die mehtode ohne Lambdas angezeigt werden
        //System.out.println(assTwoMethod(4));

        Function<Integer, Integer> addTwoMethode = number -> number +2;
        Function<Integer,Integer> multThree = number ->number*3;
        System.out.println(addTwoMethode.apply(4));;
        int result = addTwoMethode.andThen(multThree).apply(5);
        int result2 = addTwoMethode.compose(multThree).apply(5);

        System.out.println(result);



    }

    /*public static int assTwoMethod(int number){
        return number +2 ;

    }*/
}
