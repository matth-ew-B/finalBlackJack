/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

/**
 *
 * @author matth
 */
public class cards {

    protected String name;
    protected String suit;
    protected int num;
    //the name of the imagefile for each card
    String img;

    public cards(int sut, int nm) {
        num = nm;
        String sNum;
        sNum = num + "";
        switch (sut) {
            case 0:
                suit = "clubs";
                img = "C";
                break;
            case 1:
                suit = "spades";
                img = "S";
                break;
            case 2:
                suit = "diamonds";
                img = "D";
                break;
            case 3:
                suit = "hearts";
                img = "H";
                break;
        }
        switch (num) {
            default:
                img = num + img;
                break;
            case 1:
                sNum = "ace";
                img = "A" + img;
                break;
            case 11:
                sNum = "jack";
                img = "J" + img;
                break;
            case 12:
                sNum = "queen";
                img = "Q" + img;
                break;
            case 13:
                sNum = "king";
                img = "K" + img;
                break;
        }

        name = sNum + " of " + suit;
    }
}
