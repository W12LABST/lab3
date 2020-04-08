package Sortowanie;
//implements Sortable oznacza, że ta klasa została zaimplementowana na podstawie interfejsu Sortable
public class SortowanieBabelkowe implements Sortable {

    private double licznikPorownanBabelkowe = 0;//zmienna zadeklarowana w tym miejscu aby mozna było jej uzyć w obu metodach
    //@Override - adnotacja użyta do oznaczania metod interfejsu
    @Override
    public int[] sort(int[] tab) {
        int x = 0;//zmienna służąca do przechowywania podmienianego elementu tablicy
        int y = 1;
        while(y > 0){
            y = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                licznikPorownanBabelkowe++;//zliczanie ilości porównań
                if (tab[i] > tab[i + 1]) {
                    x = tab[i + 1];//podmiana elementu i-tego na i + 1 gdy jest on od niego większy oraz wstawienie w miejsce i + 1, i-tego elementu
                    tab[i + 1] = tab[i];
                    tab[i] = x;
                    y++;//trigger służący do poinformowania algorytmu o konieczności wykonania kolejnego cyklu porównania elementów tablicy
                        //gdy instrukcja warunkowa nie zostanie uruchomiona y będzie równe 0 i sortowanie się skończy
                }
            }
        }
        return tab;//zwracanie posortowanej tablicy
    }

    @Override
    public double step_counting() {
        return licznikPorownanBabelkowe;
    }//zwracanie ilości porównań
}
