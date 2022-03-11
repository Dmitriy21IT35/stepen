package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число");
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();

            if (N >= 0) {
                double s = 0;
                    double S = (Math.pow(-1, N)) /(Math.pow(2, N));
                    System.out.println(S);
            }
            else {
                System.out.println("Ошибка!");
            }
        }





}
