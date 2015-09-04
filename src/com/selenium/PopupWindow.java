package com.selenium;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class PopupWindow {
	
	public static boolean createWindow(String title){

		Frame frame = new Frame();

		final JOptionPane optionPane = new JOptionPane(title+ "Do you want the book?",
				JOptionPane.QUESTION_MESSAGE,
				JOptionPane.YES_NO_OPTION);
		

		final JDialog dialog = new JDialog(frame, 
				"Click a button",
				true);
		dialog.setContentPane(optionPane);
		dialog.setDefaultCloseOperation(
				JDialog.DO_NOTHING_ON_CLOSE);
		dialog.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
			System.out.println("Thwarted user attempt to close window.");
			}
		});
		
		optionPane.addPropertyChangeListener(
			    new PropertyChangeListener() {
			        public void propertyChange(PropertyChangeEvent e) {
			            String prop = e.getPropertyName();

			            if (dialog.isVisible() 
			             && (e.getSource() == optionPane)
			             && (prop.equals(JOptionPane.VALUE_PROPERTY))) {
			                //If you were going to check something
			                //before closing the window, you'd do
			                //it here.
			                dialog.setVisible(false);
			            }
			        }
			    });
			dialog.pack();
			dialog.setVisible(true);

		String value = optionPane.getValue().toString();
		//System.out.println(optionPane.getValue().toString());
		if (value.equalsIgnoreCase("0")) {
			return true;
		}
		return false;
		

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
