package edu.lnu.electronics.Lab_1;

public class Lab1_Main {

    public static void main(String[] args) {
        DiscreteConvolution dc = new DiscreteConvolution();

        // Set 1
        int[] xK1 = {3, 5, 7};
        int[] yK1 = {6, 3, 3};
        System.out.println("Set 1");
        System.out.println(dc.discreteConvolutionOfSignals(xK1, yK1));
        System.out.println();

        // Set 2
        int[] xK2 = {3, 5, 7, 3};
        int[] yK2 = {4, 1, 5, 7};
        System.out.println("Set 2");
        System.out.println(dc.discreteConvolutionOfSignals(xK2, yK2));
        System.out.println();

        // Set 3
        int[] xK3 = {6, 4, 7, 8, 1, 1, 5};
        int[] yK3 = {5, 3, 6, 7, 1, 0};
        System.out.println("Set 3");
        System.out.println(dc.discreteConvolutionOfSignals(xK3, yK3));

    }


}
