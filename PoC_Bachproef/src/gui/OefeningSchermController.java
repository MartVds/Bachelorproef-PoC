package gui;

import java.io.IOException;

import DTO.CompetentieDTO;
import DTO.OefeningDTO;
import domein.DomeinController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class OefeningSchermController extends AnchorPane{
	@FXML
	private Label lblTitel;
	@FXML
	private Label lblOpgave;
	@FXML
	private Label lblOplossing;
	@FXML
	private Button btnTerug;
	@FXML
	private Button btnOplossing;
	@FXML
	private Button btnVolgende;
	@FXML
	private Button btnTheorie;
	@FXML
	private Button btnVorige;	
	
	private DomeinController dc;
	


	public OefeningSchermController(DomeinController dc, int nummer)
	{
		this.dc = dc;
		FXMLLoader loader = new FXMLLoader (this.getClass().getResource("OefeningScherm.fxml"));
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
		OefeningDTO huidigeOef = competentie.oefening();
		lblTitel.setText(competentie.titel());
		lblOpgave.setText(huidigeOef.opgave());
		lblOplossing.setText(huidigeOef.oplossing());
		lblOplossing.setVisible(false);
		btnTheorie.setOnAction(el -> toonTheorie(nummer));
		btnTerug.setOnAction(el -> terugNaarOverzicht());
		btnVolgende.setOnAction(el -> volgendeOef(nummer));
		btnVorige.setOnAction(el -> vorigeOefening(nummer));
		btnVolgende.setVisible(!competentie.laasteOef());
		btnVorige.setVisible(!competentie.eersteOef());
		btnOplossing.setOnAction(el -> toonOplossing());
	}
	
	private void vorigeOefening(int nummer) {
		try{
			verbergOplossing();
			dc.vorigeOefening(nummer);
			CompetentieDTO competentie = dc.geefOverzicht(nummer);
			OefeningDTO huidigeOef = competentie.oefening();
			lblOpgave.setText(huidigeOef.opgave());
			lblOplossing.setText(huidigeOef.oplossing());
			btnVolgende.setVisible(!competentie.laasteOef());
			btnVorige.setVisible(!competentie.eersteOef());
		}
		catch (Exception e){
			
		};
	}

	private void toonOplossing() {
		lblOplossing.setVisible(true);
		btnOplossing.setText("Verberg");
		btnOplossing.setOnAction(el -> verbergOplossing());
	}

	private void verbergOplossing() {
		lblOplossing.setVisible(false);
		btnOplossing.setText("Oplossing");
		btnOplossing.setOnAction(el -> toonOplossing());
	}

	private void volgendeOef(int nummer) {
		try{
			verbergOplossing();
			dc.volgendeOefening(nummer);
			CompetentieDTO competentie = dc.geefOverzicht(nummer);		
			OefeningDTO huidigeOef = competentie.oefening();
			lblOpgave.setText(huidigeOef.opgave());
			lblOplossing.setText(huidigeOef.oplossing());
			btnVolgende.setVisible(!competentie.laasteOef());
			btnVorige.setVisible(!competentie.eersteOef());
		}
		catch (Exception e){
			
		};
	}

	private void toonTheorie(int nummer) {
		TheorieSchermController ts = new TheorieSchermController(dc, nummer);
		Scene scene = new Scene(ts);
		Stage stage = (Stage) this.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
	
	private void terugNaarOverzicht() {
		OverzichtSchermController ts = new OverzichtSchermController(dc);
		Scene scene = new Scene(ts);
		Stage stage = (Stage) this.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
}
