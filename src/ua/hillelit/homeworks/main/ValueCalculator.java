package ua.hillelit.homeworks.main;

import java.awt.event.MouseAdapter;
import java.util.Random;

public class ValueCalculator {
    private int arraySize;
    private double array[];
    private int halfArraySize;
    private double firstHalf[];
    private double secondHalf[];


    public ValueCalculator(double[] array) {
        this.array = array;
        this.arraySize = array.length;
        this.halfArraySize = array.length/2;
        this.firstHalf = this.getFirstHalf(array);
        this.secondHalf = this.getSecondHalf(array);
    }

    static double[] doCalc(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        return array;
    }

    public double[] printArr(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        return array;
    }


    double[] getFirstHalf(double[] array) {
        double arr[] = new double[halfArraySize];
        System.arraycopy(array, 0, arr, 0, halfArraySize);
        for (double a : arr) {
            System.out.print(a + "\t");
        }
        System.out.println();
        return arr;
    }

    double[] getSecondHalf(double[] array) {
        double arr[] = new double[halfArraySize];
        System.arraycopy(array, halfArraySize, arr, 0, halfArraySize);
        for (double a : arr) {
            System.out.print(a + "\t");
        }
        System.out.println();
        return arr;
    }

    double[] changeArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            System.out.print(arr + "\t");
        }
        System.out.println();
        return arr;
    }

    double[] getFullArray(double[] arr1, double[] arr2) {
        double arr[] = new double[arraySize];
        System.arraycopy(arr1, 0, arr, 0, halfArraySize);
        System.arraycopy(arr2, 0, arr, halfArraySize, halfArraySize);
        for (double a : arr) {
            System.out.print(a + "\t");
        }
        System.out.println();
        return arr;
    }

    public double[] getArray() {
        return array;
    }

    public double[] getFirstHalf() {
        return firstHalf;
    }

    public void setFirstHalf(double[] firstHalf) {
        this.firstHalf = firstHalf;
    }

    public double[] getSecondHalf() {
        return secondHalf;
    }

    public void setSecondHalf(double[] secondHalf) {
        this.secondHalf = secondHalf;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArray(double[] array) {
        this.array = array;
    }
}
