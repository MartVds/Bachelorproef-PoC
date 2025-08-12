package gui;

import java.io.IOException;

import DTO.CompetentieDTO;
import domein.DomeinController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class OverzichtSchermTileController extends AnchorPane{
	@FXML
	private Button btnTheorie;
	@FXML
	private Button btnOefeningen;
	@FXML
	private Label lblTitel;
	@FXML
	private Label lblBeschrijving;

	private final DomeinController dc;

	


	public OverzichtSchermTileController(DomeinController dc, int nummer)
	{
		this.dc = dc;
		FXMLLoader loader = new FXMLLoader (this.getClass().getResource("OverzichtSchermTile.fxml"));
		loader.setController(this);
	//	loader.setRoot(this);
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
		lblBeschrijving.setText(competentie.beschrijving());
		btnTheorie.setOnAction(el -> toonTheorie(nummer));
		btnOefeningen.setOnAction(el -> toonOefeningen(nummer));
	}

	private void toonOefeningen(int nummer) {
		OefeningSchermController ts = new OefeningSchermController(dc, nummer);
		Scene scene = new Scene(ts);
		Stage stage = (Stage) this.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

	private void toonTheorie(int nummer) {
		TheorieSchermController ts = new TheorieSchermController(dc, nummer);
		Scene scene = new Scene(ts);
		Stage stage = (Stage) this.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

}
