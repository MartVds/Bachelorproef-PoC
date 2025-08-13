package persitentie;

import domein.Competentie;

public class CompetentieMapper {

	public Competentie[] geefCompetenties() {
		Competentie[] competenties = new Competentie[6];
		competenties[0] = new Competentie("Programmeren en z/OS fundamentals", "Beschrijven opbouw van de mainframeomgeving \nBeschrijven opbouw van een software programma \nBegrijpen veel voorkomende programmeer fenomenen \nNavigeren van z/OS via ISPF", maakTheorie1());
		competenties[1] = new Competentie("Software programming en JCL", "Beheersing van de syntax van gebruikte programmeertalen waaronder JCL \nSchrijven van eenvoudige programmas in de gebruikte programmeertalen \nCompileren van een programma via changeman \nOpstellen van een eenvoudig JCL bestand \nHet creëren en bijhouden van een job aan de hand van een JCL bestand", maakTheorie2());
		competenties[2] = new Competentie("Functioneel programmeren", "Benoemen van de functionaliteiten van een eenvoudig programma \nSchrijven van een eenvoudig programma aan de hand van een lijst van\nfunctionaliteiten", maakTheorie3());
		competenties[3] = new Competentie("Software verbetering", "Oplijsten en analyseren van de onderdelen van een gegeven programma \nOpmerken van fouten in gegeven segmenten van code \nToepassen van gegeven verbetering aan bestaande code", maakTheorie4());
		competenties[4] = new Competentie("Software development", "Omzetten van eenvoudige functionaliteiten naar code", maakTheorie5());
		competenties[5] = new Competentie("Functioneel testen", "Uitvoeren van vooropgestelde testen", maakTheorie6());
		return competenties;
	}
	
    public String maakTheorie1() {
        StringBuilder theorie = new StringBuilder();

        theorie.append("=== Basismainframe-omgeving ===\n\n");

        theorie.append("1. Wat is een mainframe?\n");
        theorie.append("Een mainframe is een krachtige, grootschalige computer die ontworpen is om enorme hoeveelheden data\n");
        theorie.append("te verwerken en grote aantallen gebruikers tegelijk te ondersteunen. Ze worden vaak gebruikt door\n");
        theorie.append("banken, overheden, verzekeringsmaatschappijen en grote bedrijven voor kritieke bedrijfsprocessen.\n\n");

        theorie.append("Kernkenmerken:\n");
        theorie.append("- Betrouwbaarheid (uptime > 99,999%)\n");
        theorie.append("- Schaalbaarheid (van tientallen tot duizenden gelijktijdige gebruikers)\n");
        theorie.append("- Beveiliging (strikte toegangscontrole)\n");
        theorie.append("- Transactiegericht (snelle verwerking van veel kleine bewerkingen)\n\n");

        theorie.append("2. Basisarchitectuur:\n");
        theorie.append("Hardware: De fysieke mainframecomputer (bijv. IBM Z-series)\n");
        theorie.append("Besturingssysteem: Meestal z/OS, z/VM of Linux on Z\n");
        theorie.append("Middleware: Software die communicatie en data-uitwisseling regelt (bijv. CICS, IMS, MQ)\n");
        theorie.append("Toepassingen: Bedrijfskritische programma’s, vaak geschreven in COBOL, PL/I of Java\n");
        theorie.append("Opslag: Geavanceerde schijfsystemen en tape-opslag voor grote datasets\n");
        theorie.append("Netwerk: Verbindingen met terminals, applicatieservers en externe systemen\n\n");

        theorie.append("3. Gebruikersinteractie:\n");
        theorie.append("Traditioneel via green screen terminals (TN3270-emulatie) of moderne webinterfaces/API’s.\n\n");

        theorie.append("4. Typische workloads:\n");
        theorie.append("- Batchverwerking: Grote hoeveelheden data op geplande tijden verwerken\n");
        theorie.append("- Online Transaction Processing (OLTP): Realtime transactieverwerking\n");
        theorie.append("- Databeheer: Opslag, back-ups, disaster recovery\n\n");

        theorie.append("5. Beheer en monitoring:\n");
        theorie.append("- JCL (Job Control Language) voor batchjobs\n");
        theorie.append("- Resource management (CPU, geheugen, I/O)\n");
        theorie.append("- Monitoringtools zoals SDSF, RMF, Omegamon\n\n");

        theorie.append("6. Veiligheid:\n");
        theorie.append("Strikte autorisatie en authenticatie (RACF, ACF2, Top Secret), met beveiligde datasets.\n\n");

        theorie.append("Schema:\n");
        theorie.append("Gebruiker -> Terminal/TN3270 -> Middleware -> Applicatie -> Database/Storage\n");
        theorie.append("                 ^\n");
        theorie.append("          Beheer & Monitoring\n");

        return theorie.toString();
    }
    
