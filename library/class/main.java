package library.class;

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
			default: 
				System.out.println("Wprowadzona cyfra jest błędna. Spróbuj ponownie!");
				bib.setWybor();
		}
	}

}