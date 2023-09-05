package practice_files.first;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Ввод элементов массива с клавиатуры
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int i = 0;
        do {
            sum += numbers[i]; // Вычисление суммы элементов
            if (numbers[i] > max) {
                max = numbers[i]; // Поиск максимального элемента
            }
            if (numbers[i] < min) {
                min = numbers[i]; // Поиск минимального элемента
            }
            i++;
        } while (i < n);

        // Второй вариант с использованием цикла while
        // int i = 0;
        // while (i < n) {
        //     sum += numbers[i];
        //     if (numbers[i] > max) {
        //         max = numbers[i];
        //     }
        //     if (numbers[i] < min) {
        //         min = numbers[i];
        //     }
        //     i++;
        // }

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
