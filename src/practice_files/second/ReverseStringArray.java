package practice_files.second;

public class ReverseStringArray {
    public static void main(String[] args) {
        String[] strArray = {"A", "B", "C", "D", "E"};

        int left = 0;
        int right = strArray.length - 1;

        while (left < right) {
            // Меняем местами элементы с индексами left и right
            String temp = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = temp;

            // Перемещаемся к следующим элементам
            left++;
            right--;
        }

        // Выводим массив после обмена элементов
        for (String str : strArray) {
            System.out.print(str + " ");
        }
    }
}
