package com.pluralsight;
import java.util.ArrayList;


public class Hand {
    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<>();
    }

    // A Card is dealt to the Hand and the Hand is responsible
    // to store the card
    public void cardToHand(Card card){
        hand.add(card);
    }

    public int getSize(){
        return hand.size();
    }
    public ArrayList<Card> getHandCards(){
        return hand;
    }
    // The Hand uses the methods of each card to determine
    // the value of each card - and adds up all values
    public int getValueHand(){
        int value = 0;

        for(Card card: hand){
            card.flip(); // turn the card over to see the value
            value += card.getPointValue();
            card.flip(); // hide the card again
        }

        return value;
    }
}
