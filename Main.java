public class Main {
    public static void main(String[] args) {

        double wynik = Kalkulator.dodaj(10,15);
        double wynikpom = Kalkulator.pomnonz(13,2);
        double wynikdziel = Kalkulator.podziel(300,20);
        System.out.println(wynik);
        System.out.println(wynikpom);
        System.out.println(wynikdziel);


    }

    class Kalkulator {
        static double dodaj (double a, double b){
            return a + b;
        }
        static double odejmij (double a,double b){
            return a - b;
        }
        static double pomnonz (double a,double b){
            return a * b;
        }
        static double podziel (double a,double b){
            return a / b;
        }
    }
}