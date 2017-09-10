package com.company;

public class BinarySearch implements SearchAlgorithm {

    @Override
    public int search(int[] T, int e) {
        int L = 0;
        int P = T.length - 1;                    //koniec tablicy - musi byc -1 bo jest od 0 tablica
        while (L < P) {
            int c = (L + P) / 2;
            if (T[c] < e) {
                L = c + 1;
            } else {
                P = c;

            }

        }

        return L;
    }

    public static void main(String[] args) {
        int[] tablica = new int[9];
        int a = 5;
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i;
            //System.out.println(tablica[i]);

        }
        int[] table2 = {1, 2, 3, 4, 5, 5, 5, 7, 8, 9};
        int[] table3 = {1, 2, 3, 4, 6, 7, 8, 9, 10};           // znajduje srodek blizej prawej strony


        BinarySearch b = new BinarySearch();
        b.search(tablica, a);
        System.out.println(b.search(tablica, a));
        System.out.println(b.search(table2, a));
        System.out.println(b.search(table3, a));            //znajduje nr indeksu
    }


    @Override
    public int search(int[] T) {
        return 0;
    }
}
