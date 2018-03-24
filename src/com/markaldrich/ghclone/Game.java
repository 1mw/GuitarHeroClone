package com.markaldrich.ghclone;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

import com.markaldrich.jgl.JGLGame;
import com.markaldrich.jgl.JGLGameController;
import com.markaldrich.jgl.JGLGameProperties;
import com.markaldrich.stdaudio.StdAudio;

public class Game extends JGLGame {

	

	/*
	 * private Sound[] bitmap = { Sound.G, null, null, null, Sound.G, null,
	 * Sound.E, Sound.C, null, Sound.E, null, Sound.E, Sound.E, };
	 */
	
	
	// Mario
	private Sound[][] bitmap = {
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{Sound.LB, 	null, 		null, 		null, 		null},
		{null, 		null, 		Sound.D, 	null, 		null},
		{null, 		Sound.C,	null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		Sound.E,	null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		Sound.G, 	null},
		{null, 		null, 		Sound.F, 	null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		Sound.A},
		{null, 		null, 		null, 		Sound.G, 	null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		Sound.C, 	null, 		null, 		null},
		{Sound.LG, 	null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		Sound.A, 	null, 		null},
		{null, 		null, 		null, 		Sound.A$, 	null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		Sound.B},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		Sound.A, 	null,	 	null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{Sound.LE, 	null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null,	 	null, 		null, 		null, 		null},
		{null, 		Sound.LG, 	null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		Sound.C, 	null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{Sound.LB, 	null, 		null, 		null, 		null},
		{null, 		null, 		Sound.D, 	null, 		null},
		{null, 		Sound.C,	null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		Sound.E,	null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		Sound.G, 	null},
		{null, 		null, 		Sound.F, 	null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		Sound.A},
		{null, 		null, 		null, 		Sound.G, 	null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		Sound.C, 	null, 		null, 		null},
		{Sound.LG, 	null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		Sound.A, 	null, 		null},
		{null, 		null, 		null, 		Sound.A$, 	null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		Sound.B},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		Sound.A, 	null,	 	null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{Sound.LE, 	null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null,	 	null, 		null, 		null, 		null},
		{null, 		Sound.LG, 	null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		Sound.C, 	null, 		null},
		{null, 		null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null}, 
		{null, 		null, 		null, 		null, 		null}, 
		{Sound.LG,	null, 		null, 		null, 		null},
		{null, 		null, 		null, 		null, 		null}, 
		{null, 		null, 		null, 		null, 		null}, 
		{null, 		null, 		null, 		null, 		null}, 
		{null, 		null, 		null, 		null, 		Sound.G},
		{null, 		null, 		null, 		null, 		null}, 
		{null, 		null, 		Sound.E, 	null, 		null}, 
		{null, 		Sound.C, 	null, 		null, 		null}, 
		{null,		null, 		null, 		null, 		null},
		{null, 		null, 		Sound.E, 	null, 		null}, 
		{null, 		null, 		null, 		null, 		null}, 
		{null, 		null, 		Sound.E, 	null, 		null}, 
		{null, 		null, 		Sound.E,	null, 		null},
	};
	
	/*
	// Shredding
		private Sound[][] bitmap = {
			{null, 		null, 		Sound.E, 	null, 		null}, 
			{null, 		null, 		null, 		Sound.F, 	null}, 
			{null, 		null, 		null, 		null, 		Sound.G}, 
			{null, 		null, 		Sound.E, 	null, 		null}, 
			{null, 		null, 		null, 		Sound.F, 	null}, 
			{null, 		null, 		null, 		null, 		Sound.G}, 
			{null, 		null, 		Sound.E, 	null, 		null}, 
			{null, 		null, 		null, 		Sound.F, 	null}, 
			{null, 		null, 		null, 		null, 		Sound.G}, 
			{null, 		null, 		Sound.E, 	null, 		null}, 
			{null, 		null, 		null, 		Sound.F, 	null}, 
			{null, 		null, 		null, 		null, 		Sound.G}, 
			{null, 		null, 		Sound.E, 	null, 		null}, 
			{null, 		null, 		null, 		Sound.F, 	null}, 
			{null, 		null, 		null, 		null, 		Sound.G}, 
			{null, 		null, 		Sound.E, 	null, 		null}, 
			{null, 		null, 		null, 		Sound.F, 	null}, 
			{null, 		null, 		null, 		null, 		Sound.G}, 
			{null, 		null, 		Sound.E, 	null, 		null}, 
			{null, 		null, 		null, 		Sound.F, 	null}, 
			{null, 		null, 		null, 		null, 		Sound.G}, 
			{null, 		null, 		Sound.E, 	null, 		null}, 
			{null, 		null, 		null, 		Sound.F, 	null}, 
			{null, 		null, 		null, 		null, 		Sound.G}, 
			{null, 		null, 		Sound.E, 	null, 		null}, 
			{null, 		null, 		null, 		Sound.F, 	null}, 
			{null, 		null, 		null, 		null, 		Sound.G}, 
			{null, 		null, 		Sound.E, 	null, 		null}, 
			{null, 		null, 		null, 		Sound.F, 	null}, 
			{null, 		null, 		null, 		null, 		Sound.G}, 
			{null, 		null, 		Sound.E, 	null, 		null}, 
			{null, 		null, 		null, 		Sound.F, 	null}, 
			{null, 		null, 		null, 		null, 		Sound.G}, 
			{null, 		null, 		Sound.E, 	null, 		null}, 
			{null, 		null, 		null, 		Sound.F, 	null}, 
			{null, 		null, 		null, 		null, 		Sound.G}, 
			{null, 		null, 		Sound.E, 	null, 		null}, 
			{null, 		null, 		null, 		Sound.F, 	null}, 
			{null, 		null, 		null, 		null, 		Sound.G}, 
			{null, 		null, 		Sound.E, 	null, 		null}, 
			{null, 		null, 		null, 		Sound.F, 	null}, 
			{null, 		null, 		null, 		null, 		Sound.G}, 
		};*/
	
	private JGLGameProperties props;
	private final static int TEMPO = 2;
	private final int LENIENCY = 15;
	
	private static final double NOTE_LENGTH = 0.07d;

	private int time = -(bitmap.length * 32);
	
	/*
	// chords
	private Sound[][] bitmap = {
			{Sound.G, 	null, 	null, 		null, 		null},
	};*/

	

	public Game(JGLGameProperties props) {
		super(props);
		this.props = props;
	}

	public static void main(String[] args) {
		Game game = null;
		try {
			JGLGameProperties props = new JGLGameProperties("Guitar Hero Clone", 320, 320);
			game = new Game(props);
			JGLGameController.startGame(game, props);
		} finally {

		}
	}

	@Override
	public void initGame() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics2D g) {
		renderBitmap(g);
		
		
		// Render squares
		for(int i = 0; i < 5; i++) {
			g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (checkIfKeyIsDown(resolveKey(i))) ? 0.6f : 0.2f));
			g.setColor(resolveColor(i));
			g.fillRect(i * 32, props.getGameHeight() - 32, 32, 32);
		}
		g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));

		g.setColor(Color.WHITE);
		g.drawLine(0, props.getGameHeight() - 32, props.getGameWidth(), props.getGameHeight() - 32);
	}
	
	public static int resolveKey(int i) {
		switch(i) {
		case 0:
			return KeyEvent.VK_1;
		case 1:
			return KeyEvent.VK_2;
		case 2:
			return KeyEvent.VK_3;
		case 3:
			return KeyEvent.VK_4;
		case 4:
			return KeyEvent.VK_5;
		default:
			return 0;
		}
	}

	@Override
	public void update() {
		time += TEMPO;
		/*if((time + 80) % (120 / TEMPO) == 0) {
			Toolkit.getDefaultToolkit().beep();
		}*/
	}

	private void renderBitmap(Graphics2D g) {
		for(int i = 0; i < bitmap.length; i++) {
			for(int j = 0; j < bitmap[0].length; j++) {
				if(bitmap[i][j] != null) {
					g.setColor(resolveColor(j));
					g.fillOval((j * 32), (i * 32 + time - 128), 32, 32);
				}
			}
		}
	}
	
	public static Color resolveColor(int i) {
		switch(i) {
		case 0:
			return Color.GREEN;

		case 1:
			return Color.RED;

		case 2:
			return Color.YELLOW;

		case 3:
			return Color.BLUE;

		case 4:
			return Color.MAGENTA;

		default:
			return null;
		}
	}

	@Override
	public void pressedKey(KeyEvent e) {
		/*
		 * for(int i = 0; i < bitmap.length; i++) { for(int j = 0; i <
		 * bitmap[0].length; i++) { if(bitmap[i][j] != null && Math.abs((i * 32
		 * + time) - (props.getGameHeight()) - (64)) < LENIENCY) { new
		 * Thread(new SoundRunnable(bitmap[i][j])).start(); bitmap[i] = null; }
		 * } }
		 */

		// Iterate through each line
		for(int i = 0; i < bitmap.length; i++) {
			if(Math.abs((i * 32 + time) - (props.getGameHeight()) - (80)) < LENIENCY) {
				for(int j = 0; j < 5; j++) {
					if(e.getKeyCode() == resolveKey(j)) {
						if(bitmap[i][j] != null) {
							new Thread(new SoundRunnable(bitmap[i][j])).start();
							bitmap[i][j] = null;
						}
					}
				}
			}
		}
	}

	public static class SoundRunnable implements Runnable {

		private Sound s;

		public SoundRunnable(Sound s) {
			this.s = s;
		}

		@Override
		public void run() {
			try {
				StdAudio.close();
				StdAudio.init();
				playSound(s);
			} catch(Exception e) {
				
			}
			// Toolkit.getDefaultToolkit().beep();
		}
	}

	public static void playSound(Sound s) {
		switch(s) {
		case A:
			StdAudio.play(StdAudio.note(440, NOTE_LENGTH, 0.5));
			break;
		case A$:
			StdAudio.play(StdAudio.note(466.16, NOTE_LENGTH, 0.5));
			break;
		case B:
			StdAudio.play(StdAudio.note(493.88, NOTE_LENGTH, 0.5));
			break;
		case B$:
		case C:
			StdAudio.play(StdAudio.note(261.63, NOTE_LENGTH, 0.5));
			break;
		case C$:
			StdAudio.play(StdAudio.note(0, NOTE_LENGTH, 0.5));
			break;
		case D:
			StdAudio.play(StdAudio.note(0, NOTE_LENGTH, 0.5));
			break;
		case D$:
			StdAudio.play(StdAudio.note(0, NOTE_LENGTH, 0.5));
			break;
		case E:
			StdAudio.play(StdAudio.note(329.63, NOTE_LENGTH, 0.5));
			break;
		case E$:
		case F:
			StdAudio.play(StdAudio.note(349.23, NOTE_LENGTH, 0.5));
			break;
		case F$:
			StdAudio.play(StdAudio.note(739.99, NOTE_LENGTH, 0.5));
			break;
		case G:
			StdAudio.play(StdAudio.note(392, NOTE_LENGTH, 0.5));
			break;
		case G$:
			break;
		case LG:
			StdAudio.play(StdAudio.note(196, NOTE_LENGTH, 0.5));
			break;
		case LG$:
			break;
		case LE:
			StdAudio.play(StdAudio.note(164.81, NOTE_LENGTH, 0.5));
			break;
		case LE$:
			break;
		case LF:
			StdAudio.play(StdAudio.note(174.61, NOTE_LENGTH, 0.5));
			break;
		case LF$:
			break;
		case LB:
			StdAudio.play(StdAudio.note(246.94, NOTE_LENGTH, 0.5));
			break;
		case LB$:
			break;
		}
	}

	@Override
	public void releasedKey(KeyEvent e) {

	}
}
