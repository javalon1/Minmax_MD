package com.sda.algorytmy;


public class App 
{
    public static void main( String[] args )
    {
        int[] tablica = new int[]{1, 2, 3, 4, 5};
        System.out.println("Maks:" + max(tablica));
        System.out.println("Min:" + min(tablica));


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
