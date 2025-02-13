// this class is to Test the clas CrewMemberA15_2_1.java


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CrewMemberA15_2_1Test {
    @Test
    public void JTest(){
        List testList = new ArrayList();
        CrewMemberA15_2_1 captain = new CrewMemberA15_2_1("Jack Sparrow", CrewMemberA15_2_1.Profession.CAPTAIN);
        testList.add(captain);
        CrewMemberA15_2_1 cook = new CrewMemberA15_2_1("AL Dente", CrewMemberA15_2_1.Profession.COOK);
        testList.add(cook);
        CrewMemberA15_2_1 musician = new CrewMemberA15_2_1("Elvis", CrewMemberA15_2_1.Profession.MUSICIAN);
        testList.add(musician);
        CrewMemberA15_2_1 doctor = new CrewMemberA15_2_1("Wuu", CrewMemberA15_2_1.Profession.DOCTOR);
        testList.add(doctor);
        CrewMemberA15_2_1 navigator = new CrewMemberA15_2_1("Elvis", CrewMemberA15_2_1.Profession.NAVIGATOR);
        testList.add(navigator);


        Collections.shuffle(testList);
        System.out.println(testList);


        List<CrewMemberA15_2_1> testCrew = new ArrayList<>();
        for (int i = 0; i < Math.min(3, testList.size()); i++) {
            testCrew.add((CrewMemberA15_2_1) testList.get(i));
        }
        System.out.println(testCrew);
        System.out.println(CrewMemberA15_2_1.areSameNumberOfCooksAnMusician(testCrew));

    }
}
