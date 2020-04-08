package Sortowanie;
//implements Sortable oznacza, że ta klasa została zaimplementowana na podstawie interfejsu Sortable
public class SortowanieKubelkowe implements Sortable {

    private double licznikPorownanKubelkowe = 0;//zmienna zadeklarowana w tym miejscu aby mozna było jej uzyć w obu metodach
//@Override - adnotacja użyta do oznaczania metod interfejsu
    @Override
    public int[] sort(int[] tab) {
        int tablicaPosortowanaKubelkowo[] = new int[tab.length];//Nowa tablica, w której bedą składowane posortowane liczby. W przeciwieństwie
        //do sortowania bąbelkowego wygodniej było mi utworzyć nową tablice zamiast podmieniąc elementy w obecnej
        int min = tab[0];//szukanie wart min, max w celu ustalenia ilości potrzebnych kubełków
        int max = tab[0];
        for(int i=1;i<tab.length;i++) {
            if (min > tab[i])
                min = tab[i];
        }
        for(int i=1;i<tab.length;i++) {
            if (max < tab[i])
                max = tab[i];
        }
        //zmienne służące do ustalania wielkości zawartości kubełków
        int wypelnianieKubelkaNrN = 0;//koniec zakresu
        int wypelnianieKubelkaNrN2 = 0;//początek zakresu
        int kubelek = max - min;//brak +1, ponieważ pętla idzie od 0 do (max - min) włącznie
        for(int i = 0; i <= kubelek; i++){
            for(int j = 0; j < tab.length; j++){
                licznikPorownanKubelkowe++;//zliczanie ilości porównań
                if(tab[j] == i){
                    wypelnianieKubelkaNrN++;//zliczanie ilości wystąpień danej wartości + ustalanie końca zakresu obecnego kubełka
                }
            }
            for(int k = wypelnianieKubelkaNrN2; k < wypelnianieKubelkaNrN; k++){
                tablicaPosortowanaKubelkowo[k] = i;//wypełnianie nowej tablicy zgodnie z zakresami
            }
            wypelnianieKubelkaNrN2 =+ wypelnianieKubelkaNrN;//ustalanie początku zakresu nastepnego kubełka
        }
        return tablicaPosortowanaKubelkowo;//zwracanie posortowanej tablicy
    }

    @Override
    public double step_counting() {
        return licznikPorownanKubelkowe;//zwracanie ilości porównań
    }
}
