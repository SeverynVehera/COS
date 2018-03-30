package edu.lnu.electronics.Lab_1;

import java.util.ArrayList;
import java.util.List;

public class DiscreteConvolution {
    public List<Integer> discreteConvolutionOfSignals(final int[] xArray, final int[] yArray) {
        List<Integer> result = new ArrayList<>();
        int col = (xArray.length + yArray.length) - 1;
        int row = yArray.length;
        int[][] table = new int[row][col];

        //Multiply sequences
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j >= i && j < i + xArray.length) {
                    table[i][j] = yArray[i] * xArray[j - i];
                }
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        //add to result
        for (int j = 0; j < col; j++) {
            int summ = 0;
            for (int i = 0; i < row; i++) {
                summ = summ + table[i][j];
            }
            result.add(summ);
        }
        return result;
    }
}
