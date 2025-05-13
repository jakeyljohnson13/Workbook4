package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("Ben");
        Player player2 = new Player("Jay");
        deck.shuffle();
        player1.createHand(deck);
        player2.createHand(deck);
        player1.showHand();
        player2.showHand();
        if (player1.getHandValue() > 21) {
            if (player2.getHandValue() > 21) {
                System.out.println("Draw! Both players bust.");
            } else System.out.println(player1.getName() + " bust! " + player2.getName() + " wins!");
        } else if (player2.getHandValue() > 21) {
            System.out.println(player2.getName() + " bust!" + player1.getName() + " wins!");
        } else if (player1.getHandValue() > player2.getHandValue()) {
            System.out.println(player1.getName() + " wins with the score: " + player1.getHandValue());
            System.out.println(player2.getName() + " had: " + player2.getHandValue());
        } else {
            System.out.println(player2.getName() + " wins with the score: " + player2.getHandValue());
            System.out.println(player1.getName() + " had: " + player1.getHandValue());
        }
    }

}