package poker;

import poker.model.Deck;
import poker.model.Player;
import poker.model.Suits;
import poker.model.Values;

import java.util.Arrays;
import java.util.Scanner;

public class MainPoker {
    public static void main(String[] args) {


        printSuits();

        printValues();

        Deck deck = generateDeck();

        shufleDeck(deck);

        /////////////////
        //Если нужно отсортировать, то раскомментить
        //Arrays.sort(deck.getCards());
        //deck.printDeck();
        /////////////////
        Integer playersCount = inputPlayersCount();



        if (playersCount > 0) {
            Player[] players = initPlayers(playersCount);


            Integer currentPlayer = 0;
            for (int i = 0; i < deck.getCards().length; i++) {
                if (players[currentPlayer].getCardCount() < 5) {
                    players[currentPlayer].addCard(deck.getCards()[i]);
                }
                currentPlayer++;

                if (currentPlayer == playersCount) {
                    currentPlayer = 0;
                }
            }

            for (int i = 0; i < playersCount; i++) {
                players[i].printCards();
                System.out.println();
            }
        } else {
            System.out.println("Wrong players number");
        }

        System.out.println("Для сортировки нужно раскомментить блок");

    }

    private static Player[] initPlayers(Integer playersCount) {
        Player[] players = new Player[playersCount];

        for (int i = 0; i < playersCount; i++) {
            players[i] = new Player();

        }
        return players;
    }

    private static Integer inputPlayersCount() {
        System.out.println("Please, input count of players:");
        Scanner sc = new Scanner(System.in);
        String  userInput = sc.next();
        Integer playersCount = 0;
        try {
            playersCount = Integer.parseInt(userInput);
        } catch (Exception e) {
            e.printStackTrace();
            playersCount = -1;
        }
        return playersCount;
    }

    private static void shufleDeck(Deck deck) {
        deck.shuffledeck();
        System.out.println();
        System.out.println("Shuffled Deck:");
        deck.printDeck();
    }

    private static Deck generateDeck() {
        System.out.println("Generated Deck:");
        Deck deck = new Deck();
        deck.printDeck();
        System.out.println();
        return deck;
    }

    private static void printValues() {
        System.out.println("Values:");
        for (String str:Values.getValues()){
            System.out.print(str);
            System.out.print(" ");
        }
        System.out.println();
    }

    private static void printSuits() {
        System.out.println("Suits:");
        for (String str:Suits.getSuits()){
            System.out.print(str);
        }
        System.out.println();
    }
}
