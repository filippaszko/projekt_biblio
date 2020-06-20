package library.class
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		System.out.println("Witaj w naszej Bibliotece! Poniżej zaprezentujemy Ci wszystkie możliwości działania.");
		System.out.println("W naszej bibliotece możesz:");
		
		Biblioteka bib = new Biblioteka();
		
		System.out.println(bib.getMenu());
		System.out.println();
		
		switch(bib.setWybor()) {
			case 1:
				//coścoścoś
				System.out.println("Wybrałeś dodanie książki do biblioteki.");
				System.out.println("Dodanie książki wymaga dodania autora, tytułu, roku wydania, liczby stron i gatunku.");
				System.out.println("Podaj tytuł.");
				Scanner in = new Scanner(System.in);
				String tytul = in.nextLine();
				System.out.println("Podaj imię autora.");
				String imie = in.nextLine();
				System.out.println("Podaj nazwisko autora.");
				String nazwisko = in.nextLine();
				System.out.println("Podaj rok wydania.");
				String rok = in.nextLine();
				System.out.println("Podaj liczbę stron");
				String lstr = in.nextLine();
				System.out.println("Podaj gatunek");
				String genre = in.nextLine();
				
				System.out.println("Książka została pomyślnie do katalogu.");
				System.out.println(bib.getMenu());
				System.out.println(bib.setWybor());
				break;
			case 2:
				//coścoścoś
				System.out.println("Wybrałeś dodanie autora do biblioteki.");
				break;
			case 3:
				//coś coś coś
				System.out.println("Wybrałeś dodanie użytkownika do biblioteki.");
				break;
			case 4:
				//coś coś coś
				System.out.println("Wybrałeś dodanie gatunku książki do biblioteki.");
				break;
			case 5: 
				// coś coś coś
				System.out.println("Wybrałeś sprawdzenie rejestru wypożyczeń.");
				break;
			case 0:
				System.out.println("Dziękujemy za skorzystanie z naszych usług. Zapraszamy ponownie!");
				break;
			default: 
				System.out.println("Wprowadzona cyfra jest błędna. Spróbuj ponownie!");
				bib.setWybor();
		}
	}

}
