package app.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import app.Informations;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class MainScreenController implements Initializable {

	@FXML
	private ImageView imgUser;
	@FXML
	private BorderPane mainScreen;
	@FXML
	private JFXTextField userField;
	@FXML
	private JFXPasswordField passPasswordField;
	@FXML
	private JFXTextField textPasswordField;
	@FXML
	private Label labelWrongPassword;
	@FXML
	private JFXButton btnAutentication;
	@FXML
	private CheckBox mostrarSenha;
	@FXML
	private Label labelForgotPass;
	@FXML
	private Label labelRegister;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnAutentication.disableProperty().bind(userField.textProperty().isEmpty()
				.or(passPasswordField.textProperty().isEmpty().or(textPasswordField.textProperty().isEmpty())));

		passPasswordField.textProperty().bindBidirectional(textPasswordField.textProperty());

		try {
			Platform.runLater(() -> Informations.mainScreen = this.mainScreen);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@FXML
	private void autentication() {
		try {
			Informations.nameUser = "Cezar";
			Informations.idUser = 1L;
			Parent root = FXMLLoader.load(getClass().getResource("/app/view/TableScreen.fxml"));
			Informations.mainScreen.setCenter(root);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void showRegisterScreen() {

		try {
			Parent root = FXMLLoader.load(getClass().getResource("/app/view/RegisterScreen.fxml"));
			Informations.stage.setTitle("Registre-se");
			Informations.mainScreen.setCenter(root);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@FXML
	private void funcShowPassword() {
		if (textPasswordField.isVisible()) {
			textPasswordField.setVisible(false);
			passPasswordField.setVisible(true);
			imgUser.requestFocus();
		} else {
			textPasswordField.setVisible(true);
			passPasswordField.setVisible(false);
			imgUser.requestFocus();
		}

	}

	@FXML
	void forgotPassword() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/app/view/ForgotScreen.fxml"));
			Informations.stage.setTitle("Recuperar usuário");
			Informations.mainScreen.setCenter(root);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
