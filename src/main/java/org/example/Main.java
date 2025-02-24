package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Получение первого числа
        System.out.println("Введите первое число: ");
        int number1 = new Scanner(System.in) .nextInt();
        //Получение второго числа
        System.out.println("Введите второе число: ");
        int number2 = new Scanner(System.in) .nextInt();
        //Сложение
        int sum = number1 + number2;
        System.out.println("Сумма: " + sum);
        //Вычитание
        int subtraction = number1 - number2;
        System.out.println("Вычитание: " + subtraction);
        //Деление
        double quotient = (double) number1 / number2;
        System.out.println("Частное: " + quotient);
        //Умножение
        int multiplication = number1 * number2;
        System.out.println("Произведение: " + multiplication);
    }
}
