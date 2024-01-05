package ru.gb.main;

import ru.gb.functions.Average;
import ru.gb.functions.Print;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.println();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.println("Среднее арифметическое чисел");
        Print.print(Average.average(num1, num2));
    }
}
