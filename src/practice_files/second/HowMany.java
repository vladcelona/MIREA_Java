package practice_files.second;

import java.util.Scanner;

public class HowMany {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите текст: ");
        String inputText = scanner.nextLine();

        // Разделяем введенный текст на слова по пробелам
        String[] words = inputText.split("\\s+");

        // Подсчитываем количество слов
        int wordCount = words.length;

        System.out.println("Вы ввели " + wordCount + " слов.");
    }
}
