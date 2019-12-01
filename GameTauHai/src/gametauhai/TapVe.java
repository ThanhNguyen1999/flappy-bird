/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametauhai;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TapVe extends JPanel implements Runnable {

	
	public TapVe() {
		
	 Thread threadTV = new Thread(this);
	 threadTV.start();
	}
	
	
	public void paint(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.green);
		g.fillRect(0, 400, getWidth(), getHeight());
		g.setColor(Color.orange);
		g.fillRect(0,410,getWidth(),getHeight());
		
	}

	@Override
	public void run() {
		
		
	}
}

