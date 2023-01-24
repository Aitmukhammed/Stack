package org.example.Stack;

import java.util.Stack;

public class SimpleCardGame {
    private Stack<Card> deck;     // колода
    private Stack<Card> graveyard;   //сброс

    public Card getCardFromDeck(){
        return deck.pop();
    }

    public void discard(Card card){
        graveyard.push(card);
    }

    public Stack<Card> getDeck() {
        return deck;
    }

    public void setDeck(Stack<Card> deck) {
        this.deck = deck;
    }

    public Stack<Card> getGraveyard() {
        return graveyard;
    }

    public void setGraveyard(Stack<Card> graveyard) {
        this.graveyard = graveyard;
    }

    public Card lookTopCard(){
        return deck.peek();
    }

}
