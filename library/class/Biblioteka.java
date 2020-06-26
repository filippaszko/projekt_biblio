package library.class;
import java.util.Scanner;

public class Biblioteka {

	
	static String menu = "1. Dodać książkę do biblioteki,\n2,2. Dodać autora do biblioteki,\n3. Dodać użytkownika biblioteki,\n4. Dodać gatunek książki, \n5. Sprawdzić rejestr wypożyczeń.";
	
	public int setWybor() {
		Scanner in = new Scanner(System.in);
		System.out.println("Aby wybrać, co chcesz zrobić, podaj odpowiedni numer (1-5)");
		String opcja = in.nextLine();
		int wybor = Integer.parseInt(opcja);
		return wybor;
	}
	
	// Poniżej konstruktory dla klasy Kasizka. Trzeba to zastosować w mainie tak aby dodać tytuł , liczbe stron itp i żeby zwróciło liste książek
	public Biblioteka() {
	    this.ksiazki = new ArrayList<>();
	    this.uzytkownicy = new ArrayList<>();
	    this.rejestrWypozyczen = new ArrayList<>();
	    
	}
	    
	    public void dodajKsiazke(Ksiazka ksiazka){
	        ksiazka.setId(idGenerator);
	        idGenerator = idGenerator +1;
	        this.ksiazki.add(ksiazka);
			
			
	      }
	  
	    public List<Ksiazka> getKsiazki() {
	        return ksiazki;
	    }
	
	public static String getMenu() {
		return menu;
	}
	
	
}
