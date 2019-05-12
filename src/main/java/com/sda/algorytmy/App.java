package com.sda.algorytmy;


public class App 
{
    public static void main( String[] args )
    {
        int[] tablica = new int[]{4, 6, 2, 1, 3};
        System.out.println("Maks:" + max(tablica));
        System.out.println("Min:" + min(tablica));

        int min = tablica[0];
        int max = tablica[0];

        for (int el : tablica){
            if (el > max){
                max = el;
            }
            if (el < min){
                min = el;
            }
        }

        System.out.println("Min: " + min + "  Maks: " + max);

    }

    public static int min (int[] tabl){
        int min = tabl[0];
        for (int el : tabl){
            if (el < min){
                min = el;
            }
        } return min;
    }

    public static int max (int[] tabl){
        int max = tabl[0];
        for (int el : tabl){
            if (el > max){
                max = el;
            }
        } return max;
    }
}
