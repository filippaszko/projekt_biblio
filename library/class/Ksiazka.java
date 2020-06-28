package library.class;

/**
w klasie Ksiazka celowo zrezygnowaliśmy z wykorzystania konstruktorów typu get i set. Obiekt typu Ksiazka może być utworzony jedynie w całości.
**/
import java.util.Scanner;

public class Ksiazka extends Autor {
	  public int id = 0;
	  public String tytul;
	  public int liczbaStron;
	  public int rokWydania;
	  public String gatunek;

Scanner in = new Scanner(System.in);

//konstruktor
  public Ksiazka(String tytul, String imie, String nazwisko, int rokWydania, int liczbaStron, String gatunek, int id){
    this.tytul = tytul;
    imie = imie;
    nazwisko = nazwisko;
    this.rokWydania = rokWydania;
    this.liczbaStron = liczbaStron;
    this.gatunek = gatunek;
    id += 1;
  }

  public Ksiazka(){
    tytul = "Przykładowy tytuł";
    imie = "Paulo";
    nazwisko = "Coelho";
    rokWydania = 1984;
    liczbaStron = 245;
    gatunek = "proza";
    id += 1;
    }

//weryfikacja, jakie książki znajdują się w rejestrze
  public String toString(){
    return "Tytuł: " + tytul + "\nAutor: " + imie + " " + nazwisko +"\nLiczba Stron: " + liczbaStron + "\nRok wydania: " + rokWydania + "\nGatunek: " + gatunek;
    }

  }
