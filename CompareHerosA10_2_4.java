/*import java.util.*;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CompareHerosA10_2_4 {

    private CompareHerosA10_2_4() { }

    public static class Hero{
        public enum Sex {MALE, FEMALE}

        public final String name;
        public final Sex    sex;
        public final int yearFirstApperance;

        public Hero(String name, Sex sex, int yearFirstApperance){
            this.name = Objects.requireNonNull( name);
            this.sex = Objects.requireNonNull(sex);
            this.yearFirstApperance = yearFirstApperance;
        }

        @Override public String toString() {
            return String.format( " Hero[name=%s, sex=%s, yearsFirstApperance=%s]",name, sex, yearFirstApperance);

        }
    }
    public static class Universe{
        private final String name;
        private final List<Hero> heroes;

        public Universe(String name, List<Hero> heroes){
            this.name = Objects.requireNonNull(name);
            this.heroes = Objects.requireNonNull(heroes);

        }
        public String name() {return name;}
        public Stream<Hero> heroes() {return heroes.stream();}
    }

    private static final Hero DEADPOOL = new Hero("Deadpool (Wade Wilson)", Hero.Sex.MALE,1991);
    private static final Hero Lana_Lang = new Hero("Lana Lang", Hero.Sex.FEMALE,1950);
    private static final Hero THOR = new Hero("Thor (Thor Odinson)", Hero.Sex.MALE,1950);
    private static final Hero IRON_MAN = new Hero("Iron Man (Anthony Stark)", Hero.Sex.MALE,1963);
    private static final Hero SPIDERMAN = new Hero("Spiderman (Peter Parker)", Hero.Sex.MALE,1962);
    private static final Hero WONDER_WOMAN = new Hero("Wonder Woman (Diana Prince)", Hero.Sex.FEMALE,1941);
    private static final Hero CAPTAIN_AMERIKA = new Hero("Captain America (Steve Rogers)", Hero.Sex.MALE,1941);
    private static final Hero SUPERMAN = new Hero("Superman (Clark Kent)", Hero.Sex.MALE,1938);
    private static final Hero BATMAN = new Hero("Batman (Bruce Wayne)", Hero.Sex.MALE,1939);

    public static final List<Hero> DC = Collections.unmodifiableList(Arrays.asList(SUPERMAN,WONDER_WOMAN,Lana_Lang,BATMAN));
    public static final List<Hero> MARVEL = Collections.unmodifiableList(Arrays.asList(DEADPOOL,CAPTAIN_AMERIKA,THOR,IRON_MAN,SPIDERMAN));

    public static final List<Hero> ALL = Collections.unmodifiableList(Stream.concat(DC.stream(),MARVEL.stream()).collect(Collectors.toList()));

    public static final List<Universe> UNIVERSES = Collections.unmodifiableList(Arrays.asList(new Universe("DC",DC),new Universe("MARVEL",MARVEL)));

    Comparator<CompareHerosA10_2_4.Hero> nameComparator = (h1,h2) -> h1.name.compareTo(h2.name);
    Comparator<CompareHerosA10_2_4.Hero> yearComparator = (h1,h2) -> Integer.compare(h1.yearFirstApperance,h2.yearFirstApperance);
    Comparator<CompareHerosA10_2_4.Hero> combinedComparator = yearComparator.thenComparing(nameComparator);

    List<CompareHerosA10_2_4.Hero> allHerosNew = new ArrayList<>(CompareHerosA10_2_4.ALL);
    allHerosNew.sort(combinedComperator);
    System.out.println(allHerosNew);

}

*/
