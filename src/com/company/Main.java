package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        short[] array = new short [25];
        short x, y;
        System.out.println("Массив:");
        for (int i = 0; i<25; i++) {
            array[i]=(short)Math.round(25*Math.random());
            System.out.print(array[i]+", ");
        }
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                short tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        System.out.println("\n" + Arrays.toString(array));
    }
}

