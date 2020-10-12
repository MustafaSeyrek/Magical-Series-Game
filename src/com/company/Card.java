package com.company;

public class Card {

    String suits = "HSCD";
    String rands = "A2345678910JQK";

    public Card(String rand, String suit) {
        this.rands = rand;
        this.suits = suit;
    }

    public Card() {
    }

    public String getSuits() {
        return suits;
    }

    public void setSuits(String suits) {
        this.suits = suits;
    }

    public String getRands() {
        return rands;
    }

    public void setRands(String rands) {
        this.rands = rands;
    }

    public String toString() {
        return "\t" + rands + suits;
    }
}