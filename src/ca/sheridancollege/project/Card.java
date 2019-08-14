/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * 
 */
package ca.sheridancollege.project;

/**
 *  This class intialize the card numbers and suits 
 * For War Game.
 * 
 */
public class Card {
    
    /* Intializing the suit and card numbers */
    private int value; 
    private int suit; 
    
    
    /*The Constructor*/
    public Card(int s, int gVal){
        value = gVal;
        suit = s;
    }

    //Getters
    
    /**
     * 
     * @return The value (number)
     */
    public int getValue(){
        return value; 
    }
    
    /**
     * @return the suit
     */
    public int getSuit() {
        return suit;
    }

    
    //Setters
    
    /** 
     * 
     * @param gVal 
     */
    public void setValue(int gVal){
        value = gVal;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(int suit) {
        this.suit = suit;
    }
}//end Card Class 

