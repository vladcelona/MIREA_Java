package practice_files.first;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Command line arguments: ");

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            System.out.print(" ");
        }
    }
}

