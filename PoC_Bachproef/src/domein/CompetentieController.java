package domein;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import DTO.CompetentieDTO;
import persitentie.CompetentieMapper;
import persitentie.OefeningMapper;

public class CompetentieController
{
    
    private Competentie[] competenties;
    
    private CompetentieMapper cm;
    private OefeningMapper om;
    
    public CompetentieController()
    {
    	this.cm = new CompetentieMapper();
    	this.om = new OefeningMapper();
    	voegCompetentiesToe();
    	voegOegeningToeTest();    	
    }
    
    
    public String[] getCompetentie(int number) {
    	Competentie temp = competenties[number];
    	String[] competentie = {temp.geefTitel(), temp.geefBeschrijving(), temp.geefTheorie()};
    	return competentie;
    }
    
    public CompetentieDTO geefOverzicht(int nummer) {
    	return competenties[nummer].geefOverzicht();
    }
    
	private void voegCompetentiesToe() {
		competenties = cm.geefCompetenties();
	}
	
	private void voegOegeningToeTest() {
		List<Oefening>[] oefeningen = om.maakOefeningen();
		for(int i = 0; i < competenties.length; i++) {
			for (Oefening o : oefeningen[i])
    		competenties[i].voegOefeningToe(o);

		}
	}
	
	
	public CompetentieDTO volgendeOefening(int nummer) {
		return competenties[nummer].volgendeOefening();
	}
	
	public CompetentieDTO vorigeOefening(int nummer) {
		return competenties[nummer].vorigeOefening();
	}
}