import java.util.Objects;

public class PersonA10_1_1 {
    public long id;
    public int age;
    public double income;
    public boolean isDrugLord;
    public String name;

    public PersonA10_1_1(long id, int age, double income, boolean isDrugLord, String name ){
        this.age = age;
        this.income = income;
        this.isDrugLord = isDrugLord;
        this.id = id;
        this.name   = name;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonA10_1_1 that = (PersonA10_1_1) o;

        return id == that.id && age == that.age && Double.compare(income, that.income) == 0 && isDrugLord == that.isDrugLord && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, income, isDrugLord, name);
    }

    public static void main(String[] args) {
        PersonA10_1_1 p1 = new PersonA10_1_1(2345, 45,23000,true, "Fritz");
        PersonA10_1_1 p2 = new PersonA10_1_1(236,23,2500,false,"Klaus");

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }


}
