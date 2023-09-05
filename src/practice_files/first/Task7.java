package practice_files.first;

import java.util.Scanner;

public class Task7 {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int number = scan.nextInt(); // Здесь можно указать любое число, для которого нужно вычислить факториал
        long factorial = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел");
        }

        long result = 1;
        int i = 1;
        while (i < n + 1) {
            result *= i;
            i++;
        }

        return result;
    }
}
