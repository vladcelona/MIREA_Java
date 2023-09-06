package practice_files.second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Computer {
    private String brand;
    private String model;
    private double price;

    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return brand + " " + model + " - $" + price;
    }
}


class Shop {
    private List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public List<Computer> searchComputer(String brand, String model) {
        List<Computer> results = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand) && computer.getModel().equalsIgnoreCase(model)) {
                results.add(computer);
            }
        }
        return results;
    }
}

public class ShopTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        // Ввод данных о компьютерах с клавиатуры
        System.out.println("Введите информацию о компьютерах (бренд, модель, цена). Для завершения введите 'exit'.");
        while (true) {
            System.out.print("Бренд: ");
            String brand = scanner.nextLine();
            if (brand.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Модель: ");
            String model = scanner.nextLine();

            System.out.print("Цена: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Очистка буфера

            Computer computer = new Computer(brand, model, price);
            shop.addComputer(computer);
        }

        // Поиск компьютера
        System.out.print("Введите бренд компьютера для поиска: ");
        String searchBrand = scanner.nextLine();
        System.out.print("Введите модель компьютера для поиска: ");
        String searchModel = scanner.nextLine();

        List<Computer> searchResults = shop.searchComputer(searchBrand, searchModel);

        if (!searchResults.isEmpty()) {
            System.out.println("Результаты поиска:");
            for (Computer result : searchResults) {
                System.out.println(result);
            }
        } else {
            System.out.println("Компьютер не найден.");
        }
    }
}
