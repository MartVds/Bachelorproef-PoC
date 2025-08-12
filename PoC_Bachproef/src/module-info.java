module poc_BachProef {
	exports gui;
	exports main;
	exports domein;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens main to javafx.fxml, javafx.graphics;
	opens gui to javafx.fxml, javafx.graphics;
}