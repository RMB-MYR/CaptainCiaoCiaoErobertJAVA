import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityA9_3_1 {

    public final String name;
    public final int popluation;

    public CityA9_3_1(String name, int popluation) {
        this.name = name;
        this.popluation = popluation;


        List<CityA9_3_1> cityTour = new ArrayList<>();
        CityA9_3_1 g = new CityA9_3_1("Gottham (catherdral)", 8000000);
        CityA9_3_1 m = new CityA9_3_1("Metroplois (pleasure garden", 1600000);
        CityA9_3_1 z = new CityA9_3_1("Zootopia (hotel doggy)", 300021);
        Collections.addAll(cityTour, g, m, z);
        System.out.println(cityTour);

        cityTour.removeIf (CityA9_3_1 -> CityA9_3_1.popluation < 1000000);
        System.out.println(cityTour);






    }

    public static void main(String[] args) {
        new CityA9_3_1("Basel", 400000);




    }
}