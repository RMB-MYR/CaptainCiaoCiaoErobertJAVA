import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

// Task: In each crew, there have to be the same amount of cooks and musicians.
// If not, it will be a "false" crew

public class CrewMemberA15_2_1 {
    enum Profession {CAPTAIN, NAVIGATOR, CARPENTER, COOK, MUSICIAN, DOCTOR}

    String name;
    Profession profession;

    CrewMemberA15_2_1(String name, Profession profession) {
        this.name = name;
        this.profession = profession;
    }

    public static boolean areSameNumberOfCooksAnMusician(List <CrewMemberA15_2_1> crew) {
        int numberCooks = 0;
        int numberMusicians = 0;

        for (CrewMemberA15_2_1 member : crew){
            if (member.profession == Profession.COOK){
                numberCooks ++;}

            if (member.profession == Profession.MUSICIAN){
                numberMusicians ++;}
        }
        if (numberMusicians == numberCooks) {
            return true;
        }
        else {
            return false;
        }



    }

public static void main(String[] args) {

    CrewMemberA15_2_1 captain = new CrewMemberA15_2_1("RMB-MYR", CrewMemberA15_2_1.Profession.CAPTAIN);
    CrewMemberA15_2_1 cook1 = new CrewMemberA15_2_1("Remy", CrewMemberA15_2_1.Profession.COOK);
    CrewMemberA15_2_1 musician1 = new CrewMemberA15_2_1("MC$", CrewMemberA15_2_1.Profession.MUSICIAN);
    CrewMemberA15_2_1 cook2 = new CrewMemberA15_2_1("Tim Cook", CrewMemberA15_2_1.Profession.COOK);
    CrewMemberA15_2_1 musician2 = new CrewMemberA15_2_1("DJ JAVA", CrewMemberA15_2_1.Profession.MUSICIAN);

    List<CrewMemberA15_2_1> crew1 = Arrays.asList(cook1, musician1, captain, musician2);
    System.out.println(areSameNumberOfCooksAnMusician(crew1));
    List<CrewMemberA15_2_1> crew2 = Arrays.asList(cook2, cook2, captain);
    System.out.println(areSameNumberOfCooksAnMusician(crew2));
    List<CrewMemberA15_2_1> crew3 = Arrays.asList(cook1, captain,musician2);
    System.out.println(areSameNumberOfCooksAnMusician(crew3));
    }
}

