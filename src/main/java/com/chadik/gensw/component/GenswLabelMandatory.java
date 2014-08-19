package com.chadik.gensw.component;

import java.awt.Color;

public class GenswLabelMandatory extends GenswLabel {
	
	public GenswLabelMandatory() {
		setForeground(new Color(204, 0, 0));
	}
	
	public GenswLabelMandatory(String text) {
		setText(text);
		setForeground(new Color(204, 0, 0));
	}

}
