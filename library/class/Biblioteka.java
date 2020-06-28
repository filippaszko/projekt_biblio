package library.class;
/**
Klasa biblioteka jest głównym modułem programu, zawierającym w sobie komplet pętli oraz instrukcji warunkowych. Klasa dziedziczy po klasie Ksiazka i implementuje interfejs Genre na potrzeby obsługi biblioteki.
**/
import java.util.*;

public class Biblioteka extends Ksiazka implements Genre { 

  Scanner in = new Scanner(System.in);

  int genreChoice = 0;

 static String menuGlowne="1. Dodać książkę do biblioteki,\n2. Dodać autora do biblioteki,\n3. Dodać użytkownika biblioteki,\n4. Dodać gatunek książki,\n5. Sprawdzić rejestr biblioteczny,\n6. Zakończyć program.";

 static String menu1 = "1. Wypełnij dane samodzielnie,\n2. Wypełnij losowo przez system\n3. Wróć do menu głównego.";

 static String menu2 = "1. Sprawdź rejestr książek,\n2. Sprawdź rejestr użytkowników,\n3. Sprawdź rejestr autorów,\n4. Sprawdź listę gatunków,\n5. Wróć do menu głównego.";

 static String menu3 = "1. Wybierz z listy dostępne gatunki, które chcesz dodać,\n2. Dodaj wszystkie gatunki od razu,\n3. Wróć do menu głównego.";

  static String gatunki = "1. Fantasy\n2. Dramat\n3. Sensacja\n4. Romans\n5. Kryminał\n6.Thriller\n7. Horror\n8. Dokument\n9. Science Fiction\n10. Komedia";
 
