package library.class;

public class main {

	public static void main(String[] args) {

		System.out.println("Witaj w naszej Bibliotece! Poniżej zaprezentujemy Ci wszystkie możliwości działania.");
		System.out.println("W naszej bibliotece możesz:");
		
		Biblioteka bib = new Biblioteka();
		Ksiazka nowytytul = new Ksiazka();
		Ksiazka liczbaStron = new Ksiazka();
		
		System.out.println(bib.getMenu());
		System.out.println();
		
		switch(bib.setWybor()) {
			case 1:
				//coścoścoś
				System.out.println("Wybrałeś dodanie książki do biblioteki.");   // wypisanie dodanych funkcji (do sprawdzenia / poprawienia)
				System.out.println("Dodanie książki wymaga dodania, tytułu, roku wydania, liczby stron i gatunku.");
				System.out.println("Podaj tytuł.");
				Scanner in = new Scanner(System.in);
				String tytul = in.nextLine();
				//tytul=nowytytul.getTytul();
				System.out.println("Podaj rok wydania.");
				String rok = in.nextLine();
				System.out.println("Podaj liczbę stron");
				String liczbastron = in.nextLine();
				System.out.println("Podaj gatunek");
				String genre = in.nextLine();

				System.out.println("Książka: "+"'"+bib.getKsiazki()+"'"+" została pomyślnie dodana do katalogu.\n\n");
				break;
			case 2:
				//coścoścoś
				System.out.println("Wybrałeś dodanie autora do biblioteki.");
				/*
				Do usprawnienia opcja wyświetlania książek, wcześniej dodanych do biblioteki, tak aby po wyborze danej książki umożliwić dodanie jej 
				nowego autora
				
				System.out.println("Dla której z poniższych książek chcesz dodać autora?\n");
				//String  = in.nextLine();
				Scanner inn = new Scanner(System.in);
				ArrayList<String> someTytul = new ArrayList<String>();
				someTytul.add(Ksiazka.getTytul());
	
				Iterator<String> listaksiazek = ((ArrayList<String>) someTytul).iterator();
				while(listaksiazek.hasNext()) {
				 System.out.println ((listaksiazek).next());
				}
				*/
				String tytulautor = inn.nextLine();
					
				System.out.println("Podaj imię autora.");
				String imie = inn.nextLine();
				System.out.println("Podaj nazwisko autora.");
				String nazwisko = inn.nextLine();
				System.out.println("Nowy autor dla książki:" + tytulautor+ "to:" + imie + " " + nazwisko);
				
				break;
			case 3:
				//coś coś coś
				System.out.println("Wybrałeś dodanie użytkownika do biblioteki.");
				System.out.println("Podaj imię nowego użytkownika.\n");
				Scanner scanUser = new Scanner(System.in);
				String imieUser = scanUser.nextLine();
				
				System.out.println("Podaj nazwisko nowego użytkownika.\n");
				String nazwiskoUser = scanUser.nextLine();
				
				System.out.println("Podaj pesel użytkownika.\n");
				String pesel = scanUser.nextLine();
				
				System.out.println("Wpisz K - jeśli nowy użytkownik to Kobieta\n"
						+ "Wpisz M - jesli nowy użytkownik to Mężczyzna");
				String plec = scanUser.nextLine();
				
				System.out.println("Nowy użytkownik biblioteki to: " +imieUser+ " " + nazwiskoUser + " | " + pesel+ " | " +plec);
				break;
			case 4:
				//coś coś coś
				System.out.println("Wybrałeś dodanie gatunku książki do biblioteki.");
				
				//Do usprawnienia opcja wyświetlenia książek wcześniej dodanych, dla których można dodać nowy gatunek
				
				ArrayList<String> listaGenre = new ArrayList<String>();
				// Poniższe elementy zostaną dodane do listy
				listaGenre.add("1. Fantasy\n");
				listaGenre.add("2. Dramat\n");
				listaGenre.add("3. Sensacja\n");
				listaGenre.add("4. Romans\n");
				listaGenre.add("5. Kryminał\n");
				listaGenre.add("6. Thriller\n");
				listaGenre.add("7. Horror\n");
				listaGenre.add("8. Dokumentalny\n");
				listaGenre.add("9. Science fiction\n");
				listaGenre.add("10. Komedia\n");
				
				System.out.println("Dostępne gatunki to: \n"+ listaGenre);
				
				System.out.println("Który gatunek książki chcesz dodać? \n");
				Scanner scanGenre = new Scanner(System.in);
				String Genre = scanGenre.nextLine();
				
				System.out.println("Nowy gatunek dla książki:   to: " + Genre);
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
