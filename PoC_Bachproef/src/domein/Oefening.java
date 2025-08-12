package domein;

import DTO.OefeningDTO;

public class Oefening {
	private String opgave;
	
	private String oplossing;
	
	public Oefening(String opgave, String oplossing) {
		this.opgave = opgave;
		this.oplossing = oplossing;
	}
	
	public String[] geefOefening() {
		return new String[]{this.opgave, this.oplossing};
	}
	
	public OefeningDTO geefOverzicht() {
		return new OefeningDTO(opgave, oplossing);
	}
}
