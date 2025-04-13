package blackjack;

import blackjack.GUI_BlackJack.GUI_BlackJack;
import blackjack.Deck_Cards.Deck_Cards;

/**
 * Juan Esteban Pereira
 * Miguel Ángel Pineda
 * Alejandro Gonzalez
 */

public class Main {
    public Main(){      
    }
    public static void main(String[] args) {
        Deck_Cards Game = new Deck_Cards();
        GUI_BlackJack Start = new GUI_BlackJack();
        Start.setVisible(true);
    }
}