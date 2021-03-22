package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import model.Card;

public class panelCard extends JPanel {
	
	private Card card;

	public panelCard(Card card) {
		this.card = card;
	}

	public void paint(Graphics g) {
		if (card != null) {
			super.paint(g);
			
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(5));
			g.drawRoundRect(10, 10, 80, 120, 20, 20);
			
			g.setColor(Color.white);
			g.fillRoundRect(10, 10, 80, 120, 20, 20);
			
			setTheColor(g);
			
			drawCard(g);
		}	
	}

	private void drawCard(Graphics g) {
		
		for (int i = 0; i < card.getNumber(); i++) {
				switch (card.getShape()) {
				case "oval":
					g.fillOval(20, 55, 60, 30);
					break;
				case "rectangle":
					g.fillRect(20, 55, 60, 30);
					break;
				case "rhombus":
					int[] xPoints = {20,50,80,50};
					int[] yPoints = {70,55,70,85};
					g.fillPolygon(xPoints, yPoints, 4);
					break;
		
				default:
					break;
			}
		}
		
	}

	private void setTheColor(Graphics g) {
		switch(card.getColor()) {
			case "red":
				g.setColor(Color.red);
				break;
			case "green":
				g.setColor(Color.green);
				break;
			case "purple":
				g.setColor(new Color(190, 65, 244));
				break;
			default:
				break;
		}
	}
}
