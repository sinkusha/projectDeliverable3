/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * 
 */
package ca.sheridancollege.project;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.*;


/**
 *This class is for mechanism of the game
 * how it will be played etc.
 */
public  class GroupOfCards  extends WarGame{
    
    public void playCard(LinkedList<Card> deckCPU,LinkedList<Card> deckP1,String player1)
    {
        while(true){
            
            //creating card objects to compare the values later on
            Card p1Card = deckCPU.pop(); 
            Card p2Card = deckP1.pop();
            
            //display the face up card
            System.out.println(player1 + "\'s card:  " + p1Card.toString());
            System.out.println("Computer's card: " + p2Card.toString());
            
            //Number comparation between two cards
            if(p1Card.getValue() > p2Card.getValue()){                           //if player 1 win 
                deckCPU.addLast(p1Card);                                               //higher value wins both cards and 
                deckCPU.addLast(p2Card);                                                //places them at the bottom of his deck.
                System.out.println(player1 + " Wins");
            }
 
            else if(p1Card.getValue() < p2Card.getValue()){                     //if player 2 win 
                deckP1.addLast(p1Card);   
                deckP1.addLast(p2Card);  
                System.out.println("Computer Wins");
            }
            
            else {                                          //IF both cards are same then WAR!!!
                System.out.println("!!!!WAR!!!!"); 
                
                //creating war cards
                List<Card> war1 = new ArrayList<Card>(); 
                List<Card> war2 = new ArrayList<Card>();
                
                //checking if players have enough (4)cards 
                for(int x=0; x<3; x++){ 
                    
                    //if one player does not have enough cards then he loses automatically
                    
                    if(deckCPU.size() == 0 || deckP1.size() == 0 ){                      
                        break;
                    }
                    
                    
                    System.out.println("War card for " +player1+ " is ||\nWar card for Computer is ||");

                    war1.add(deckCPU.pop());  //place additional cards for war
                    war2.add(deckP1.pop());                  
                }
                
                //only compares of both have enough cards
                if(war1.size() == 3 && war2.size() == 3 ){
                    
                    //display the war cards from each player
                    
                    System.out.println("War card for " +player1 +" is " + war1.get(0).toString());
                    System.out.println("War card for Computer is " + war2.get(0).toString());
                    
                    //if player 1 wins the war round
                    if(war1.get(2).getValue() > war2.get(2).getValue()){
                        deckCPU.addAll(war1); //player1 get all cards
                        deckCPU.addAll(war2);
                        System.out.println("Winner of The War: "+player1);
                    }//end if
                    //otherwise player 2 wins the war round
                    else{
                        deckP1.addAll(war1); //player2 get all cards
                        deckP1.addAll(war2);
                        System.out.println("Winner of the War: Computer");
                    }                      
                }
                
            }            
            //game over either one player runs out of card(deck size is 0)
            if(deckCPU.size() == 0 ){
                System.out.println("............................GAME OVER............................\nWinner: "+ player1);
                break;
            }
            else if(deckP1.size() == 0){
                System.out.println("............................GAME OVER............................\nWinner: Computer.");
                break;
            }
           
        } //end of while loop
        
    }
}
