package Sortowanie;
//Na podstawie tego interfejsu zostały zaimplementowane klasy SortowanieBabelkowe oraz SortowanieKubelkowe
public interface Sortable {
    int[] sort(int[] tab);//metoda sortująca
    double step_counting();//metoda zliczająca porównania
}
