package data;


class Adresa
{
	String strada;
	String oras;
	String judet;
}

public class Persoana 
{
	String nume;
	DataCalendaristica dataNasterii;
	Adresa adresa;

	
	public void Afisare()
	{
		System.out.println("Nume persoana " + nume);
	}
}
