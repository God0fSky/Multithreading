package ua.hillelit.homeworks.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ValueCalculator vc = new ValueCalculator(ValueCalculator.doCalc(arrayCreator()));
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1 is working");
                vc.setFirstHalf(vc.changeArray(vc.getFirstHalf()));
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2 is working");
                vc.setSecondHalf(vc.changeArray(vc.getSecondHalf()));
            }
        });
        try{
            thread1.start();
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException main!");
        }
        try{
            thread2.start();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException main!");
        }
        vc.getFullArray(vc.getFirstHalf(), vc.getSecondHalf());
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (finish - start) + " миллисекунд");

    }

    public static double[] arrayCreator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива (не меньше 1 000 000)");
        int arraySize = scanner.nextInt();
        if (arraySize < 1000000) {
            System.out.println("Размер массива должен быть не меньше 1 000 000!");
            arrayCreator();
        }
        double[] array = new double[arraySize];
        return array;
    }
}
