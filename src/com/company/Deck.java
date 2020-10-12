package com.company;

public class Deck {
    Queue cards = new Queue(120);
    Card c = new Card();


    public Deck() { // deck oluşturup queueya atama
        String s = "";
        for (int i = 0; i < c.getSuits().length(); i++) {
            for (int j = 0; j < c.getRands().length(); j++) {
                if (c.getRands().substring(j, j + 1).equals("1") && c.getRands().substring(j + 1, j + 2).equals("0")) {
                    s = c.getSuits().substring(i, i + 1) + c.getRands().substring(j, j + 2);
                    j++;
                } else {
                    s = c.getSuits().substring(i, i + 1) + c.getRands().substring(j, j + 1);
                }
                cards.enqueue(s);
            }
        }
    }


    public void display() {
        for (int i = 0; i < cards.size(); i++) {
            System.out.print(cards.peek() + " ");
            cards.enqueue(cards.dequeue());
        }
    }

    public Queue getCards() {
        return cards;
    }

    public void setCards(Queue cards) {
        this.cards = cards;
    }

    public Card getC() {
        return c;
    }

    public void setC(Card c) {
        this.c = c;
    }
}