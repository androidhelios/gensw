package com.chadik.gensw;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import com.chadik.gensw.component.GenswLabel;
import com.chadik.gensw.component.GenswLabelMandatory;
import com.chadik.gensw.component.GenswTextField;
import com.chadik.gensw.component.panel.GenswPasswordPanel;

public class AppFrame extends JFrame {

	public AppFrame() {

		setTitle("Gensw");
		setLayout(new BorderLayout());
		setSize(1000, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GenswLabelMandatory genswLabelMandatory = new GenswLabelMandatory(
				"Mandatory");
		GenswTextField genswTextField = new GenswTextField("Text");

		getContentPane().add(new GenswPasswordPanel(), BorderLayout.CENTER);

		setVisible(true);
		setLocationRelativeTo(null);
	}

}
