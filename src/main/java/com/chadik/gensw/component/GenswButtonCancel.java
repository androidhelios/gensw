package com.chadik.gensw.component;

import java.awt.Color;

public class GenswButtonCancel extends GenswButton {
	
	public GenswButtonCancel() {
		setForeground(new Color(204, 0, 0));
	}
	
	public GenswButtonCancel(String text) {
		setText(text);
		setForeground(new Color(204, 0, 0));
	}
}
