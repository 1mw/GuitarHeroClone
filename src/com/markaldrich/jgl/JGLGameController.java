package com.markaldrich.jgl;

import com.markaldrich.jgl.JGLGame;

import javax.swing.*;

import java.awt.*;

@SuppressWarnings("serial")
public class JGLGameController extends JFrame {
	public JGLGameProperties properties; 
	public JGLGame gamePanel;
	
	/**
	 * Constructor...
	 */
	public JGLGameController(JGLGame gp, JGLGameProperties properties) {
		gamePanel = gp;
		this.properties = properties;
		add(gamePanel);
		setResizable(false);
		pack();
		setTitle(properties.getGameTitle());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * Main method. Creates an instance of Game.
	 */
	public static void startGame(JGLGame gp, JGLGameProperties props) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame game = new JGLGameController(gp, props);
				game.setVisible(true);
			}
		});
	}
}
