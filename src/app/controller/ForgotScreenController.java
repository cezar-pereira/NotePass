package app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import app.Informations;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;

public class ForgotScreenController implements Initializable {
	
	@FXML
    private JFXTextField fieldUser_Pass;
    @FXML
    private JFXTextField fieldKey;
	@FXML
	private Label lblErro;
	@FXML
	private JFXButton btnConfirm;
	@FXML
	private Label lblCommentUser;
	@FXML
	private Label lblCommentPass;
	@FXML
	private Label lblUser;
	@FXML
	private Label lblPass;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		lblErro.setVisible(false);
		lblCommentUser.setVisible(false);
		lblCommentPass.setVisible(false);
		lblUser.setVisible(false);
		lblPass.setVisible(false);
	}
	
	@FXML
	private void verify() {
		
	}
	
	@FXML
	private void cancel() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/app/view/MainScreen.fxml"));
			Informations.stage.setTitle("NotePass");
			Informations.mainScreen.setCenter(root);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
