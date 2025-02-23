import java.util.ArrayList;
import java.util.List;

public class shortenListA15_2_3 {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.1);
        numbers.add(3.0);
        numbers.add(4.1);
        numbers.add(8.0);
        numbers.add(2.1);
        numbers.add(3.0);
        numbers.add(9.0); 
        numbers.add(10.1);
        numbers.add(3.0);
        System.out.println(numbers.size());
        System.out.println(numbers);
        trimNonGrowingNumbers(numbers);
    }

    public static void trimNonGrowingNumbers (List <Double> numberList){
      
        for (int i = 0; i < numberList.size()-1;) {

            if (numberList.get(i) >= numberList.get(i + 1)) {
                numberList.remove(i + 1);
                System.out.println(numberList);
                
            } else {
                i++;
                System.out.println(numberList);

            }
        }
    }



}

