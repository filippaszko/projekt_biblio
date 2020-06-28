package library.class;

/**
w pełni świadomie zrezygnowaliśmy z metod typu get i set. Możliwość stworzenia użytkownika dostępna jest jedynie z poziomu konstruktorów.
**/

public class Uzytkownik {
	  private String imie;
	  private String nazwisko;
	  private long pesel;
	  private char plec;

//konstruktory
  public Uzytkownik(){
    imie = "Jan";
    nazwisko = "Nowak";
    pesel = 12345678901L;
    plec = 'M';
  }

  public Uzytkownik(String imie, String nazwisko, long pesel, char plec){
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.pesel = pesel;
    this.plec = plec;
  }

//metody
public String toString(){
  return "Użytkownik: " + imie + " " + nazwisko + "\nPESEL: " + pesel + "\nPłeć: " + plec;
  }
}
