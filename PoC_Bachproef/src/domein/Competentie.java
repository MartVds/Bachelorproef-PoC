package domein;

import java.util.ArrayList;
import java.util.List;

import DTO.CompetentieDTO;
import DTO.OefeningDTO;

public class Competentie {
	private String titel;
	private String beschrijving;
	private String theorie;
	private List<Oefening> oefeningen;
	private int huidigeOefening=0;
	
	public Competentie(String titel, String beschrijving, String theorie) {
		this.titel = titel;
		this.beschrijving = beschrijving;
		this.oefeningen = new ArrayList<>();
		this.theorie = theorie;
	}
	
	public String geefTitel() {
		return this.titel;
	}
	
	public String geefBeschrijving() {
		return this.beschrijving;
	}
	
	public String geefTheorie() {
		return this.theorie;
	}
	
	public void voegOefeningToe(Oefening oefening) {
		this.oefeningen.add(oefening);
	}
	
	public CompetentieDTO geefOverzicht() {
		return new CompetentieDTO(titel, beschrijving, theorie, this.oefeningen.get(huidigeOefening).geefOverzicht(), huidigeOefening==0, huidigeOefening==oefeningen.size()-1);
	}
	
	public CompetentieDTO volgendeOefening() {
		if (huidigeOefening < oefeningen.size()-1)
			this.huidigeOefening = huidigeOefening + 1;
		return geefOverzicht();
	}
	
	public CompetentieDTO vorigeOefening() {
		if (huidigeOefening > 0)
			this.huidigeOefening = huidigeOefening - 1;
		return geefOverzicht();
	}

}
