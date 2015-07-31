package com.hackbulgaria.programming51.week8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Canvas extends JPanel {

	public static int WIDTH = 800;
	public static int HEIGHT = 800;

	public static int SQUARE_WIDTH = 400;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		// an example
		/*
		 * Rectangle2D.Double upLeftSquare = new Rectangle2D.Double(0, 0,
		 * SQUARE_WIDTH, SQUARE_WIDTH); Rectangle2D.Double upRightSquare = new
		 * Rectangle2D.Double(400, 0, SQUARE_WIDTH, SQUARE_WIDTH);
		 * Rectangle2D.Double downLeftSquare = new Rectangle2D.Double(0, 400,
		 * SQUARE_WIDTH, SQUARE_WIDTH); Rectangle2D.Double downRightSquare = new
		 * Rectangle2D.Double(400, 400, SQUARE_WIDTH, SQUARE_WIDTH);
		 * 
		 * g2.setPaint(Color.GREEN); g2.fill(upLeftSquare);
		 * g2.setPaint(Color.black); g2.fill(upRightSquare);
		 * g2.setPaint(Color.MAGENTA); g2.fill(downLeftSquare);
		 * g2.setPaint(Color.cyan); g2.fill(downRightSquare);
		 */

		int squareX = 0;
		int squareY = 0;
		int squareWidth = 40;
		int counterSwitch = 0;

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				Rectangle2D.Double square = new Rectangle2D.Double(
						squareX, squareY, squareWidth, squareWidth);
				System.out.println(squareX + ", " +squareY);
				if (counterSwitch == 0 || counterSwitch % 2 == 0) {
					g2.setPaint(Color.BLACK);
					g2.fill(square);
				} else {
					g2.setPaint(Color.WHITE);
					g2.fill(square);
				}
				counterSwitch++;
				squareX = squareX + 40;
			}
			squareX = 0;
			squareY = squareY + 40;
			if (i == 0 || i % 2 == 0) {
				counterSwitch = 1;
			} else {
				counterSwitch = 0;
			}
		}
	}

	public Canvas() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
}