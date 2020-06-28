package library.class;

/**
W klasie celowo nie zastosowano metod typu get i set. Nie widzielismy potrzeby generowania martwych metod w celu podania/zwrócenia poszczególnych elementów danego obiektu. Nie było planów wykorzystywania tego rodzaju metod. W celu maksymalnego uproszczenia kodu nie zostały one zaimplementowane.
**/
public class Autor {
	  String imie;
	  String nazwisko;

  //konstruktory
  public Autor(){
    imie = "Paulo";
    nazwisko = "Coelho";
  }

  public Autor(String imie, String nazwisko){
    this.imie = imie;
    this.nazwisko = nazwisko;
  }

  //metoda
  public String toString(){
	  return imie + " " + nazwisko;
	  }

}
