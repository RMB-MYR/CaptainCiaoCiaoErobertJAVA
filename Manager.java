import java.util.Objects;

public class Manager {
    private int gehalt;
    private int alter;

    public Manager(int g, int a){
        this.alter = a;
        this.gehalt = g;
    }


    @Override
    public boolean equals(Object o) {
        // 1. Objektreferenzierung identtisch?
        if (this == o){
            return  true;
        }
        // 2. auf null prüfen
        if (o == null){
            return  false;
        }
        // 3. Klassen identisch ?
        if (getClass() != o.getClass()){
            return false;
        }
        // 4. Typkonventierung
        Manager manager = (Manager) o;
        // 5. Attribute vergleichen
        return this.alter == manager.alter && this.gehalt == manager.gehalt;
    }

    @Override
    public int hashCode(){
        return Objects.hash(alter,gehalt);

    }

    public static void main(String[] args) {
        Manager m1 = new Manager( 10000, 30);
        Manager m2 = new Manager(10000,30);
        System.out.println(m1.equals(m2));
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());


    }
}