    public String maakTheorie2() {
        StringBuilder theorie = new StringBuilder();

        theorie.append("=== Basismainframe-omgeving ===\n\n");

        theorie.append("1. Wat is een mainframe?\n");
        theorie.append("Een mainframe is een krachtige, grootschalige computer die ontworpen is om enorme hoeveelheden data\n");
        theorie.append("te verwerken en grote aantallen gebruikers tegelijk te ondersteunen. Ze worden vaak gebruikt door\n");
        theorie.append("banken, overheden, verzekeringsmaatschappijen en grote bedrijven voor kritieke bedrijfsprocessen.\n\n");

        theorie.append("Kernkenmerken:\n");
        theorie.append("- Betrouwbaarheid (uptime > 99,999%)\n");
        theorie.append("- Schaalbaarheid (van tientallen tot duizenden gelijktijdige gebruikers)\n");
        theorie.append("- Beveiliging (strikte toegangscontrole)\n");
        theorie.append("- Transactiegericht (snelle verwerking van veel kleine bewerkingen)\n\n");

        theorie.append("2. Basisarchitectuur:\n");
        theorie.append("Hardware: De fysieke mainframecomputer (bijv. IBM Z-series)\n");
        theorie.append("Besturingssysteem: Meestal z/OS, z/VM of Linux on Z\n");
        theorie.append("Middleware: Software die communicatie en data-uitwisseling regelt (bijv. CICS, IMS, MQ)\n");
        theorie.append("Toepassingen: Bedrijfskritische programma’s, vaak geschreven in COBOL, PL/I of Java\n");
        theorie.append("Opslag: Geavanceerde schijfsystemen en tape-opslag voor grote datasets\n");
        theorie.append("Netwerk: Verbindingen met terminals, applicatieservers en externe systemen\n\n");

        theorie.append("3. Gebruikersinteractie:\n");
        theorie.append("Traditioneel via green screen terminals (TN3270-emulatie) of moderne webinterfaces/API’s.\n\n");

        theorie.append("4. Typische workloads:\n");
        theorie.append("- Batchverwerking: Grote hoeveelheden data op geplande tijden verwerken\n");
        theorie.append("- Online Transaction Processing (OLTP): Realtime transactieverwerking\n");
        theorie.append("- Databeheer: Opslag, back-ups, disaster recovery\n\n");

        theorie.append("5. Beheer en monitoring:\n");
        theorie.append("- JCL (Job Control Language) voor batchjobs\n");
        theorie.append("- Resource management (CPU, geheugen, I/O)\n");
        theorie.append("- Monitoringtools zoals SDSF, RMF, Omegamon\n\n");

        theorie.append("6. Veiligheid:\n");
        theorie.append("Strikte autorisatie en authenticatie (RACF, ACF2, Top Secret), met beveiligde datasets.\n\n");

        theorie.append("Schema:\n");
        theorie.append("Gebruiker -> Terminal/TN3270 -> Middleware -> Applicatie -> Database/Storage\n");
        theorie.append("                 ^\n");
        theorie.append("          Beheer & Monitoring\n");

        return theorie.toString();
    }
    
