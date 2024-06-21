/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose: Below code set's the action event for the buttons.
 *   Project:  CheckBox 
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437 
 *********************************************************************************************/



package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class MainController {
	@FXML
	private CheckBox cb1;
	
	@FXML
	private CheckBox cb2;
	
	@FXML
	private CheckBox cb3;
	
	@FXML
	private CheckBox cb4;
	
	@FXML
	private Label lbllist;
	
	@FXML
	private Label lblcount;
	
	public void checkEvent(ActionEvent event) {
		int count=0;
		String message="";
		if(cb1.isSelected()) {
			count++;
			message +=cb1.getText()+ "\n";
		}
		
		if(cb2.isSelected()) {
			count++;
			message +=cb2.getText()+"\n";
		}
		
		if(cb3.isSelected()) {
			count++;
			message +=cb3.getText()+"\n";
		}
		
		if(cb4.isSelected()) {
			count++;
			message +=cb4.getText()+"\n";
		}
		
		lblcount.setText("Items selected" +count);
		lbllist.setText(message);
	}
	
}
