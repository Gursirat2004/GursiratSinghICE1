/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassexercise1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Nagma
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        scanner scanner = new 
    Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            System.out.print("Enter your Card suit(0-3):");
            int userSuitIndex=scanner.nextInt();
            String userSuit = Card.SUITS[userSuitIndex];
            
            Card userCard = newCard();
            userCard.setValue(userVAlue);
            userCard.setSuit(userSuit);
            
            boolean cardFound = false;
            for(Card card : magicHAnd){
                if(card.equals(userCard)){
                    cardFound =true;
                    break;
                }
            }
            
            if(cardFound){
                System.out.println("Congratulations!Your CArd is in the magic hand!");}
            else{
                System.out.println("Sorry!Your card is not in the magic hand.");
            }
        }
    }
                }
            }
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        //jjj

    }
    
}
