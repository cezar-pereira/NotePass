package app.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import app.Informations;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class AddScreenController {

	@FXML
	public void initialize() {
		btnConfirm.disableProperty().bind(fieldUser.textProperty().isEmpty().or(fieldPassword.textProperty().isEmpty().or(description.textProperty().isEmpty())));
	}

	@FXML
	private JFXButton btnConfirm;
	@FXML
	private JFXTextField fieldUser;

	@FXML
	private JFXTextField fieldPassword;

	@FXML
	private JFXTextArea description;

	@FXML
	void cancel() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/app/view/TableScreen.fxml"));
			Informations.stage.setTitle("NotePass");
			Informations.mainScreen.setCenter(root);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	void save() {

	}

}
