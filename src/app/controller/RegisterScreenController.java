package app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import app.Informations;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;

public class RegisterScreenController implements Initializable {

	@FXML
	private JFXButton btnConfirm;
	@FXML
	private Button btnHelp;
	@FXML
	private JFXTextField fieldUser, fieldPassword, fieldWordKey;
	@FXML
	private Label labelSingIn;
	@FXML
	private Label labelRegisterSucess;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		final Tooltip tooltip = new Tooltip();
		tooltip.setText("Palavra chave para \n" + "recuperação de sua conta.");

		btnHelp.setTooltip(tooltip);
		fieldWordKey.setTooltip(tooltip);
		btnConfirm.disableProperty().bind(fieldUser.textProperty().isEmpty()
				.or(fieldPassword.textProperty().isEmpty().or(fieldWordKey.textProperty().isEmpty())));
	}

	@FXML
	void registerUser() {

	}

	private boolean checkForExistence() {
	
		return false;
	}

	void cleanField() {
		fieldPassword.clear();
		fieldUser.clear();
		fieldWordKey.clear();
	}

	@FXML
	void showScreenMain() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/app/view/MainScreen.fxml"));
			Informations.stage.setTitle("NotePass");
			Informations.mainScreen.setCenter(root);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