    public String maakTheorie3() {
        StringBuilder theorie = new StringBuilder();

        theorie.append("=== Basismainframe-omgeving ===\n\n");

        theorie.append("1. Wat is een mainframe?\n");
        theorie.append("Een mainframe is een krachtige, grootschalige computer die ontworpen is om enorme hoeveelheden data\n");
        theorie.append("te verwerken en grote aantallen gebruikers tegelijk te ondersteunen. Ze worden vaak gebruikt door\n");
        theorie.append("banken, overheden, verzekeringsmaatschappijen en grote bedrijven voor kritieke bedrijfsprocessen.\n\n");

        theorie.append("Kernkenmerken:\n");
        theorie.append("- Betrouwbaarheid (uptime > 99,999%)\n");
        theorie.append("- Schaalbaarheid (van tientallen tot duizenden gelijktijdige gebruikers)\n");
        theorie.append("- Beveiliging (strikte toegangscontrole)\n");
        theorie.append("- Transactiegericht (snelle verwerking van veel kleine bewerkingen)\n\n");

        theorie.append("2. Basisarchitectuur:\n");
        theorie.append("Hardware: De fysieke mainframecomputer (bijv. IBM Z-series)\n");
        theorie.append("Besturingssysteem: Meestal z/OS, z/VM of Linux on Z\n");
        theorie.append("Middleware: Software die communicatie en data-uitwisseling regelt (bijv. CICS, IMS, MQ)\n");
        theorie.append("Toepassingen: Bedrijfskritische programma’s, vaak geschreven in COBOL, PL/I of Java\n");
        theorie.append("Opslag: Geavanceerde schijfsystemen en tape-opslag voor grote datasets\n");
        theorie.append("Netwerk: Verbindingen met terminals, applicatieservers en externe systemen\n\n");

        theorie.append("3. Gebruikersinteractie:\n");
        theorie.append("Traditioneel via green screen terminals (TN3270-emulatie) of moderne webinterfaces/API’s.\n\n");

        theorie.append("4. Typische workloads:\n");
        theorie.append("- Batchverwerking: Grote hoeveelheden data op geplande tijden verwerken\n");
        theorie.append("- Online Transaction Processing (OLTP): Realtime transactieverwerking\n");
        theorie.append("- Databeheer: Opslag, back-ups, disaster recovery\n\n");

        theorie.append("5. Beheer en monitoring:\n");
        theorie.append("- JCL (Job Control Language) voor batchjobs\n");
        theorie.append("- Resource management (CPU, geheugen, I/O)\n");
        theorie.append("- Monitoringtools zoals SDSF, RMF, Omegamon\n\n");

        theorie.append("6. Veiligheid:\n");
        theorie.append("Strikte autorisatie en authenticatie (RACF, ACF2, Top Secret), met beveiligde datasets.\n\n");

        theorie.append("Schema:\n");
        theorie.append("Gebruiker -> Terminal/TN3270 -> Middleware -> Applicatie -> Database/Storage\n");
        theorie.append("                 ^\n");
        theorie.append("          Beheer & Monitoring\n");

        return theorie.toString();
    }
    
