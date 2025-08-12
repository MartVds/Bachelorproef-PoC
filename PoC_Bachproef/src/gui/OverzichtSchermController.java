package gui;

import domein.DomeinController;
import javafx.scene.layout.GridPane;

public class OverzichtSchermController extends GridPane{
	private DomeinController dc;
	
	private OverzichtSchermTileController ozC1;
	
	private OverzichtSchermTileController ozC2;
	
	private OverzichtSchermTileController ozC3;
	
	private OverzichtSchermTileController ozC4;

	private OverzichtSchermTileController ozC5;

	private OverzichtSchermTileController ozC6;

	
	public OverzichtSchermController(DomeinController dc) {
		this.dc = dc;
		maakGui();
	}

	private void maakGui() {
		ozC1 = new OverzichtSchermTileController(dc, 0);
		this.add(ozC1, 0, 1);
		ozC2 = new OverzichtSchermTileController(dc, 1);
		this.add(ozC2, 1, 1);
		ozC3 = new OverzichtSchermTileController(dc, 2);
		this.add(ozC3, 2, 1);
		ozC4 = new OverzichtSchermTileController(dc, 3);
		this.add(ozC4, 0, 2);
		ozC5 = new OverzichtSchermTileController(dc, 4);
		this.add(ozC5, 1, 2);
		ozC6 = new OverzichtSchermTileController(dc, 5);
		this.add(ozC6, 2, 2);
		this.setVisible(true);
		
	}
}
