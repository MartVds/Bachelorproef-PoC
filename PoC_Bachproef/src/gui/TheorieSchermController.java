package gui;

import java.io.IOException;

import DTO.CompetentieDTO;
import domein.DomeinController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TheorieSchermController extends AnchorPane{
	
	private DomeinController dc;
	@FXML
	private Button btnTerug;
	@FXML
	private Button btnOefeningen;
	@FXML
	private Label lblTitel;
	@FXML
	private Label lblText;

	public TheorieSchermController(DomeinController dc, int nummer)
	{
		this.dc = dc;
		FXMLLoader loader = new FXMLLoader (this.getClass().getResource("TheorieScherm.fxml"));
		loader.setController(this);
//		loader.setRoot(this);
		Parent root = null;
		try {
			root = loader.load();
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		this.getChildren().setAll(root);
		buildGui(nummer);
	    this.setVisible(true);
	}
	
	private void buildGui(int nummer)
	{
		CompetentieDTO competentie = dc.geefOverzicht(nummer);
		lblTitel.setText(competentie.titel());
		lblText.setText(competentie.theorie());
		btnTerug.setOnAction(el -> terugNaarOverzicht());
		btnOefeningen.setOnAction(el -> toonOefeningen(nummer));
		
	}
	
	private void terugNaarOverzicht() {
		OverzichtSchermController ts = new OverzichtSchermController(dc);
		Scene scene = new Scene(ts);
		Stage stage = (Stage) this.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
	
	private void toonOefeningen(int nummer) {
		OefeningSchermController ts = new OefeningSchermController(dc, nummer);
		Scene scene = new Scene(ts);
		Stage stage = (Stage) this.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
}
