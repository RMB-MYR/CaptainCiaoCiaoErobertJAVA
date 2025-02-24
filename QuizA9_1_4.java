public class QuizA9_1_4 {
    public class Ackamarakus {
        @FunctionalInterface
        interface Flummadiddle {
            void razzmatazz();

        }
    }

    public static void main(String[] args) {
        Ackamarakus.Flummadiddle a = () -> System.out.println();
        Ackamarakus.Flummadiddle b = () -> {System.out.println(); };
        //Ackamarakus.Flummadiddle c = () -> {System.out.println()};  // fehlendes ;
        Ackamarakus.Flummadiddle d = () -> {System.out.println(); return; };
        //Ackamarakus.Flummadiddle e = -> {System.out.println();}; // fehlendes ()
        //Ackamarakus.Flummadiddle f = _ -> {System.out.println();}; // _ ??
        //Ackamarakus.Flummadiddle g = __ -> {System.out.println();}; // __??
        //Ackamarakus.Flummadiddle h = void -> System.out.println(); //kann nicht links stehen für fehlende Parameterliste
        //Ackamarakus.Flummadiddle i = (void) -> System.out.println();
        Ackamarakus.Flummadiddle j = System.out::println;
    }
}
