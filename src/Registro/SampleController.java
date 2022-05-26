package Registro;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;

public class SampleController {
	ObservableList<String> mainDepartmentList = FXCollections.observableArrayList
			("PlayStation®4","PlayStation®5","Nintendo Switch","XboxOne","Xbox Series X");
	
	@FXML Button TextField;
	@FXML ComboBox<String> mainDepartmentBox;
	@FXML 
	private void initialize() {
		
		mainDepartmentBox.setValue("PlayStation®4");
		mainDepartmentBox.setValue("PlayStation®5");
		mainDepartmentBox.setValue("Nintendo Switch");
		mainDepartmentBox.setValue("XboxOne");
		mainDepartmentBox.setValue("Xbox Series X");
		mainDepartmentBox.setItems(mainDepartmentList);
	}
	
	
	
	
	void metodo(MouseEvent event) {
		
	}
	
}
