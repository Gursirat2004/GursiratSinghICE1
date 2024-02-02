import java.util.Random;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        Card luckyCard = new Card();
        luckyCard.setValue(7);  
        luckyCard.setSuit("Hearts");  

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }

        Card userCard = luckyCard;

        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                cardFound = true;
                break;
            }
        }

        if (cardFound) {
            System.out.println("Congratulations! The luckyCard is in the magic hand!");
        } else {
            System.out.println("Sorry! The luckyCard is not in the magic hand.");
        }
    }
}


            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])}
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
