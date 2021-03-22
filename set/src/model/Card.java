package model;

public class Card {
	public enum color {red, green, purple}
	public enum fillment {full, dot, empty}
	public enum shape {oval, rectangle, rhombus}
	
	private color cardColor;
	private int cardNumber;
	private fillment cardFillment;
	private shape cardShape;
	
	public Card(color cardColor, int cardNumber, fillment cardFillment, shape cardShape) {
		this.cardColor = cardColor;
		this.cardNumber = cardNumber;
		this.cardFillment = cardFillment;
		this.cardShape = cardShape;
	}

	public String getColor() {
		return cardColor.name();
	}

	public String getShape() {
		return cardShape.toString();
	}

	public int getNumber() {
		return cardNumber;
	}

	
}
