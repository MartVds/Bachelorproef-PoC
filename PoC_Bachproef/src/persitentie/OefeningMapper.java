package persitentie;

import java.util.ArrayList;
import java.util.List;

import domein.Oefening;

public class OefeningMapper {

	@SuppressWarnings("unchecked")
	public ArrayList<Oefening>[] maakOefeningen(){
		ArrayList<Oefening>[] oefeningen = (ArrayList<Oefening>[]) new ArrayList[6];
		
		oefeningen[0] = new ArrayList<>();
		oefeningen[1] = new ArrayList<>();
		oefeningen[2] = new ArrayList<>();
		oefeningen[3] = new ArrayList<>();
		oefeningen[4] = new ArrayList<>();
		oefeningen[5] = new ArrayList<>();
		
		oefeningen[0].add(new Oefening("Noem de 4 kenmerken van een mainframe","- Betrouwbaarheid\n- Schaarlbaar\n- Beveiliging\n- Transactiegericht"));
		oefeningen[0].add(new Oefening("test2","test2"));
		oefeningen[0].add(new Oefening("test3","test3"));
		
		
		oefeningen[1].add(new Oefening("Scrhijf een PLI/Programma dat jouw naam en leeftijd toont en aan de hand van het huidig jaar je geboortejaar berekent.","Hier is een voorbeeld van mogelijke code:\nSIMPLEPROG: PROC OPTIONS(MAIN);\r\n"
				+ "\r\n"
				+ "    /* Variabelen declareren */\r\n"
				+ "    DECLARE naam CHAR(30) INIT('Jan Jansen');\r\n"
				+ "    DECLARE leeftijd FIXED DECIMAL(3,0) INIT(35);\r\n"
				+ "    DECLARE huidig_jaar FIXED DECIMAL(4,0) INIT(2025);\r\n"
				+ "    DECLARE geboortejaar FIXED DECIMAL(4,0);\r\n"
				+ "\r\n"
				+ "    /* Berekening uitvoeren */\r\n"
				+ "    geboortejaar = huidig_jaar - leeftijd;\r\n"
				+ "\r\n"
				+ "    /* Uitvoer tonen */\r\n"
				+ "    PUT SKIP LIST('Naam: ', naam);\r\n"
				+ "    PUT SKIP LIST('Leeftijd: ', leeftijd);\r\n"
				+ "    PUT SKIP LIST('Geboortejaar: ', geboortejaar);\r\n"
				+ "\r\n"
				+ "END SIMPLEPROG;"));
		oefeningen[1].add(new Oefening("test2","test2"));
		oefeningen[1].add(new Oefening("test3","test3"));
		
		
		oefeningen[2].add(new Oefening("test","test"));
		oefeningen[2].add(new Oefening("test2","test2"));
		oefeningen[2].add(new Oefening("test3","test3"));
		
		
		oefeningen[3].add(new Oefening("test","test"));
		oefeningen[3].add(new Oefening("test2","test2"));
		oefeningen[3].add(new Oefening("test3","test3"));
		
		
		oefeningen[4].add(new Oefening("test","test"));
		oefeningen[4].add(new Oefening("test2","test2"));
		oefeningen[4].add(new Oefening("test3","test3"));
		
		
		oefeningen[5].add(new Oefening("test","test"));
		oefeningen[5].add(new Oefening("test2","test2"));
		oefeningen[5].add(new Oefening("test3","test3"));
		
		return oefeningen;
	}
}
