package domein;

import DTO.CompetentieDTO;

public class DomeinController 
{
	private CompetentieController competenitecontroller;
	
	public DomeinController()
	{
		competenitecontroller = new CompetentieController();
	}

	
	public String[] geefCompetentie(int nummer) {
		return competenitecontroller.getCompetentie(nummer);
	}
	
	public CompetentieDTO geefOverzicht(int nummer) {
		return competenitecontroller.geefOverzicht(nummer);
	}
	
	public CompetentieDTO volgendeOefening(int nummer) {
		return competenitecontroller.volgendeOefening(nummer);
	}
	
	public CompetentieDTO vorigeOefening(int nummer) {
		return competenitecontroller.vorigeOefening(nummer);
	}
}