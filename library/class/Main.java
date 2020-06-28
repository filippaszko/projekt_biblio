package library.class;

/**
zaimplementowany program służy do obsługi modułu bibliotecznego. W poszczególnych klasach (Autor, Ksiazka, Użytkownik) określone są obiekty uwzgiędniane w programie. Klasa Biblioteka zawiera opisane moduły obsługi programu, aby klasa bazowa Main była bardziej czytelna. Interfejs Genre służy do implementacji gatunków książek.
**/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Witaj w naszej Bibliotece! Poniżej zaprezentujemy Ci wszystkie możliwości działania.");
		System.out.println("W naszej bibliotece możesz:");
		
		Biblioteka bib = new Biblioteka(); //wygenerowanie biblioteki

		System.out.println(bib.getMenu(1)); //zwrócenie menu głównego
		System.out.println();
    
    System.out.println(bib.wyborOpcji()); //implementacja wyboru opcji z menu przez użytkownika, instrukcje sterujące
   
  }
}
