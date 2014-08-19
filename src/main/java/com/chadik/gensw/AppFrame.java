package com.chadik.gensw;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class AppFrame extends JFrame {

	public AppFrame() {
		setTitle("Gensw");
		setLayout(new BorderLayout());
		setSize(1000, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

}
