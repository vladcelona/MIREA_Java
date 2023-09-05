package practice_files.first;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Command line arguments: ");

        for (String arg : args) {
            System.out.print(arg);
            System.out.print(" ");
        }
    }
}

