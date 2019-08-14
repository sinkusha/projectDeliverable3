/**
 * 
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * This class has main method and work as the class
 * that calls all other classes to make a game out of it.
 */
public abstract class WarGame {
    
    public static void main(String[] args) {
        
        //Object for taking user input.
        Scanner in = new Scanner(System.in);
        List<Card> deck = new ArrayList<Card>(); //create an ArrayList.
        
        for(int x=0; x<4; x++){          //0-3 for suit 
            for(int y=2; y<15; y++){     //2-14 for rank 
                deck.add(new Game(x,y)); //create new card  deck
            } //end value for
        }//end suit for
        
        Collections.shuffle(deck, new Random()); //shuffle the deck 
        
        //creating 2 decks, each for player1/player2
        LinkedList<Card> deckCPU = new LinkedList<Card>();
        LinkedList<Card> deckP1 = new LinkedList<Card>();
        
        deckCPU.addAll(deck.subList(0, 25));                        //26 cards        
        deckP1.addAll(deck.subList(26, deck.size()));       //26 cards
        

         //Creating Player Object
         Player self=new Player();
         
        System.out.println("Enter Name Of The Player: ");
        String name=in.nextLine();
        self.setName(name);
        
        //object of GroupOfCards
        GroupOfCards obj = new GroupOfCards();
        
        //stating The Game
        obj.playCard(deckCPU, deckP1, self.getName());
 
    }//end main   
    
}
