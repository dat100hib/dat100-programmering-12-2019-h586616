package no.hvl.dat100.jplab12.oppgave1;

import no.hvl.dat100.jplab12.common.TODO;

public abstract class Innlegg {
	
	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;
	
	
	
	// TODO - deklarering av objektvariable
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		// TODO 
		
		this.id = id; 
		this.bruker = bruker;
		this.dato = dato;
		likes = 0; 
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		
		this.bruker = bruker;
	}

	public String getDato() {
		
		return dato;
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;
	}

	public int getId() {
		
		return id;

	}

	public int getLikes() {
		
		return likes;

	}
	
	public void doLike () {
		
		likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		if (innlegg.getId() == this.id) {
			return true;
		}
			return false;
	}
	
	@Override
	public String toString() {
		
		
		 String text =  id + "\n" + bruker + "\n" + dato + "\n"  + likes + "\n"; 
		 return text; 
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
