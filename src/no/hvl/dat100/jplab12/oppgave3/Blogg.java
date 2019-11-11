package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave2.Tekst;

public class Blogg {

	private Innlegg [] innleggTabell;
	private int nesteLedig;

	public Blogg() {
		innleggTabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggTabell = new Innlegg[lengde];
	}

	public int getAntall() {
		
		return nesteLedig;
		
		}
	
	public Innlegg[] getSamling() {
		
		return innleggTabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < innleggTabell.length; i++) {
			if (innlegg.erLik(innleggTabell[i])) {
					return i; 
			}} return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		
		int i = 0; 
		while (innleggTabell[i] != null) {
			if (innleggTabell[i].erLik(innlegg)) {
				return true; 
			}
		i++;
		}
		System.out.println("false");
		return false; 
	}

	public boolean ledigPlass() {
		for (int i = 0; i < innleggTabell.length; i++) {
			if (innleggTabell[i] == null) {
				return true; 
			}
		}
		return false; 	

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if (!finnes(innlegg) && ledigPlass()) {
			innleggTabell[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		}
		return false;
	}
	
	public String toString() {
	
		String utskrift = "" + nesteLedig;
		for (Innlegg i : innleggTabell) {
			if (i instanceof Bilde) {
				Bilde b = (Bilde) i;
				utskrift = utskrift + "\n" + "BILDE\n" + b.getId() + "\n" + b.getBruker() + "\n" + b.getDato() + 
						"\n" + b.getLikes() + "\n" + b.getTekst() + "\n" + b.getUrl();
			}
			else if (i instanceof Tekst) {
				Tekst t = (Tekst) i;
				utskrift = utskrift + "\n" + "TEKST\n" + t.getId() + "\n" + t.getBruker() + "\n" + t.getDato() + 
						"\n" + t.getLikes() + "\n" + t.getTekst();
			}	
		}	
		return utskrift + "\n";
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