package practice_files.first;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 20, 6, 7}; // Инициализация массива
        int sum = 0;

        for (int number : numbers) {
            sum += number; // Вычисление суммы элементов
        }

        double average = (double) sum / numbers.length; // Вычисление среднего арифметического

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}

