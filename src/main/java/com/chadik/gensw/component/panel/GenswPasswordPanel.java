package com.chadik.gensw.component.panel;

import javax.swing.JPanel;

import com.chadik.gensw.component.GenswLabelMandatory;
import com.chadik.gensw.component.GenswTextField;

import net.miginfocom.swing.MigLayout;

public class GenswPasswordPanel extends JPanel {
	
	public GenswPasswordPanel() {
		setLayout(new MigLayout("wrap 4"));
		setSize(1000, 750);
		
		GenswLabelMandatory genswLabelMandatoryUsername = new GenswLabelMandatory("Username: ");
		GenswTextField genswTextFieldUsername = new GenswTextField();
		
		GenswLabelMandatory genswLabelMandatoryPassword = new GenswLabelMandatory("Password: ");
		GenswTextField genswTextFieldPassword = new GenswTextField();
		
		add(genswLabelMandatoryUsername, "cell 1 1");
		add(genswTextFieldUsername, "cell 1 2");
		add(genswLabelMandatoryPassword, "cell 2 1");
		add(genswTextFieldPassword, "cell 2 2");
	}

}
