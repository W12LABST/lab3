package Sortowanie;
import java.io.IOException;
import java.util.Random;//do losowania liczb
import java.util.Scanner;
// Exception niezbędny do robienia pauz w programie poprzez System.in.read(), po wywołaniu tej metody program czeka na reakcję użytkownika.
// Słowo kluczowe "throws" dodane automatycznie przez edytor. Program przechodzi do miejsca obsługi wyjątku
public class Sortowanie {
    public static void main(String[] args) throws IOException {
        while(true) {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int tablica[] = new int[200];//Tworzenie nowej tablicy dwustuelementowej. Tablice są wypełniane losowymi wartościami z zadanego zakresu
            //praktycznie za każdym razem innymi podczas wybrania któregoś z typów sortowania
            for (int i = 0; i < 20; i++) System.out.println(" ");//"czyszczenie" konsoli
            System.out.println("(b)ąbelkowe");
            System.out.println("(k)ubelkowe");
            System.out.println("Wybierz typ sortowania:");
            char wyborUzytkownika = scan.next().charAt(0);//sczytywanie wyboru użytkownika
            if(wyborUzytkownika == 'b'){
                for (int i = 0; i < 20; i++) System.out.println(" ");
                System.out.println("\nZostało wybrane sortowanie babelkowe\n");
                System.out.println("Oryginalna tablica w tym losowaniu:");
                for (int i = 0; i < tablica.length; i++) {
                    tablica[i] = rand.nextInt(10);//wypełnianie tablicy losowymi elementami
                    System.out.print(tablica[i]);
                }
                SortowanieBabelkowe sb1 = new SortowanieBabelkowe();//tworzenie nowego obiektu
                System.out.println("\nTablica po posortowaniu bąbelkowym:");
                int tablicaPosortowanaBabelkowo[] = sb1.sort(tablica);
                for (int i = 0; i < tablica.length; i++) {
                    System.out.print(tablicaPosortowanaBabelkowo[i]);//wyświetlenie zwróconej tablicy
                }
                System.out.println("\nLiczba porównań:\t");
                System.out.print(sb1.step_counting());//wyświetlenie ilości porównań
                System.out.println("\nWcisnij enter aby kontynuować.");
                System.in.read();
            }
            else if(wyborUzytkownika == 'k'){//Mechanizmy w tej części kodu takie same jak w przypadku sortowania bąbelkowego. Różnice znajdują się w klasach
                //obu rodzajów sortowania.
                for (int i = 0; i < 20; i++) System.out.println(" ");
                System.out.println("\nZostało wybrane sortowanie kubełkowe\n");
                System.out.println("Oryginalna tablica w tym losowaniu:");
                for (int i = 0; i < tablica.length; i++) {
                    tablica[i] = rand.nextInt(10);
                    System.out.print(tablica[i]);
                }
                SortowanieKubelkowe sk1 = new SortowanieKubelkowe();
                System.out.println("\nTablica po posortowaniu kubełkowym:");
                int tablicaPosortowanaKubelkowo[] = sk1.sort(tablica);
                for (int i = 0; i < tablica.length; i++) {
                    System.out.print(tablicaPosortowanaKubelkowo[i]);
                }
                System.out.println("\nLiczba porównań:\t");
                System.out.print(sk1.step_counting());
                System.out.println("\nWcisnij enter aby kontynuować.");
                System.in.read();
            } else {
                for (int i = 0; i < 20; i++) System.out.println(" ");
                System.out.println("Niepoprawny znak!\nWciśnij enter aby kontynuować.");
                System.in.read();
            }
        }

    }
}
