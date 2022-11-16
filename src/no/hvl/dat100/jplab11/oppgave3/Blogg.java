package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;
 
	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteledig; i++) {
			if(this.innleggtabell[i].erLik(innlegg) == true) {
				return i;
				
			} 
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean sjekk = false;
		int innleggId = innlegg.getId();
		int innleggT;
		
		for (int i = 0; i < nesteledig; i++) {
			innleggT = innleggtabell[i].getId();
			if (innleggId == innleggT) {
				sjekk = true;
				
			}
			
		}
		return sjekk;
	}

	public boolean ledigPlass() {
		boolean ledig;
		
		if (nesteledig < innleggtabell.length) {
			ledig = true;
		
		}else {
			ledig = false;
			
		} 
		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean sjekk;
		
		boolean plass = ledigPlass();
		boolean exist = finnes(innlegg);
		
		if (plass == true && exist == false) {
			this.innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			sjekk = true;
		} else {
			sjekk = false;
		}
		return sjekk;
		
	}
	
	public String toString() {
		String [] tabell = new String[nesteledig];
		String utTxt = nesteledig + "\n";
		
		for(int i = 0; i < nesteledig; i++) {
			
		 tabell[i] = innleggtabell[i] + "";
			
		}
		for(int i = 0; i < tabell.length; i++){
			utTxt += "" + tabell[i].toString();
		}
		
		
		return utTxt;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}