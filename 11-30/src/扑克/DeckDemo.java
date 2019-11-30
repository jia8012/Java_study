package 扑克;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class DeckDemo {


    public static class Card {

        public int rank;
        public String color;

        @Override
        public String toString() {
            String valueStr = null;
            if (rank == 1)      valueStr = "A";
            else if (rank > 10) {
                if (rank == 11) {
                    valueStr = "J";
                } else if (rank == 12) {
                    valueStr = "Q";
                } else if (rank == 13) {
                    valueStr = "K";
                }
            } else {
                valueStr = String.valueOf(rank);
            }
            return String.format("(%s,%s)", valueStr, color);
        }
    }

    public static final String[] COLOR = {"♥", "♦", "♠", "♣"};

    public static List<Card> buyDeck() {
        List<Card> deck = new ArrayList<>(52);
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                String color = COLOR[i];
                int rank = j;
                Card card = new Card();
                card.rank = rank;
                card.color = color;
                deck.add(card);
            }
        }
        return deck;
    }


    public static void swap(List<Card> deck, int i, int j) {
        Card tmp = deck.get(i);
        deck.set(i, deck.get(j));
        deck.set(j, tmp);
    }

    private static void shuffle(List<Card> deck) {
        Random random = new Random();
        for (int i = deck.size() - 1; i > 0; i--) {
            int pos = random.nextInt(i);
            swap(deck, i, pos);
        }
    }

    public static void send(List<Card> deck, List<List<Card>> persons, int numberCard, int numberPerson) {

    }

    public static void main(String[] args) {
        List<Card> deck = buyDeck();
        System.out.println(deck);
        shuffle(deck);
        System.out.println(deck);
        List<List<Card>> person = new ArrayList<>();
        person.add(new ArrayList<>());
        person.add(new ArrayList<>());
        person.add(new ArrayList<>());

    }
}
