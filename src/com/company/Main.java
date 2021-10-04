package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] array = {{12, -23 ,-22}, {4, -3, -2}, {23, 0, 2}};
        int positiveNumbers = 0;
        int negativeNumbers = 0;

        for (int i = 0; i < array.length; i++ ) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0) positiveNumbers++;
                if (array[i][j] < 0) negativeNumbers++;
            }
        }
        System.out.println("Positive numbers = " + positiveNumbers);
        System.out.println("Negative numbers = " + negativeNumbers);

        if (positiveNumbers > negativeNumbers)
            System.out.println("Positive numbers more then negative");
        else if (positiveNumbers == negativeNumbers)
            System.out.println("Same number of positive and negative numbers");
        else
            System.out.println("Negative numbers more then positive");
    }
}
