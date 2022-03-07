package data;

public class DataCalendaristica
{
	int an;
	int luna;
	int zi;
	
	public DataCalendaristica(int an, int luna, int zi)
	{
		this.an  = an;
		this.luna  = luna;
		this.zi  = zi;
	}
	
	public void Afisare()
	{
		System.out.println(an + "/" + luna + "/" + zi);
	}
	
	public String toString()
	{
		return an + "/" + luna + "/" + zi;
	}
}