    public String maakTheorie4() {
        StringBuilder theorie = new StringBuilder();

        theorie.append("=== Basismainframe-omgeving ===\n\n");

        theorie.append("1. Wat is een mainframe?\n");
        theorie.append("Een mainframe is een krachtige, grootschalige computer die ontworpen is om enorme hoeveelheden data\n");
        theorie.append("te verwerken en grote aantallen gebruikers tegelijk te ondersteunen. Ze worden vaak gebruikt door\n");
        theorie.append("banken, overheden, verzekeringsmaatschappijen en grote bedrijven voor kritieke bedrijfsprocessen.\n\n");

        theorie.append("Kernkenmerken:\n");
        theorie.append("- Betrouwbaarheid (uptime > 99,999%)\n");
        theorie.append("- Schaalbaarheid (van tientallen tot duizenden gelijktijdige gebruikers)\n");
        theorie.append("- Beveiliging (strikte toegangscontrole)\n");
        theorie.append("- Transactiegericht (snelle verwerking van veel kleine bewerkingen)\n\n");

        theorie.append("2. Basisarchitectuur:\n");
        theorie.append("Hardware: De fysieke mainframecomputer (bijv. IBM Z-series)\n");
        theorie.append("Besturingssysteem: Meestal z/OS, z/VM of Linux on Z\n");
        theorie.append("Middleware: Software die communicatie en data-uitwisseling regelt (bijv. CICS, IMS, MQ)\n");
        theorie.append("Toepassingen: Bedrijfskritische programma’s, vaak geschreven in COBOL, PL/I of Java\n");
        theorie.append("Opslag: Geavanceerde schijfsystemen en tape-opslag voor grote datasets\n");
        theorie.append("Netwerk: Verbindingen met terminals, applicatieservers en externe systemen\n\n");

        theorie.append("3. Gebruikersinteractie:\n");
        theorie.append("Traditioneel via green screen terminals (TN3270-emulatie) of moderne webinterfaces/API’s.\n\n");

        theorie.append("4. Typische workloads:\n");
        theorie.append("- Batchverwerking: Grote hoeveelheden data op geplande tijden verwerken\n");
        theorie.append("- Online Transaction Processing (OLTP): Realtime transactieverwerking\n");
        theorie.append("- Databeheer: Opslag, back-ups, disaster recovery\n\n");

        theorie.append("5. Beheer en monitoring:\n");
        theorie.append("- JCL (Job Control Language) voor batchjobs\n");
        theorie.append("- Resource management (CPU, geheugen, I/O)\n");
        theorie.append("- Monitoringtools zoals SDSF, RMF, Omegamon\n\n");

        theorie.append("6. Veiligheid:\n");
        theorie.append("Strikte autorisatie en authenticatie (RACF, ACF2, Top Secret), met beveiligde datasets.\n\n");

        theorie.append("Schema:\n");
        theorie.append("Gebruiker -> Terminal/TN3270 -> Middleware -> Applicatie -> Database/Storage\n");
        theorie.append("                 ^\n");
        theorie.append("          Beheer & Monitoring\n");

        return theorie.toString();
    }
    
    public String maakTheorie5() {
        StringBuilder theorie = new StringBuilder();

        theorie.append("=== Basismainframe-omgeving ===\n\n");

        theorie.append("1. Wat is een mainframe?\n");
        theorie.append("Een mainframe is een krachtige, grootschalige computer die ontworpen is om enorme hoeveelheden data\n");
        theorie.append("te verwerken en grote aantallen gebruikers tegelijk te ondersteunen. Ze worden vaak gebruikt door\n");
        theorie.append("banken, overheden, verzekeringsmaatschappijen en grote bedrijven voor kritieke bedrijfsprocessen.\n\n");

        theorie.append("Kernkenmerken:\n");
        theorie.append("- Betrouwbaarheid (uptime > 99,999%)\n");
        theorie.append("- Schaalbaarheid (van tientallen tot duizenden gelijktijdige gebruikers)\n");
        theorie.append("- Beveiliging (strikte toegangscontrole)\n");
        theorie.append("- Transactiegericht (snelle verwerking van veel kleine bewerkingen)\n\n");

        theorie.append("2. Basisarchitectuur:\n");
        theorie.append("Hardware: De fysieke mainframecomputer (bijv. IBM Z-series)\n");
        theorie.append("Besturingssysteem: Meestal z/OS, z/VM of Linux on Z\n");
        theorie.append("Middleware: Software die communicatie en data-uitwisseling regelt (bijv. CICS, IMS, MQ)\n");
        theorie.append("Toepassingen: Bedrijfskritische programma’s, vaak geschreven in COBOL, PL/I of Java\n");
        theorie.append("Opslag: Geavanceerde schijfsystemen en tape-opslag voor grote datasets\n");
        theorie.append("Netwerk: Verbindingen met terminals, applicatieservers en externe systemen\n\n");

        theorie.append("3. Gebruikersinteractie:\n");
        theorie.append("Traditioneel via green screen terminals (TN3270-emulatie) of moderne webinterfaces/API’s.\n\n");

        theorie.append("4. Typische workloads:\n");
        theorie.append("- Batchverwerking: Grote hoeveelheden data op geplande tijden verwerken\n");
        theorie.append("- Online Transaction Processing (OLTP): Realtime transactieverwerking\n");
        theorie.append("- Databeheer: Opslag, back-ups, disaster recovery\n\n");

        theorie.append("5. Beheer en monitoring:\n");
        theorie.append("- JCL (Job Control Language) voor batchjobs\n");
        theorie.append("- Resource management (CPU, geheugen, I/O)\n");
        theorie.append("- Monitoringtools zoals SDSF, RMF, Omegamon\n\n");

        theorie.append("6. Veiligheid:\n");
        theorie.append("Strikte autorisatie en authenticatie (RACF, ACF2, Top Secret), met beveiligde datasets.\n\n");

        theorie.append("Schema:\n");
        theorie.append("Gebruiker -> Terminal/TN3270 -> Middleware -> Applicatie -> Database/Storage\n");
        theorie.append("                 ^\n");
        theorie.append("          Beheer & Monitoring\n");

        return theorie.toString();
    }
    
