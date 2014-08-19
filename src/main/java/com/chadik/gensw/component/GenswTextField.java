package com.chadik.gensw.component;

import java.awt.Insets;

import javax.swing.JTextField;

public class GenswTextField extends JTextField {

	public GenswTextField() {
		setMargin(new Insets(2, 2, 2, 2));
	}
	
	public GenswTextField(String text) {
		setText(text);
		setMargin(new Insets(2, 2, 2, 2));
	}
}
