package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import model.Game;

public class frameGame extends JFrame {

	public frameGame(Game gameModel) throws HeadlessException {
		super();
		setSize(500, 550);
		setTitle("Find a set!");
		setLayout(new GridLayout(4, 3));
		
		for (int i = 0; i < 12; i++) {
			if (gameModel.getTable().size() > i) {
				add(new panelCard(gameModel.getTable().get(i)));
			} else {
				add(new panelCard(null));
			}
		}
		setVisible(true);
		
		
	}
	
}