    public String maakTheorie6() {
        StringBuilder theorie = new StringBuilder();

        theorie.append("=== Basismainframe-omgeving ===\n\n");

        theorie.append("1. Wat is een mainframe?\n");
        theorie.append("Een mainframe is een krachtige, grootschalige computer die ontworpen is om enorme hoeveelheden data\n");
        theorie.append("te verwerken en grote aantallen gebruikers tegelijk te ondersteunen. Ze worden vaak gebruikt door\n");
        theorie.append("banken, overheden, verzekeringsmaatschappijen en grote bedrijven voor kritieke bedrijfsprocessen.\n\n");

        theorie.append("Kernkenmerken:\n");
        theorie.append("- Betrouwbaarheid (uptime > 99,999%)\n");
        theorie.append("- Schaalbaarheid (van tientallen tot duizenden gelijktijdige gebruikers)\n");
        theorie.append("- Beveiliging (strikte toegangscontrole)\n");
        theorie.append("- Transactiegericht (snelle verwerking van veel kleine bewerkingen)\n\n");

        theorie.append("2. Basisarchitectuur:\n");
        theorie.append("Hardware: De fysieke mainframecomputer (bijv. IBM Z-series)\n");
        theorie.append("Besturingssysteem: Meestal z/OS, z/VM of Linux on Z\n");
        theorie.append("Middleware: Software die communicatie en data-uitwisseling regelt (bijv. CICS, IMS, MQ)\n");
        theorie.append("Toepassingen: Bedrijfskritische programma’s, vaak geschreven in COBOL, PL/I of Java\n");
        theorie.append("Opslag: Geavanceerde schijfsystemen en tape-opslag voor grote datasets\n");
        theorie.append("Netwerk: Verbindingen met terminals, applicatieservers en externe systemen\n\n");

        theorie.append("3. Gebruikersinteractie:\n");
        theorie.append("Traditioneel via green screen terminals (TN3270-emulatie) of moderne webinterfaces/API’s.\n\n");

        theorie.append("4. Typische workloads:\n");
        theorie.append("- Batchverwerking: Grote hoeveelheden data op geplande tijden verwerken\n");
        theorie.append("- Online Transaction Processing (OLTP): Realtime transactieverwerking\n");
        theorie.append("- Databeheer: Opslag, back-ups, disaster recovery\n\n");

        theorie.append("5. Beheer en monitoring:\n");
        theorie.append("- JCL (Job Control Language) voor batchjobs\n");
        theorie.append("- Resource management (CPU, geheugen, I/O)\n");
        theorie.append("- Monitoringtools zoals SDSF, RMF, Omegamon\n\n");

        theorie.append("6. Veiligheid:\n");
        theorie.append("Strikte autorisatie en authenticatie (RACF, ACF2, Top Secret), met beveiligde datasets.\n\n");

        theorie.append("Schema:\n");
        theorie.append("Gebruiker -> Terminal/TN3270 -> Middleware -> Applicatie -> Database/Storage\n");
        theorie.append("                 ^\n");
        theorie.append("          Beheer & Monitoring\n");

        return theorie.toString();
    }
    
}

