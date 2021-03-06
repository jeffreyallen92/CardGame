/***************************************************************
Names       : Jeffrey Allen
Class       : CS315, Graphical User Interface
Assignment  : Assignment 1, Card Game
Description : Deck of cards
***************************************************************/
import java.util.ArrayList;

public class Deck extends CardStack {

	// ~~~~~~~~~~~~~~~~~~Constructors~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	/*==============================================================
	Writer     : Jeffrey Allen
	Purpose    : Constructor
	Params     : N/A
	Return     : N/A
	===============================================================*/
	Deck()
	{
		// Make slots for cards to go into
		cardStack = new ArrayList<Card>();
		
		// Put cards into slots
	 	for(int suit = Card.SPADES; suit <= Card.CLUBS; suit++)
	 	{ 
	 		for (int value = 1; value <= 13; value++)
	 		{ 
	 			cardStack.add(new Card(suit,value));
	 			top++;
	 		} 
		}	
	 	
	 	// Shuffle deck
	 	shuffle();
	}	
		
}
