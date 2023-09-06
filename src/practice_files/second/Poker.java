package practice_files.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();

        if (numPlayers <= 0) {
            System.out.println("Некорректное количество игроков.");
            return;
        }

        List<String> deck = createDeck();
        shuffleDeck(deck);

        int numCardsPerPlayer = 5;
        int totalCardsToDeal = numPlayers * numCardsPerPlayer;

        if (totalCardsToDeal > deck.size()) {
            System.out.println("Недостаточно карт для раздачи.");
            return;
        }

        for (int i = 0; i < numPlayers; i++) {
            List<String> hand = dealHand(deck, numCardsPerPlayer);
            System.out.println("Игрок " + (i + 1) + ":");
            printHand(hand);
            System.out.println();
        }
    }

    // Создание и возвращение стандартной колоды карт
    private static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"Черви", "Бубны", "Крести", "Пики"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }

    // Перетасовка колоды
    private static void shuffleDeck(List<String> deck) {
        Collections.shuffle(deck);
    }

    // Раздача указанного количества карт из колоды
    private static List<String> dealHand(List<String> deck, int numCards) {
        List<String> hand = new ArrayList<>();

        for (int i = 0; i < numCards; i++) {
            hand.add(deck.remove(0));
        }

        return hand;
    }

    // Вывод карт в руке игрока
    private static void printHand(List<String> hand) {
        for (String card : hand) {
            System.out.println(card);
        }
    }
}
