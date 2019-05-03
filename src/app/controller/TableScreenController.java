package app.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import app.Informations;
import app.model.bean.Service;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public class TableScreenController implements Initializable {

	@FXML
	private TableView<Service> table;

	@FXML
	private ImageView imgUpdate;

	@FXML
	private ImageView imgRemove;

	@FXML
	private ImageView photoUser;

	@FXML
	private Label labelNameUser;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		labelNameUser.setText(Informations.nameUser);
		System.out.println("tabela recebendo nome: " + Informations.nameUser);
	}
	
	
	@FXML
	private void showAddScreen() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/app/view/AddScreen.fxml"));
			Informations.stage.setTitle("Adicionar serviço");
			Informations.mainScreen.setCenter(root);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
