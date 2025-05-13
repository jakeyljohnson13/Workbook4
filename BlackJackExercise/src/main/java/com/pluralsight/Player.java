package com.pluralsight;

public class Player {
    private String name;
    private Hand hand;
    private Deck deck;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
        this.deck = new Deck();
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }
    public int getHandValue(){
        return hand.getValueHand();
    }
    public Hand createHand(Deck deck){
        for (int i=0;i<2;i++){
            hand.cardToHand(deck.deal());
        }
        return hand;
    }
    public void showHand(){
        for (Card cards : getHand().getHandCards()){
            cards.flip();
            System.out.println(getName() + " has " + cards.getValue() + " of " + cards.getSuit());
            cards.flip();
        }
    }
}
