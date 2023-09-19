package org.lessons.java.library;

public class Libro {
	private String titolo;
	private int pagine;
	private String autore;
	private String editore;
	
	public Libro(String titolo, int pagine, String autore, String editore) throws Exception {
		setTitolo(titolo);
		setPagine(pagine);
		setAutore(autore);
		setEditore(editore);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) throws Exception {
		
		if(titolo.isBlank())
			throw new Exception("il titolo non puo' essere vuoto");
		
		this.titolo = titolo;
	}

	
	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) throws Exception {
		
		if(!(pagine>0))
			throw new Exception("il numero di pagine deve essere maggiore di 0");
		
		this.pagine = pagine;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws Exception {
		
		if(autore.isBlank())
			throw new Exception("l'autore non puo' essere vuoto");
		
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) throws Exception {
		
		if(editore.isBlank())
			throw new Exception("l'editore non puo' essere vuoto");
		
		this.editore = editore;
	}
	
	@Override
	public String toString() {
		return "Libro [titolo= " + titolo + ", pagine= " + pagine + ", autore= " + autore + ", editore= " + editore + "]";
	}

}
