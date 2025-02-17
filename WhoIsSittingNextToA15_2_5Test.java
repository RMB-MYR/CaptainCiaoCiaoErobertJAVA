
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WhoIsSittingNextToA15_2_5Test {
    @Test
    public void JTest(){
        List <String> circleAnonymousPirates_Names1 = new ArrayList<>();
        circleAnonymousPirates_Names1.add("Alexandre");
        circleAnonymousPirates_Names1.add("Henry");
        circleAnonymousPirates_Names1.add("Anne");
        circleAnonymousPirates_Names1.add("JackSparrow");
        circleAnonymousPirates_Names1.add("Charles");
        //System.out.println(circleAnonymousPirates_Names1);

        //Collections.shuffle(circleAnonymousPirates_Names1);
        System.out.println(circleAnonymousPirates_Names1);

        List <String> circleAnonymousPirates_Names2 = new ArrayList<>();
        circleAnonymousPirates_Names2.add("Alexandre");
        circleAnonymousPirates_Names2.add("Henry");
        circleAnonymousPirates_Names2.add("Anne");
        circleAnonymousPirates_Names2.add("JackSparrow");
        circleAnonymousPirates_Names2.add("Charles");
        //System.out.println(circleAnonymousPirates_Names2);

        Collections.shuffle(circleAnonymousPirates_Names2);
        System.out.println(circleAnonymousPirates_Names2);

        WhoIsSittingNextToA15_2_5.isSameCircle(circleAnonymousPirates_Names1,circleAnonymousPirates_Names2);

    }

}
