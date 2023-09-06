package practice_files.second;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттер для имени собаки
    public String getName() {
        return name;
    }

    // Сеттер для имени собаки
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для возраста собаки
    public int getAge() {
        return age;
    }

    // Сеттер для возраста собаки
    public void setAge(int age) {
        this.age = age;
    }

    // Метод для перевода возраста собаки в "человеческий" возраст
    public int calculateHumanAge() {
        return age * 7;
    }

    // Переопределение метода toString для получения описания собаки
    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + "]";
    }
}

class DogKennel {
    private Dog[] dogs;
    private int numberOfDogs;

    public DogKennel(int capacity) {
        dogs = new Dog[capacity];
        numberOfDogs = 0;
    }

    // Метод для добавления собаки в питомник
    public void addDog(Dog dog) {
        if (numberOfDogs < dogs.length) {
            dogs[numberOfDogs] = dog;
            numberOfDogs++;
        } else {
            System.out.println("Питомник переполнен. Невозможно добавить больше собак.");
        }
    }

    // Метод для вывода всех собак в питомнике
    public void listDogs() {
        System.out.println("Список собак в питомнике:");
        for (int i = 0; i < numberOfDogs; i++) {
            System.out.println(dogs[i]);
        }
    }
}

public class DogTask {


    public static void main(String[] args) {
        DogKennel kennel = new DogKennel(3); // Создаем питомник с максимальной вместимостью 3 собаки

        // Добавляем собаки в питомник
        kennel.addDog(new Dog("Барон", 3));
        kennel.addDog(new Dog("Макс", 2));
        kennel.addDog(new Dog("Лайка", 4));

        // Выводим список собак в питомнике
        kennel.listDogs();
    }
}
