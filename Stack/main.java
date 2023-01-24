package org.example.Stack;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        // Создаем колоду и добавляем в нее карты
        Stack<Card> deck = new Stack<>();
        deck.push(new Card("Рагнарос"));
        deck.push(new Card("Пират"));
        deck.push(new Card("Сильвана"));
        deck.push(new Card("Миллхаус"));
        deck.push(new Card("Эдвин"));

        // Создаем сброс
        Stack<Card> graveyard = new Stack<>();

        // Начинааем игру
        SimpleCardGame game = new SimpleCardGame();
        game.setDeck(deck);
        game.setGraveyard(graveyard);

        // Первый игрок берет 3 карты из колоды
        Card card1  = game.getCardFromDeck();
        Card card2  = game.getCardFromDeck();
        Card card3  = game.getCardFromDeck();

        System.out.println("Какик карты достались первому игроку?");
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        // Первый игрок отправляет в сброс 3 своих карты
        game.discard(card1);
        game.discard(card2);
        game.discard(card3);

        System.out.println("какие карты находятся в сбросе?");
        System.out.println(game.getGraveyard().pop());
        System.out.println(game.getGraveyard().pop());
        System.out.println(game.getGraveyard().pop());
    }
}
