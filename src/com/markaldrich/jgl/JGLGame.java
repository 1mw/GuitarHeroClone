package com.markaldrich.jgl;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public abstract class JGLGame extends JPanel implements ActionListener {
	/**
	 * Delta timing
	 */
	private long            lastTime    = System.nanoTime();
	private final double    ticks       = 60d; // 30d to achieve 60 updates per second. Right now I'm using 60d to 
	// achieve 120 upates p/second to make everything smoother.
	private double          ns          = 1000000000 / ticks;
	private double          delta       = 0.0d;
	private final int       DELAY       = 1;
	private JGLGameProperties properties;
	
	/**
	 * GamePanel local variables
	 */
	private Timer timer;
	private static boolean[] keysDown = new boolean[999];
	
	public JGLGame(JGLGameProperties props) {
		this.properties = props;
		addKeyListener(new TAdapter());
		setBackground(Color.black);
		setFocusable(true);
		
		setPreferredSize(new Dimension(properties.getGameWidth(), properties.getGameHeight()));
		
		standardInitGame();
	}
	
	public final void standardInitGame() {
		timer = new Timer(DELAY, this);
		timer.start();
		initGame();
	}
	
	public abstract void initGame();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//lastFrame = System.nanoTime();
		long now = System.nanoTime();
		delta += (now - lastTime) / ns;
		lastTime = now;
		if(delta >= 1) {
			update();
			delta--;
		}
		repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		standardRender(g);
	}
	
	public final void standardRender(Graphics graphics) {
		render((Graphics2D) graphics);
		
		// Sync frame
		Toolkit.getDefaultToolkit().sync();
	}
	
	public abstract void render(Graphics2D g);
	
	public abstract void update();
	
	public static boolean checkIfKeyIsDown(int keyCode) {
		return keysDown[keyCode];
	}
	
	public abstract void pressedKey(KeyEvent e);
	public abstract void releasedKey(KeyEvent e);
	
	private class TAdapter extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			keysDown[e.getKeyCode()] = false;
			pressedKey(e);
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			keysDown[e.getKeyCode()] = true;
			releasedKey(e);
			
		}
	}
}
