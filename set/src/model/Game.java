package model;

import java.util.ArrayList;
import java.util.Random;

public class Game {

	private ArrayList<Card> allCards;
	private ArrayList<Card> table;
	private Random random;
	
	
	public Game() {
		allCards = new ArrayList<Card>();
		for (int color = 0; color < 3; color++) {
			for (int shape = 0; shape < 3; shape++) {
				for (int fillment = 0; fillment < 3; fillment++) {
					for (int number = 0; number < 3; number++) {
						allCards.add(new Card(Card.color.values()[color], number-1, Card.fillment.values()[fillment], Card.shape.values()[shape]));
					}
				}
			}
		}
		random = new Random();
		table = new ArrayList<Card>();
		
		while(table.size() < 9) {
			
			Card cardToTable = allCards.get(random.nextInt(allCards.size()));
			allCards.remove(cardToTable);
			table.add(cardToTable);
		}
		
		System.out.println("allcards: " + allCards.size() + " table: " + table.size());
	}


	public ArrayList<Card> getTable() {
		return table;
		
	}
}
