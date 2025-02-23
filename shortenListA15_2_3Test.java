
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class shortenListA15_2_3Test {
    @Test
    public void JTest(){
        List TestList = new ArrayList();
        Random rd = new Random();
        for (int i = 0; i < 10; ){
            TestList.add(rd.nextDouble());
            i++;
        }
        System.out.println(TestList);
        shortenListA15_2_3.trimNonGrowingNumbers(TestList);
        System.out.println(TestList);

    }

}
