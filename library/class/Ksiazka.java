package library.class;

public class Ksiazka extends Autor{              // wydaje mi się że za "Autor" powinna być {, a później } po Genre, bez tego nie pójdzie
interface Genre {
}
	  private int id;
	  private String tytul;
	  private int liczbaStron;
	  private Autor autor;
	  private int rokWydania;
	  private Genre gatunek;

	//przypisania
	  public void setID(int ID) {
	    this.ID = id;
	  }
	
	  public void setTytul(String tytul) {
	    this.tytul = tytul;
	  }
	/*
	String podajtytul() {                // metoda wywołująca dodanie nowego tytułu ksiazki (do sprawdzenia / poprawienia)
		  Scanner in = new Scanner(System.in);
		  System.out.println("Podaj tytuł nowej ksiązki, którą chcesz dodać");
		  String tytul = in.nextLine();
		  return tytul;
	  }
	  */
	
	  public void setLStron(int liczbastr) {
	     this.liczbastr = liczbaStron;
	  }
	/*
	int podajLstron() {             // metoda wywołująca dodanie liczby stron do ksiązki (do sprawdzenia / poprawienia)
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj liczbę stron nowej ksiązki, którą dodałeś");
		String lStron = in.nextLine();
		int liczbaStron = Integer.parseInt(lStron);
		return liczbaStron;
	 }
	 */
	
	  public void setAutor(Autor autor) {
	    this.autor = autor;
	  }
	
	  public void setLiczbaStron(int liczbaStron) {
	    this.liczbaStron = liczbaStron;
	  }
	
	  public void setRokWydania(int rokWydania) {
		this.rokWydania = rokWydania;
	  }
	
	  public void setGatunek(Genre gatunek) {
	    this.gatunek = gatunek;
	  }
	
	//wywołania
	  public String getTytul() {
	    return tytul;
	  }

	  public int getLiczbaStron() {
	    return liczbaStron;
	  }

	  public Autor getAutor() {
	    return autor;
	  }

	  public int getRokWydania() {
	    return rokWydania;
	  }

	  public Genre getGatunek() {
	    return gatunek;
	  }

	  public Integer getId() {
	    return id;
	  }

}
