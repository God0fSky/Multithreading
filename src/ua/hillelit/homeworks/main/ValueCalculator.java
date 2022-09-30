package ua.hillelit.homeworks.main;

import java.awt.event.MouseAdapter;
import java.util.Random;

public class ValueCalculator {
    double array[];
    int arraySize;
    int halfArraySize;



    private void doCalc(double[] array) {
        long start = System.currentTimeMillis();
        double a1[] = new double[0];
        double a2[] = new double[0];
        for (double a : array) {
            a = Math.random();
            System.out.print(a + "\t");
        }
        System.out.println();
        System.arraycopy(array, 0, a1, 1, halfArraySize);
        System.arraycopy(array, halfArraySize, a2, 0, halfArraySize);
        for (double a : a1) {
            System.out.print(a + "\t");
        }
        System.out.println();
        for (double a : a2) {
            System.out.print(a + "\t");
        }
    }
}
