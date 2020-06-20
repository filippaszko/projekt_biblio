package library.class;

public class Ksiazka {
	  private Integer id;
	  private String tytul;
	  private Integer liczbaStron;
	  private autor autor;
	  private Integer rokWydania;
	  private Gatunek gatunek;

	  public String getTytul() {
	    return tytul;
	  }

	  public void setTytul(String tytul) {
	    this.tytul = tytul;
	  }

	  public Integer getLiczbaStron() {
	    return liczbaStron;
	  }

	  public void setLiczbaStron(Integer liczbaStron) {
	    this.liczbaStron = liczbaStron;
	  }

	  public autor getAutor() {
	    return autor;
	  }

	  public void setAutor(autor autor) {
	    this.autor = autor;
	  }

	  public Integer getRokWydania() {
	    return rokWydania;
	  }

	  public void setRokWydania(Integer rokWydania) {
		this.rokWydania = rokWydania;
	  }

	  public Gatunek getGatunek() {
	    return gatunek;
	  }

	  public void setGatunek(Gatunek gatunek) {
	    this.gatunek = gatunek;
	  }

	  public Integer getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
	  }
}