 static String miss = "Błąd wyboru!";
 static String potw = "Operacja zakończona powodzeniem.";

//zaimplementowane listy
public List<Ksiazka> books = new ArrayList<Ksiazka>();
public List<Uzytkownik> users = new ArrayList<Uzytkownik>();
public List<Autor> authors = new ArrayList<Autor>();
public List<String> listaGenre = new ArrayList<String>();

public int setWybor() {
  System.out.println("Aby wybrać, co chcesz zrobić, podaj odpowiedni numer.");
  int wybor = in.nextInt();
  return wybor;
  }

public static String getMenu(int i) { //metoda określająca, jakie menu się pojawi
  switch(i){
    case 1:
      return menuGlowne; 
    case 2:
      return menu1; 
    case 3:
      return menu2;
    case 4:
      return menu3;
    default:
      return miss; 
    }
  }

public String wyborOpcji() {
  switch(setWybor()){
    case 1: //dodanie książki do biblioteki
      System.out.println("Wybrałeś dodanie książki do biblioteki.");
		  System.out.println("Dodanie książki wymaga dodania, tytułu, roku wydania, liczby stron i gatunku.");
      System.out.println(getMenu(2)); //zwrócemie menu2, czyli podmenu dodania książki
        switch(setWybor()){
          case 1: //samodzielne dodawanie elementów obiektu typu Ksiazka
            System.out.println("Podaj tytuł.");
		        String tytul = in.nextLine();
            tytul = in.nextLine();
            System.out.println("Podaj imię Autora.");
            String imie = in.nextLine();
            System.out.println("Podaj nazwisko Autora.");
            String nazwisko = in.nextLine();
            System.out.println("Podaj rok wydania.");
            String rok = in.nextLine();
            System.out.println("Podaj liczbę stron");
            String liczbastron = in.nextLine();
            System.out.println("Podaj gatunek");
            String genre = in.nextLine();
            //utworzenie przez konstruktor obiektu typu Ksiazka
            Autor author = new Autor(imie, nazwisko);
            authors.add(author);
            Ksiazka book = new Ksiazka(tytul, imie, nazwisko, Integer.parseInt(rok), Integer.parseInt(liczbastron), genre, id);
            books.add(book); //dodanie obiektu do rejestru bibliotecznego
            listaGenre.add(gatunek);
            System.out.println(potw);
            System.out.println("***\n" + getMenu(1));
            System.out.println(wyborOpcji());
            break;
          case 2: //utworzenie obiektu typu Ksiazka przez konstruktor domyślny
            Autor author1 = new Autor();
            authors.add(author1);
            Ksiazka book1 = new Ksiazka();
            books.add(book1); //dodanie obiektu do rejestru bibliotecznego
            System.out.println(potw);
            System.out.println("***\n" + getMenu(1));
            System.out.println(wyborOpcji());
            break;
          case 3: //powrót do menu głównego
            System.out.println("***\n" + getMenu(1));
            System.out.println(wyborOpcji());
            break;
          default: //wybranie innej cyfry
            System.out.println(miss);
            System.out.println(wyborOpcji());
          }
        break;
    case 2: //dodanie samego autora do biblioteki
      System.out.println(getMenu(2));
    	switch(setWybor()){
    		case 1: //dodanie autora z palca
    	  	System.out.println("Podaj imię Autora.");
    	  	String imie = in.nextLine();
          imie = in.nextLine();
    	  	System.out.println("Podaj nazwisko Autora.");
    	  	String nazwisko = in.nextLine();
    	  	//utworzenie przez konstruktor sparametryzowany
    	  	Autor author = new Autor(imie, nazwisko);
    	  	System.out.println("Został dodany nowy Autor: \n" + author.toString());
    	  	authors.add(author); //dodanie obiektu do rejestru bibliotecznego
    	  	System.out.println("***\n" + getMenu(1));
    	    System.out.println(wyborOpcji());
    	    break;
    	  case 2: //utworzenie autora przez konstruktor domyślny
    	  	Autor author1 = new Autor();
    	  	System.out.println("Nowy Autor: \n" + author1.toString());
    	  	authors.add(author1);
    	  	System.out.println(getMenu(1));
    	  	System.out.println(wyborOpcji());
    	  	break;
    	  case 3:
    	  	//powrót do menu głównego
    	    System.out.println(getMenu(1));
          System.out.println(wyborOpcji());
          break;
        default: //wybranie innej cyfry
          System.out.println(miss);
          System.out.println(wyborOpcji());
        }
    case 3: //dodanie użytkownika
      System.out.println(getMenu(2));
      switch(setWybor()){ //wybór działania z podmenu
        case 1: //ręczne podanie danych użytkownika
          System.out.println("Podaj imię użytkownika");
          imie = in.nextLine();
          imie = in.nextLine();
          System.out.println("Podaj nazwisko użytkownika");
          nazwisko = in.nextLine();
          System.out.println("Podaj PESEL użytkownika");
          String pesel = in.nextLine();
          System.out.println("Podaj płeć (M/K)");
          String plec = in.nextLine();
          Uzytkownik user = new Uzytkownik(imie, nazwisko, Long.parseLong(pesel), plec.charAt(0));
          System.out.println("Został dodany nowy użytkownik: \n" + user.toString());
          users.add(user); //dodanie użytkownika do listy
          System.out.println("***\n" + getMenu(1));
          System.out.println(wyborOpcji());
          break;
        case 2: //stworzenie użytkownika z konstruktora domyślnego
          Uzytkownik user1 = new Uzytkownik();
          System.out.println("Został dodany nowy użytkownik: \n" + user1.toString());
          users.add(user1); //dodanie użytkownika do listy
          System.out.println("***\n" + getMenu(1));
          System.out.println(wyborOpcji());
          break;
        case 3: //powrót do menu głównego
          System.out.println("***\n" + getMenu(1));
          //switch z wyborem 6 opcji
          System.out.println(wyborOpcji());
          break;
        default: //wybór cyfry spoza menu
          System.out.println(miss);
          System.out.println(wyborOpcji());
        }
      break;
    case 4: //wybór gatunku książki
      System.out.println(getMenu(4));
		  switch(setWybor()){
			  case 1: //samodzielne dodawanie elementów obiektu typu Genre
          System.out.println("Dostępne gatunki to: \n"+ gatunki);
		
			  	System.out.println("Podaj, który gatunek chcesz dodać do rejestru lub naciśnij '0' aby zakończyć dodawanie.\n");
  				//pętla w celu dodawania gatunków
          do {
            String gatunek;
            genreChoice = in.nextInt();
            if (genreChoice == 1)
              gatunek = "Fantasy";
            else if (genreChoice ==2)
              gatunek = "Dramat";
            else if (genreChoice ==3)
              gatunek = "Sensacja";
            else if (genreChoice ==4)
              gatunek = "Romans";
            else if (genreChoice ==5)
              gatunek = "Kryminał";
            else if (genreChoice ==6)
              gatunek = "Thriller";
            else if (genreChoice ==7)
              gatunek = "Horror";
            else if (genreChoice ==8)
              gatunek = "Dokument";
            else if (genreChoice ==9)
              gatunek = "Science Fiction";
            else 
              gatunek = "Komedia";
            listaGenre.add(gatunek);
            System.out.println(potw);
          } while (genreChoice != 0);
      
          System.out.println("Wybrane gatunki zostały dodane do katalogu.");
  				System.out.println("***\n" + getMenu(1));
    		  System.out.println(wyborOpcji());
  	  	  break;
			case 2:
  			gatunek = "Fantasy";
        listaGenre.add(gatunek);
        gatunek = "Dramat";
        listaGenre.add(gatunek);
        gatunek = "Sensacja";
        listaGenre.add(gatunek);
        gatunek = "Romans";
        listaGenre.add(gatunek);
        gatunek = "Kryminał";
        listaGenre.add(gatunek);
        gatunek = "Thriller";
        listaGenre.add(gatunek);
        gatunek = "Horror";
        listaGenre.add(gatunek);
        gatunek = "Dokument";
        listaGenre.add(gatunek);
        gatunek = "Science Fiction";
        listaGenre.add(gatunek);
        gatunek = "Komedia";
        listaGenre.add(gatunek);
        System.out.println(potw);
  	  	System.out.println("***\n" + getMenu(1));
  		  System.out.println(wyborOpcji());
  			break;
      case 3: //powrót do menu głównego
        System.out.println("***\n" + getMenu(1));
        //switch z wyborem 6 opcji
        System.out.println(wyborOpcji());
        break;
      default: //wybór cyfry spoza menu
        System.out.println(miss);
        System.out.println(wyborOpcji());
  			}
      break;
    
    case 5: //sprawdzić rejestr biblioteczny
      System.out.println(getMenu(3));
      switch(setWybor()){
        case 1: //rejestr książek
          System.out.println("Biblioteka zawiera poniższe książki:");
          System.out.println(books);
          System.out.println("***\n" + getMenu(1));
          System.out.println(wyborOpcji());
          break;
        case 2: //rejestr użytkowników
          System.out.println("W bibliotece zarejestrowani są następujący użytkownicy:");
          System.out.println(users);
          System.out.println("***\n" + getMenu(1));
          System.out.println(wyborOpcji());
          break;
        case 3: //rejestr autorów
          System.out.println("Do biblioteki zostali dodani nowi autorzy:");
          System.out.println(authors);
          System.out.println("***\n" + getMenu(1));
          System.out.println(wyborOpcji());
          break;
        case 4: //lista gatunków
          System.out.println("Do biblioteki zostały dodane następujace gatunki:");
          System.out.println(listaGenre);
          System.out.println("***\n" + getMenu(1));
          System.out.println(wyborOpcji());
          break;
        case 5: //powrót do menu głównego
          System.out.println("***\n" + getMenu(1));
          System.out.println(wyborOpcji());
          break;
        default:
          System.out.println(miss);
          System.out.println(wyborOpcji());
      }
    case 6: //zakończenie działania programu
      System.out.println("Dziękujemy za skorzystanie z usług naszej biblioteki. Zapraszamy ponownie!");
      break;
    default: //przypadek wybrania numeru spoza menu
      System.out.println("Został wybrany błędny numer. Spróbuj ponownie.");
      System.out.println(wyborOpcji());
    }
  
    return " ";
  }

  }
